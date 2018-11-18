package com.example.dummyphoto.dao;

import java.util.List;

import com.example.dummyphoto.model.PhotoGrapher;

public interface IUserFollowDao {

	List<PhotoGrapher> getUserFollowingList(PhotoGrapher photoGrapher);

}
