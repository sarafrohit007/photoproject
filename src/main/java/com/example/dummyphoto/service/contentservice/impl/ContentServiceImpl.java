package com.example.dummyphoto.service.contentservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dummyphoto.dao.IContantDao;
import com.example.dummyphoto.model.Content_Info;
import com.example.dummyphoto.model.PhotoGrapher;
import com.example.dummyphoto.service.contentservice.IContentService;

@Service
public class ContentServiceImpl implements IContentService{

	@Autowired
	private IContantDao contentDao;
	
	@Override
	@Transactional
	public List<Content_Info> getPhotographersContent(List<PhotoGrapher> followedList) {
		List<Content_Info> contentInfo = contentDao.getUsersContent(followedList);
		return null;
	}

}
