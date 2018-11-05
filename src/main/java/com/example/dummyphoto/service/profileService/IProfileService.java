package com.example.dummyphoto.service.profileService;

import com.example.dummyphoto.dto.profile.PhotoGrapherProfileRequestDTO;
import com.example.dummyphoto.dto.profile.PhotoGrapherProfileResponseDTO;

public interface IProfileService {

	PhotoGrapherProfileResponseDTO getUserProfile(PhotoGrapherProfileRequestDTO request);

}
