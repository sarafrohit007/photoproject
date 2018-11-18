package com.example.dummyphoto.dto.home;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HomecontentRequestDTO implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 302207474827100048L;

	private String userId;

	private Integer startCount;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getStartCount() {
		return startCount;
	}

	public void setStartCount(Integer startCount) {
		this.startCount = startCount;
	}

}
