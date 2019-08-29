package com.veer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.veer.model.Employee;


@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/create")
	public String create()
	{
//		ModelAndView mv=new ModelAndView();
//		mv.addObject(emp);
		return "created";
	}
}
