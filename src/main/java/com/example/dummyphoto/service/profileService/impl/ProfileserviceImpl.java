package com.example.dummyphoto.service.profileService.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.dummyphoto.dto.profile.PhotoGrapherProfileRequestDTO;
import com.example.dummyphoto.dto.profile.PhotoGrapherProfileResponseDTO;
import com.example.dummyphoto.service.profileService.IProfileService;

public class ProfileserviceImpl implements IProfileService {

	private static final Logger LOG = LoggerFactory.getLogger(ProfileserviceImpl.class);

	@Override
	public PhotoGrapherProfileResponseDTO getUserProfile(PhotoGrapherProfileRequestDTO request) {
		PhotoGrapherProfileResponseDTO photgrapherResponse = new PhotoGrapherProfileResponseDTO();
		try {

		} catch (Exception e) {
			LOG.error("error while getting profile service in ProfileserviceImpl class...{}", e);
		}
		return null;
	}

	@Override
	public void updateUserProfile() {

	}

	@Override
	public void createUserProfile() {

	}

}
