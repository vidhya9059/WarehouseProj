package com.app.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Part;
import com.app.service.IOrderMethodService;
import com.app.service.IPartService;
import com.app.service.IUomTypeService;
import com.app.util.CommonUtil;

@Controller
@RequestMapping("/part")
public class PartController {
	@Autowired
	private IPartService service;
	@Autowired
     private ServletContext contex;
	@Autowired
	private IUomTypeService uomTypeService;
	
	@Autowired
	private IOrderMethodService omsaleService;
	@Autowired
	private IOrderMethodService omPurcService;
	
	
	@RequestMapping("/register")
	public String regPart(@ModelAttribute Part part,ModelMap map) {
		//get child data from db
		List<Object[]> uomlist=uomTypeService.getUomIdAndModels();
		//conver to map
		Map<Integer,String> uoms=CommonUtil.converData(uomlist);
		//send to ui to show as DropDown
		//map.addAttribute("part", new Part());
		map.addAttribute("uoms", uoms);
		List<Object[]> omsales=omsaleService.getOrderIdAndCode("Sale");
		Map<Integer ,String> omsalesMap=CommonUtil.converData(omsales);
		map.addAttribute("sales", omsalesMap);
		
		List<Object[]> ompurchase=omsaleService.getOrderIdAndCode("Purchase");
		Map<Integer ,String> ompurcMap=CommonUtil.converData(ompurchase);
		map.addAttribute("purchases", ompurcMap);
	
		
		return "PartRegister";
		
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String savePart(@ModelAttribute Part part,ModelMap map) {
		Integer id=service.savePart(part);
		String message="part created "+id+"succesfully";
		map.addAttribute("msg", message);
		return "PartRegister";
	}
	@RequestMapping("/all")
	public String getAll(ModelMap map) {
		//call service layer
		List<Part> parts=service.getAllParts();
		map.addAttribute("list",parts);
		//go to UI page
		return "PartData";
	}
	//4. delete Part by id
		@RequestMapping("/delete")
		public String delete(@RequestParam Integer id,ModelMap map) {
			service.deletePart(id);
			//getPart data
			List<Part> parts=service.getAllParts();
			//success message
			String msg="deleted '"+id+"' successfully";
			//send to ui
			map.addAttribute("list",parts);
			map.addAttribute("msg", msg);
			return "PartData";
		}
		
		//show edit page
		@RequestMapping("/edit")
		public String showEdit(@RequestParam Integer id,ModelMap map) {
			//call service
			Part part=service.getOnePart(id);
			map.addAttribute("Part", part);
			return "PartEdit";
		}
		//update part
		@RequestMapping(value="/update",method=RequestMethod.POST)
		public String update(@ModelAttribute Part part,ModelMap map) {
			service.updatePart(part);
			String message="Part '"+part.getId()+"'updated successfully";
			map.addAttribute("msg", message);
			List<Part> parts=service.getAllParts();
			map.addAttribute("list", parts);
			return "PartData";
		}
		//7. view one page
		@RequestMapping("/view")
		public String getOne(@RequestParam Integer id,ModelMap map) {
			Part part=service.getOnePart(id);
			map.addAttribute("ob", part);
			return "PartView";
		}
	
}
