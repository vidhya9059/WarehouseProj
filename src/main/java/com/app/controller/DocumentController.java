package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Document;
import com.app.service.IDocumentService;

@Controller
@RequestMapping("/document")
public class DocumentController {
	@Autowired
	private IDocumentService service;

	// 1. show docs page
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showDoc(ModelMap map) {
		List<Object[]> list = service.getDocumentIdAndName();
		map.addAttribute("list", list);
		return "Documents";

	}

	// on click upload
	@RequestMapping(value ="/upload",method=RequestMethod.POST)
	public String uploadDoc(@RequestParam(required=false) Integer id,
			@RequestParam CommonsMultipartFile fdoc) {
		if (fdoc != null) {
			Document doc=new Document();
			doc.setId(id);
			doc.setFileName(fdoc.getOriginalFilename());
			doc.setFdoc(fdoc.getBytes());
			service.saveDocument(doc);
		}
		return "redirect:register";
	}
	//3.download process
	@RequestMapping("/download")
	public void downloadDoc(@RequestParam Integer id, HttpServletResponse resp) {
		//read object based on id
		Document doc=service.getOneDocument(id);
		//construct head
		resp.addHeader("Content-Disposition", "attachment;filename="+doc.getFileName());
		try {//construct body
			FileCopyUtils.copy(doc.getFdoc(), resp.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
