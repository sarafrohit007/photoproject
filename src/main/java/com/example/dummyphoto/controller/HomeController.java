package com.example.dummyphoto.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dummyphoto.dto.home.HomeContentResponseDTO;
import com.example.dummyphoto.dto.home.HomecontentRequestDTO;
import com.example.dummyphoto.dto.profile.PhotoGrapherProfileRequestDTO;
import com.example.dummyphoto.dto.profile.PhotoGrapherProfileResponseDTO;
import com.example.dummyphoto.service.homeservice.IHomeService;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private IHomeService homeService;
	
	@RequestMapping(method = RequestMethod.GET, value = "getuserprofile")
	@Produces(MediaType.APPLICATION_JSON)
	public HomeContentResponseDTO getPhotoGrapher(@RequestBody HomecontentRequestDTO request) {
		return homeService.getHomeContent(request);
		//return null;
//		PhotoGrapherProfileResponseDTO photoGrapherProfile = h
//		return photoGrapherProfile;
	}
	
	
}
