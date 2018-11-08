package com.example.dummyphoto.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "login_detail", catalog = "photo")
public class LoginDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -4844228024118972093L;

	private Integer id;

	private String gmailId;

	private String facebookLoginId;

	private Date lastLoginAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGmailId() {
		return gmailId;
	}

	public void setGmailId(String gmailId) {
		this.gmailId = gmailId;
	}

	public String getFacebookLoginId() {
		return facebookLoginId;
	}

	public void setFacebookLoginId(String facebookLoginId) {
		this.facebookLoginId = facebookLoginId;
	}

	public Date getLastLoginAt() {
		return lastLoginAt;
	}

	public void setLastLoginAt(Date lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

}