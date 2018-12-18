package com.example.dummyphoto.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dummyphoto.dao.IUserFollowDao;
import com.example.dummyphoto.model.PhotoGrapher;

@Repository("userFolloeDaoImpl")
public class UserFollowDaoImpl implements IUserFollowDao{

	@Override
	public List<PhotoGrapher> getUserFollowingList(PhotoGrapher photoGrapher) {
		Criteria criteria = null;
		criteria.add(Restrictions.eq("", photoGrapher));
		return criteria.list();
	}
	
	

}
