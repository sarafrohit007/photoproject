package com.example.dummyphoto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping("/")
	public String indexPage(){
		return "index";
	}
	
	@RequestMapping("/next")
	public String nextPage(){
		return "next";
	}
	
}
