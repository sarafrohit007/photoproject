package com.example.dummyphoto.dto.home;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HomecontentRequestDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 302207474827100048L;
	
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
