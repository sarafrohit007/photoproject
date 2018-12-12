package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "gmailid")
	public String getGmailId() {
		return gmailId;
	}

	public void setGmailId(String gmailId) {
		this.gmailId = gmailId;
	}

	@Column(name = "facebook_login_id")
	public String getFacebookLoginId() {
		return facebookLoginId;
	}

	public void setFacebookLoginId(String facebookLoginId) {
		this.facebookLoginId = facebookLoginId;
	}

	@Column(name = "last_login_at")
	public Date getLastLoginAt() {
		return lastLoginAt;
	}

	public void setLastLoginAt(Date lastLoginAt) {
		this.lastLoginAt = lastLoginAt;
	}

}
