package com.example.dummyphoto.dao;

import com.example.dummyphoto.model.PhotoGrapher;

public interface IProfileDao {

	void getUserByGMailLogin();

	PhotoGrapher getUserByUserId(Integer userId);
	
	

}
