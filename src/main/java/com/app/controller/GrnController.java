package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Grn;
import com.app.service.IGrnService;
@Controller
@RequestMapping("grn")
public class GrnController {
	@Autowired
     private IGrnService service;
	 @RequestMapping("/create")
	public String createGrn(ModelMap map) {
		 map.addAttribute("grn",new Grn());
		return "GrnRegister";
	}
	//save dataclick on submit
	 @RequestMapping(value="/save",method=RequestMethod.POST)
	 public String savePurchase(@ModelAttribute Grn grn,ModelMap map) {
	 Integer id=service.saveGrn(grn);
	 //construct message
	 String message="Grn '"+id+"'created";
	 map.addAttribute("grn",new Grn());
	 map.addAttribute("msg",message);
	 return "GrnRegister";

	 }
	
}