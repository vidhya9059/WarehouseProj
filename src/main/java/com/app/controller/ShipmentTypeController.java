package com.app.controller;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
import com.app.util.ShipmentTypeUtil;
import com.app.view.ShipmentTypeExcelView;
import com.app.view.ShipmentTypePdfView;
@Controller
@RequestMapping("/shipmenttype")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	@Autowired
	private ServletContext context;
	@Autowired
	private ShipmentTypeUtil util;
	//1 show register page
	@RequestMapping("/register")
	public String showReg() {
		return "ShipmentTypeRegister";
	}
	//save data on click submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute ShipmentType shipmentType,ModelMap map) {
		//call service layer
		Integer id=service.saveShipmentType(shipmentType);
		//construct success message
		String message="ShipmentType '"+id+"' created";
		//send mesage to UI
		map.addAttribute("msg", message);
		return "ShipmentTypeRegister";
	}
	@RequestMapping("/all")
	public String getAll(ModelMap map) {
		//call service layer
		List<ShipmentType> shipments=service.getAllShipmentTypes();
		map.addAttribute("list",shipments);
		//go to UI page
		return "ShipmentTypeData";
	}
	//4. delete shipmenttype by id
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id,ModelMap map) {
		service.deleteShipmentType(id);
		//getshipment data
		List<ShipmentType> shipmenttypes=service.getAllShipmentTypes();
		//success message
		String msg="deleted '"+id+"' successfully";
		//send to ui
		map.addAttribute("list",shipmenttypes);
		map.addAttribute("msg", msg);
		return "ShipmentTypeData";
	}
	//show edit page
	@RequestMapping("/edit")
	public String showEdit(@RequestParam Integer id,ModelMap map) {
		//call service
		ShipmentType shipmenttype=service.getOneShipmentType(id);
		map.addAttribute("ShipmentType", shipmenttype);
		return "ShipmentTypeEdit";
	}
	//update shipmenttype
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute ShipmentType shipmentType,ModelMap map) {
		service.updateShipmentType(shipmentType);
		String message="ShipmentType '"+shipmentType.getId()+"'updated successfully";
		map.addAttribute("msg", message);
		List<ShipmentType> shipments=service.getAllShipmentTypes();
		map.addAttribute("list", shipments);
		return "ShipmentTypeData";
	}
	//7. view one page
	@RequestMapping("/view")
	public String getOne(@RequestParam Integer id,ModelMap map) {
		ShipmentType shipmentType=service.getOneShipmentType(id);
		map.addAttribute("ob", shipmentType);
		return "ShipmentTypeView";
	}

	//8. excel view
	@RequestMapping("/excel")
	public ModelAndView exportExcel() {
		List<ShipmentType> shipments=service.getAllShipmentTypes();
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		m.addObject("list", shipments);
		return m;
	}
	//9. export to pdf
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(required=false) Integer id) {
		List<ShipmentType> shipments=null;
		if(id==null)
			shipments=service.getAllShipmentTypes();
		else
			shipments=Arrays.asList(service.getOneShipmentType(id));
		//read data from db
		ModelAndView m=new ModelAndView();
		m.setView(new ShipmentTypePdfView());
		m.addObject("list", shipments);
		return m;
	}
	//10 generate charts
	@RequestMapping("/charts")
	public String generateCharts() {
		List<Object[]> list=service.getShipmentModeAndCount();
		String path=context.getRealPath("/");
		util.generatePie(path, list);
		return "ShipmentModePie";
	}

}