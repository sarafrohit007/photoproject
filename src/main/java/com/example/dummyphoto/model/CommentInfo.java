package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class CommentInfo implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 2426047702606982390L;

	private Integer id;

	private CommentInfo parentId;

	private Set<CommentInfo> childCommentsList;

	private Date postedAt;

	private Set<PhotoGrapher> likedBy;

	private Date updatedAt;

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

	@ManyToOne(fetch = FetchType.EAGER)
	@Column(name = "followingUser")
	public CommentInfo getParentId() {
		return parentId;
	}

	public void setParentId(CommentInfo parentId) {
		this.parentId = parentId;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@Column(name = "child_comments_list")
	public Set<CommentInfo> getChildCommentsList() {
		return childCommentsList;
	}

	public void setChildCommentsList(Set<CommentInfo> childCommentsList) {
		this.childCommentsList = childCommentsList;
	}

	@Column(name = "postedat")
	public Date getPostedAt() {
		return postedAt;
	}

	public void setPostedAt(Date postedAt) {
		this.postedAt = postedAt;
	}

	@OneToMany(fetch = FetchType.LAZY)
	public Set<PhotoGrapher> getLikedBy() {
		return likedBy;
	}

	public void setLikedBy(Set<PhotoGrapher> likedBy) {
		this.likedBy = likedBy;
	}

	@Column(name = "updatedat")
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Column(name = "content_info")
	@ManyToOne(fetch = FetchType.EAGER)
	public Content_Info getContentInfo() {
		return contentInfo;
	}

	public void setContentInfo(Content_Info contentInfo) {
		this.contentInfo = contentInfo;
	}

	@Override
	public String toString() {
		return "CommentInfo [id=" + id + ", parentId=" + parentId + ", childCommentsList=" + childCommentsList
				+ ", postedAt=" + postedAt + ", likedBy=" + likedBy + ", updatedAt=" + updatedAt + ", contentInfo="
				+ contentInfo + "]";
	}

}
