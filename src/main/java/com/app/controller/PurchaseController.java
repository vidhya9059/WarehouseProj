package com.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Purchase;
import com.app.model.PurchaseDtl;
//import com.app.model.PurchaseDtl;
import com.app.service.IPartService;
import com.app.service.IPurchaseService;
import com.app.service.IShipmentTypeService;
import com.app.service.IWhUserTypeService;
import com.app.util.CommonUtil;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {
	@Autowired
	private IPurchaseService service;
	@Autowired
	private IShipmentTypeService shipmentTypeServie;
	@Autowired
	private IWhUserTypeService whUserTypeService;
	/*@Autowired
	private IPartService partService;
	*/
	@RequestMapping("/register")
	public String registerPurchase(ModelMap map) {
	List<Object[]> shipslist=shipmentTypeServie.getShipmentTypeIdAndCode();
		//convert to map
          Map<Integer,String> ships=CommonUtil.converData(shipslist);
		//send to ui show as dropdown
          map.addAttribute("ships",ships);
          
          List<Object[]> whusers=whUserTypeService.getWhUserTypeIdAndCode("Vendor");
          Map<Integer, String> usersMap=CommonUtil.converData(whusers);
          map.addAttribute("whusers", usersMap);
		map.addAttribute("purchase",new Purchase());
		Purchase p=new Purchase();
		p.setDefaultStatus("OPEN");
		map.addAttribute("purchase", p);
		return "PurchaseRegister";

	}
	//save dataclick on submit
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String savePurchase(@ModelAttribute Purchase purchase,ModelMap map) {
		Integer id=service.savePurchase(purchase);
		//construct message
		String message="Purchase '"+id+"'created";
			map.addAttribute("msg",message);
		return "PurchaseRegister";
	}
		@RequestMapping("/all")
	public String getAll(ModelMap map) {
		//make service layer
		List<Purchase> purchases=service.getAllPurchases();
		//send data to ui
		map.addAttribute("list", purchases);
		//go to ui
		return "PurchaseData";
		
	}
		@RequestMapping("/parts")
		public String showParts(@RequestParam Integer id,ModelMap map) {
			//form backing object
			map.addAttribute("purchaseDtl", new PurchaseDtl());
			//List<Object[]> parts=partService.getPartIdAndCodes();
			//Map<Integer, String> partsMap=CommonUtil.converData(parts);
			//map.addAttribute("parts", partsMap);
			
			
			return "PurchaseParts";
		}
	
}
