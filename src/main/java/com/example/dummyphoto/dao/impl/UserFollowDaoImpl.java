package com.example.dummyphoto.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.example.dummyphoto.dao.IUserFollowDao;
import com.example.dummyphoto.model.PhotoGrapher;

public class UserFollowDaoImpl implements IUserFollowDao{

	@Override
	public List<PhotoGrapher> getUserFollowingList(PhotoGrapher photoGrapher) {
		Criteria criteria = null;
		criteria.add(Restrictions.eq("", photoGrapher));
		return criteria.list();
	}
	
	

}
