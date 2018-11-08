package com.example.dummyphoto.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.dummyphoto.dao.IProfileDao;

@Repository("profileDaoImpl")
public class ProfileDaoImpl implements IProfileDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		
	@Override
	public void getUserByGMailLogin() {
		
	}

}
