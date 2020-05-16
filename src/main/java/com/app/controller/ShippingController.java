package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Shipping;
import com.app.service.IShippingService;
@Controller
@RequestMapping("/shipping")
public class ShippingController {
	@Autowired
	private IShippingService service;
     @RequestMapping("/register")
	public String regShipping() {
    	return "ShippingRegister";
    }
     @RequestMapping(value="/save",method=RequestMethod.POST)
     public String saveShipping(@ModelAttribute Shipping shipping,ModelMap map) {
    	  Integer id=service.saveShipping(shipping);
    	  String message="shipping created"+id+"successfully";
    	  map.addAttribute("message",message);
    	 return "ShippingRegister";
     }
}
