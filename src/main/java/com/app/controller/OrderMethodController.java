package com.app.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.app.model.OrderMethod;
import com.app.service.IOrderMethodService;
import com.app.view.OrderMethodExcelView;
import com.app.view.OrderMethodPdfView;
@Controller
@RequestMapping("/ordermethod")
public class OrderMethodController {
	@Autowired
	private IOrderMethodService service;
	//1 show register page
	@RequestMapping("/register")
	public String showReg() {
		return "OrderMethodRegister";
	}
	//2.save data on click submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute OrderMethod orderMethod,ModelMap map) {
		Integer id=service.saveOrderMethod(orderMethod);
		//construct success msg
		String message="OrderMethod '"+id+"'created";
		//send msg to ui
		map.addAttribute("msg", message);

		return "OrderMethodRegister";

	}
	//get all
	@RequestMapping("/all")
	public String getAll(ModelMap map) {
		//make service layer call
		List<OrderMethod> omethods=service.getAllOrderMethods();
		//send data to ui
		map.addAttribute("list", omethods);
		//goto
		return "OrderMethodData";
	}
	//4.delete data
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id,ModelMap map) {
		//call service
		service.deleteOrderMethod(id);
		//get new data
		List<OrderMethod> ordermethods=service.getAllOrderMethods();
		//success message
		String msg="deleted '"+id+"' successfully";
		map.addAttribute("list",ordermethods);
		map.addAttribute("msg",msg);
		return "OrderMethodData";
	}
	//5.show edit page
	@RequestMapping("/edit")
	public String showEdit(@RequestParam Integer id,ModelMap map) {
		//call service
		OrderMethod omethod=service.getOneOrderMethod(id);
		map.addAttribute("OrderMethod", omethod);
		return "OrderMethodEdit";
	}
	//update 

	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(@ModelAttribute OrderMethod orderMethod,ModelMap map) {
		service.updateOrderMethod(orderMethod);
		String message="OrderMethod '"+orderMethod.getId()+"'updated successfully ";
		map.addAttribute("msg", message);
		List<OrderMethod> omethods=service.getAllOrderMethods();
		map.addAttribute("list", omethods); 

		return "OrderMethodData";

	}
	//view one page
	@RequestMapping("/view")
	public String getOne(@RequestParam Integer id,ModelMap map) {
		OrderMethod orderMethod=service.getOneOrderMethod(id);
		map.addAttribute("ob",orderMethod);
		return "OrderMethodView";

	}


	//8. excel view

	@RequestMapping("/excel")
	public ModelAndView exportExcel() {
		List<OrderMethod> ordermethods=service.getAllOrderMethods();
		ModelAndView m=new ModelAndView();
		m.setView(new OrderMethodExcelView());
		m.addObject("list", ordermethods);


		return m;

	}

	@RequestMapping("/pdf")
	public ModelAndView showPdf(@RequestParam(required=false) Integer id) {
		List<OrderMethod> omds=null;
		if(id==null)
			omds=service.getAllOrderMethods();
		else
			omds=Arrays.asList(service.getOneOrderMethod(id));
		//read data from db
		ModelAndView m=new ModelAndView();
		m.setView(new OrderMethodPdfView());
		m.addObject("list", omds);
		return m;
	}

}


