package com.example.dummyphoto.dao;

import java.util.List;

import com.example.dummyphoto.model.Content_Info;
import com.example.dummyphoto.model.PhotoGrapher;

public interface IContantDao {

	List<Content_Info> getUsersContent(List<PhotoGrapher> followedList);

}
