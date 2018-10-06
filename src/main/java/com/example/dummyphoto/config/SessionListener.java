package com.example.dummyphoto.config;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener{

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("==== Session is created ====");
		event.getSession().setMaxInactiveInterval(5*60);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		System.out.println("===== Session is Destroyed =====");
	}

}
