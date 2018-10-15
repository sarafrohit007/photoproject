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
	public ModelAndView indexPage(){
		System.out.println("Printing IndexPage....");
		ModelAndView mav = new ModelAndView("views/index");
		mav.addObject("message", "Rohit Saraf");
		return mav;
	}
	
	@RequestMapping("/next")
	public String nextPage(){
		return "views/next";
	}
	
	@RequestMapping(value="/invalidsession")
	public String invalidSession(){
		return "views/invalidsession";
	}
	
	@RequestMapping("/login")
	public String login(){
		System.out.println("Inside Login Page....");
		return "views/google-login";
	}
	
}
	