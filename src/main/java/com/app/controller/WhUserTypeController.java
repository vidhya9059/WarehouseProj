package com.app.controller;
import java.util.Arrays;
import java.util.List;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;


import com.app.model.WhUserType;
import com.app.service.IWhUserTypeService;
import com.app.util.EmailUtil;
import com.app.view.WhUserTypeExcelView;
import com.app.view.WhUserTypePdfView;
@Controller
@RequestMapping("/whusertype")
public class WhUserTypeController {
	@Autowired
	private IWhUserTypeService service;
	
	@Autowired
	private EmailUtil emailUtil;
	
	
	
	@RequestMapping("/register")
	
	public String showRegi() {
		return "WhUserTypeRegister";
	}
	//2.save data on click submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@ModelAttribute WhUserType whUserType,@RequestParam CommonsMultipartFile fileDoc,ModelMap map) {
		//call service layer
		Integer id=service.saveWhUserType(whUserType);
		
		map.addAttribute("whUserType",new WhUserType());
		//constructor success message
		String msg="WhUserType created with id: '"+id;
		String text="Hello :"+whUserType.getUserCode()+", you are :"+whUserType.getUserType()+", you can have :"+whUserType.getUserFor();
		//map.addAttribute("msg", message);
		boolean isSent=emailUtil.send(whUserType.getUserEmail(),"welcome to warehouse app",text,null, null, fileDoc.getSize()!=0?fileDoc:null);
		if(isSent) {
			msg+=", email also sent";
		}
		else {
			msg+=", email sending failed"; 
		}
		map.addAttribute("message", msg);
		return "WhUserTypeRegister";
		
	}
	@RequestMapping("/all")
	public String getAll(ModelMap map) {
		//make service layer
		List<WhUserType> usertypes=service.getAllWhUserTypes();
		//send data to ui
		map.addAttribute("list", usertypes);
		//go to ui
		return "WhUserTypeData";
		
	}
	//delete
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id,ModelMap map) {
		//call service
		service.deleteWhUserType(id);
		//get all
		List<WhUserType> usertypes=service.getAllWhUserTypes();
		//success message
		String message="WhUserType '"+id+"' deleted successfully";
		//send to ui
		map.addAttribute("list", usertypes);
		map.addAttribute("msg",message);
		return "WhUserTypeData";
	}
	@RequestMapping("/edit")
	public String getOne(@RequestParam Integer id,ModelMap map) {
		WhUserType usertype=service.getOneWhUserType(id);
		map.addAttribute("whUserType", usertype);
		return "WhUserTypeEdit";
	}
	//update
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateWh(@RequestParam WhUserType whUserType,ModelMap map) {
		service.updateWhUserType(whUserType);
		String message="whUserType updated'"+whUserType.getId()+"'successfully";
		map.addAttribute("msg", message);
		List<WhUserType> usertypes=service.getAllWhUserTypes();
		map.addAttribute("list", usertypes);
		return "WhUserTypeData";
	}
	/*//7.view one page
		@RequestMapping("/view")
		public String getOne(@RequestParam Integer id,ModelMap map) {
		WhUserType usertype=service.getOneWhUserType(id);
		map.addAttribute("ob",usertype);
		return "WhUserTypeView";
		}
	*/
	//8. excel view
	
		@RequestMapping("/excel")
		public ModelAndView exportExcel() {
			List<WhUserType> utypes=service.getAllWhUserTypes();
			ModelAndView m=new ModelAndView();
			m.setView(new WhUserTypeExcelView());
			m.addObject("list", utypes);
			
			
			return m;
			
		}
		//9. export to pdf
		@RequestMapping("/pdf")
		public ModelAndView showPdf(@RequestParam(required=false) Integer id) {
			List<WhUserType> utypes=null;
			if(id==null)
				utypes=service.getAllWhUserTypes();
			else
				utypes=Arrays.asList(service.getOneWhUserType(id));
			//read data from db
			ModelAndView m=new ModelAndView();
			m.setView(new WhUserTypePdfView());
			m.addObject("list", utypes);
			return m;
			
		}
		
		
   
}
