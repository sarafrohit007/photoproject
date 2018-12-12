package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_following_information", catalog = "photo")
public class User_Following_Information implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -6280459079114984498L;

	private Integer id;

	private PhotoGrapher followingUser;

	private PhotoGrapher followedUser;

	private boolean status;

	private Date followedDate;

	private Date updated;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "followingUser", nullable = false)
	public PhotoGrapher getFollowingUser() {
		return followingUser;
	}

	public void setFollowingUser(PhotoGrapher followingUser) {
		this.followingUser = followingUser;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "followedUser", nullable = false)
	public PhotoGrapher getFollowedUser() {
		return followedUser;
	}

	public void setFollowedUser(PhotoGrapher followedUser) {
		this.followedUser = followedUser;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name = "followed_date")
	public Date getFollowedDate() {
		return followedDate;
	}

	public void setFollowedDate(Date followedDate) {
		this.followedDate = followedDate;
	}

	@Column(name = "updated")
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "User_Following_Information [id=" + id + ", followingUser=" + followingUser + ", followedUser="
				+ followedUser + ", status=" + status + ", followedDate=" + followedDate + ", updated=" + updated + "]";
	}

}
