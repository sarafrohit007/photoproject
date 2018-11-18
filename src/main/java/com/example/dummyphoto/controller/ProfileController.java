package com.example.dummyphoto.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.dummyphoto.dto.profile.PhotoGrapherProfileRequestDTO;
import com.example.dummyphoto.dto.profile.PhotoGrapherProfileResponseDTO;
import com.example.dummyphoto.service.profileService.IProfileService;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	private IProfileService profileService;

	@RequestMapping(method = RequestMethod.GET, value = "getuserprofile")
	@Produces(MediaType.APPLICATION_JSON)
	public PhotoGrapherProfileResponseDTO getPhotoGrapher(@RequestBody PhotoGrapherProfileRequestDTO request) {
		PhotoGrapherProfileResponseDTO photoGrapherProfile = profileService.getUserProfile(request);
		return photoGrapherProfile;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "updateuserprofile")
	@Produces(MediaType.APPLICATION_JSON)
	public PhotoGrapherProfileResponseDTO updateUserProfile(@RequestBody PhotoGrapherProfileRequestDTO request) {
		profileService.updateUserProfile();
		return null;
	}

	@RequestMapping(method = RequestMethod.POST, value = "createuserprofile")
	@Produces(MediaType.APPLICATION_JSON)
	public PhotoGrapherProfileResponseDTO createUserProfile(@RequestBody PhotoGrapherProfileRequestDTO request) {
		profileService.createUserProfile();
		return null;
	}
}
