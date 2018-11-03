package com.example.dummyphoto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dummyphoto.model.PhotoGrapher;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	public PhotoGrapher getPhotoGrapher(){
		return null;
	}
	
}
