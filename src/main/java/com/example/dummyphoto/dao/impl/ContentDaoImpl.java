package com.example.dummyphoto.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.example.dummyphoto.dao.IContantDao;
import com.example.dummyphoto.model.Content_Info;
import com.example.dummyphoto.model.PhotoGrapher;

public class ContentDaoImpl implements IContantDao{

	@Override
	public List<Content_Info> getUsersContent(List<PhotoGrapher> followedList) {
		Criteria criteria = null;
		criteria.add(Restrictions.in("", followedList));
		return null;
	}

}
