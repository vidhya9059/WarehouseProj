package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.User;
import com.app.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
    private IUserService service;
   @RequestMapping("/register")
    public String userReg(@ModelAttribute User user,ModelMap map) {
	  map.addAttribute("user",new User());
	   return "UserRegister";
   }
   @RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUsers(@ModelAttribute User user,ModelMap map) {
		Integer id=service.saveUser(user);
		//construct message
		String message="user '"+id+"'created";
			map.addAttribute("msg",message);
		return "UserRegister";
	}
}
