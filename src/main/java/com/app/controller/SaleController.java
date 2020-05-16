package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Sale;
import com.app.service.ISaleService;
@Controller
@RequestMapping("/sale")
public class SaleController {
	@Autowired
	private ISaleService service;
	@RequestMapping("/register")
    public String saleRegister(ModelMap map) {
    	map.addAttribute("sale", new Sale());
		return "SaleRegister";
    }
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String saveSale(@ModelAttribute Sale sale,ModelMap map) {
		   Integer id=service.saveSale(sale);
		   String message="Sale created '"+id+"'successfully";
		   map.addAttribute("sale", new Sale());
		   map.addAttribute("msg", message);
    	return "SaleRegister";
	}
}
