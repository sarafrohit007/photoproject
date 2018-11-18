package com.example.dummyphoto.service.homeservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dummyphoto.dao.IProfileDao;
import com.example.dummyphoto.dao.IUserFollowDao;
import com.example.dummyphoto.dto.home.HomeContentResponseDTO;
import com.example.dummyphoto.dto.home.HomecontentRequestDTO;
import com.example.dummyphoto.model.Content_Info;
import com.example.dummyphoto.model.PhotoGrapher;
import com.example.dummyphoto.service.contentservice.IContentService;
import com.example.dummyphoto.service.homeservice.IHomeService;

public class HomeServiceImpl implements IHomeService{
	
	@Autowired
	private IProfileDao profileDao;
	
	@Autowired
	private IUserFollowDao userFollowDao;
	
	@Autowired
	private IContentService contentService;

	@Override
	public HomeContentResponseDTO getHomeContent(HomecontentRequestDTO request) {
		Integer userId = Integer.parseInt(request.getUserId());
		PhotoGrapher photoGrapher = profileDao.getUserByUserId(userId);
		List<PhotoGrapher> followedList = userFollowDao.getUserFollowingList(photoGrapher);
		List<Content_Info> contentInfoList = contentService.getPhotographersContent(followedList);
		return null;
	}

}
