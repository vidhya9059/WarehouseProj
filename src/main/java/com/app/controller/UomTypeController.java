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

import com.app.model.UomType;
import com.app.service.IUomTypeService;
import com.app.util.UomTypeUtil;
import com.app.view.UomTypeExcelView;
import com.app.view.UomTypePdfView;

@Controller
@RequestMapping("/uom")

public class UomTypeController {
	@Autowired 
	private IUomTypeService service;
	@Autowired
	private ServletContext context;
	
	@Autowired
	private UomTypeUtil util;
	// show register page
	@RequestMapping("/register")
	public String showReg() {
		return "UomRegister";
	}
	//save date on click submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute UomType uomType,ModelMap map) {
		//call service layer
		Integer id=service.saveUomType(uomType);
		//construct success massage
		String msg="uom  '"+id+"'created";
		//send message to ui
		map.addAttribute("message", msg);
		return "UomRegister";
	}
	@RequestMapping("/all")

	public String getAll(ModelMap map) {
		//make service layer to call
		List<UomType> uoms=service.getAllUomTypes();
		//send data to ui
		map.addAttribute("list", uoms);
		// go to ui
		return "UomData";

	}
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id,ModelMap map) {
		//call service
		service.deleteUomType(id);
		//get new data
		List<UomType> uoms=service.getAllUomTypes();
		//success message
		String msg="delete '"+id+"' successfully";
		//send to ui
		map.addAttribute("list", uoms);
		map.addAttribute("msg", msg);
		
		
		
		return "UomData";
	}
	//show edit page 
	@RequestMapping("/edit")
	public String showEdit(@RequestParam Integer id,ModelMap map) {
		//call service 
		UomType u=service.getOneUomType(id);
		map.addAttribute("uom", u);
		return "UomTypeEdit";
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
   public String update(@ModelAttribute UomType uomType,ModelMap map) {
	   service.updateUomType(uomType);
	  String message="uomtype '"+uomType.getId()+"' updated successfully";
	   map.addAttribute("msg",message);
	   List<UomType> uoms=service.getAllUomTypes();
	   map.addAttribute("list", uoms);
	   return "UomData";
   }
	//7.view one page
	@RequestMapping("/view")
	public String getOne(@RequestParam Integer id,ModelMap map) {
	UomType uom=service.getOneUomType(id);
	map.addAttribute("ob",uom);
	return "UomView";
	}
	//8. excel view
	
	@RequestMapping("/excel")
	public ModelAndView exportExcel() {
		List<UomType> uoms=service.getAllUomTypes();
		ModelAndView m=new ModelAndView();
		m.setView(new UomTypeExcelView());
		m.addObject("list", uoms);
		
		
		return m;
		
	}
	//9. export to pdf
	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(required=false) Integer id) {
		List<UomType> uoms=null;
		if(id==null)
			uoms=service.getAllUomTypes();
		else
			uoms=Arrays.asList(service.getOneUomType(id));
		//read data from db
		ModelAndView m=new ModelAndView();
		m.setView(new UomTypePdfView());
		m.addObject("list", uoms);
		return m;
		
	}
	//generate charts
	 @RequestMapping("/charts")
	public String generateCharts() {
	List<Object[]> list=service.getUomTypeAndCount();
	String path=context.getRealPath("/");
	util.generatePie(path,list);
	util.generateBar(path, list);
	return "UomTypeCharts";
	}
	
}

