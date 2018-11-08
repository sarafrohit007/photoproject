package com.example.dummyphoto.service.loginService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dummyphoto.dao.IProfileDao;
import com.example.dummyphoto.service.loginService.ILoginService;
import com.example.dummyphoto.service.util.StringUtils;

@Service
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private IProfileDao profileDao;

	@Override
	public void getLoginResponseFromGmailId(String googleEmailId) {
		if (StringUtils.isNotEmpty(googleEmailId)) {
			profileDao.getUserByGMailLogin();
		}
	}

}
