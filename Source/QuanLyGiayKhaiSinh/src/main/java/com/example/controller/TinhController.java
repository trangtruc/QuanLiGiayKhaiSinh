package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Tinh;
import com.example.service.TinhServiceImpl;
@Controller
public class TinhController {
	
	@Autowired
	TinhServiceImpl tinh;
	
	@RequestMapping(value="/Tinh")
	public String them(Model model){
		
		model.addAttribute("Tinh", new Tinh());
		
		
		return "Tinh";
	}
	
	
	@RequestMapping(value="/themtinh")
	public String xulythem(@ModelAttribute Tinh tk){
		
		tinh.them(tk);
		return "redirect:/Tinh";
	}

}
