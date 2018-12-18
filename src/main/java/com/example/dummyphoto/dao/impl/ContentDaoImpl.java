package com.example.dummyphoto.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.example.dummyphoto.dao.IContantDao;
import com.example.dummyphoto.model.Content_Info;
import com.example.dummyphoto.model.PhotoGrapher;
import com.example.dummyphoto.util.Constants;

@Repository("contentDaoImpl")
public class ContentDaoImpl implements IContantDao{

	@Override
	public List<Content_Info> getUsersContent(List<PhotoGrapher> followedList, Integer startCount) {
		Criteria criteria = null;
		criteria.add(Restrictions.in("postedBy", followedList));
		criteria.setMaxResults(Constants.HOME_CONTENT_SINGLE_QUERY_COUNT);
		//criteria.
		criteria.addOrder(Order.desc("posted"));
		return criteria.list();
	}

}
