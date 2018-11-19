package com.example.dummyphoto.service.contentservice;

import java.util.List;

import com.example.dummyphoto.dto.home.HomecontentRequestDTO;
import com.example.dummyphoto.model.Content_Info;
import com.example.dummyphoto.model.PhotoGrapher;

public interface IContentService {

	List<Content_Info> getPhotographersContent(List<PhotoGrapher> followedList, HomecontentRequestDTO request);

}
