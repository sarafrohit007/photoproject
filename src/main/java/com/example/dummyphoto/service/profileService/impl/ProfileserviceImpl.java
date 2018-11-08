package com.example.dummyphoto.service.profileService.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.dummyphoto.dto.profile.PhotoGrapherProfileRequestDTO;
import com.example.dummyphoto.dto.profile.PhotoGrapherProfileResponseDTO;
import com.example.dummyphoto.service.loginService.ILoginService;
import com.example.dummyphoto.service.profileService.IProfileService;

public class ProfileserviceImpl implements IProfileService {

	private static final Logger LOG = LoggerFactory.getLogger(ProfileserviceImpl.class);
	
	@Autowired
	private ILoginService loginService;

	@Override
	public PhotoGrapherProfileResponseDTO getUserProfile(PhotoGrapherProfileRequestDTO request) {
		PhotoGrapherProfileResponseDTO photgrapherResponse = new PhotoGrapherProfileResponseDTO();
		try {
			loginService.getLoginResponseFromGmailId(request.getGoogleEmailId());
		} catch (Exception e) {
			LOG.error("error while getting profile service in ProfileserviceImpl class...{}", e);
		}
		return photgrapherResponse;
	}

	@Override
	public void updateUserProfile() {

	}

	@Override
	public void createUserProfile() {

	}

}
