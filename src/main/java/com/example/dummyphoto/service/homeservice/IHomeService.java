package com.example.dummyphoto.service.homeservice;

import com.example.dummyphoto.dto.home.HomeContentResponseDTO;
import com.example.dummyphoto.dto.home.HomecontentRequestDTO;

public interface IHomeService {

	HomeContentResponseDTO getHomeContent(HomecontentRequestDTO request);

}
