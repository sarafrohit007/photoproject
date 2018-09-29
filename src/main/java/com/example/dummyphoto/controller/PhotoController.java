package com.example.dummyphoto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class PhotoController {

	@RequestMapping("/result")
	@ResponseBody
	public String printResult(){
		return "Success";
	}
	
	
	@RequestMapping("/result1")
	@ResponseBody
	public String printResult1(){
		return "Success1";
	}
	
	@RequestMapping("/index")
	public String indexPage(){
		return "views/index";
	}
	
	@RequestMapping("/next")
	public String nextPage(){
		return "views/next";
	}
	
}
