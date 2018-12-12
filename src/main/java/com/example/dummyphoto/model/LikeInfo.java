package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class LikeInfo implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -4776609665607678483L;

	private Integer id;

	private Date likedAt;

	private Date updatedAt;

	private boolean status;

	private Content_Info contentInfo;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "likedAt", nullable = false)
	public Date getLikedAt() {
		return likedAt;
	}

	public void setLikedAt(Date likedAt) {
		this.likedAt = likedAt;
	}

	@Column(name = "updatedAt", nullable = false)
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "contentInfo", nullable = false)
	public Content_Info getContentInfo() {
		return contentInfo;
	}

	public void setContentInfo(Content_Info contentInfo) {
		this.contentInfo = contentInfo;
	}

	@Override
	public String toString() {
		return "LikeInfo [id=" + id + ", likedAt=" + likedAt + ", updatedAt=" + updatedAt + ", status=" + status
				+ ", contentInfo=" + contentInfo + "]";
	}

}
