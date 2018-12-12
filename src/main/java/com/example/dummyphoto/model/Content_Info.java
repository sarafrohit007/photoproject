package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.type.descriptor.java.JavaTypeDescriptorRegistry.FallbackJavaTypeDescriptor;

import com.example.dummyphoto.enums.MediaType;

@Entity
@Table(name = "content_info", catalog = "photo")
public class Content_Info implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -6990313529552167548L;

	private Integer id;

	private String mediaPath;

	private String mediaType;

	private BigInteger fileSize;

	private Set<LikeInfo> likeInfoList;

	private Set<CommentInfo> commentsInfoList;

	private Date posted;

	private Date updated;

	private PhotoGrapher postedBy;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "media_path", nullable = false)
	public String getMediaPath() {
		return mediaPath;
	}

	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}

	@Column(name = "media_type", nullable = false)
	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	@Column(name = "file_size", nullable = false, columnDefinition = "int(16)")
	public BigInteger getFileSize() {
		return fileSize;
	}

	public void setFileSize(BigInteger fileSize) {
		this.fileSize = fileSize;
	}

	@Column(name = "like_info_list")
	@OneToMany(fetch = FetchType.LAZY)
	public Set<LikeInfo> getLikeInfoList() {
		return likeInfoList;
	}

	public void setLikeInfoList(Set<LikeInfo> likeInfoList) {
		this.likeInfoList = likeInfoList;
	}

	@Column(name = "comments_info_list")
	@OneToMany(fetch = FetchType.LAZY)
	public Set<CommentInfo> getCommentsInfoList() {
		return commentsInfoList;
	}

	public void setCommentsInfoList(Set<CommentInfo> commentsInfoList) {
		this.commentsInfoList = commentsInfoList;
	}

	@Column(name = "posted", nullable = false)
	public Date getPosted() {
		return posted;
	}

	public void setPosted(Date posted) {
		this.posted = posted;
	}

	@Column(name = "updated")
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Column(name = "posted_by")
	@ManyToOne(fetch = FetchType.EAGER)
	public PhotoGrapher getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(PhotoGrapher postedBy) {
		this.postedBy = postedBy;
	}

	@Override
	public String toString() {
		return "Content_Info [id=" + id + ", mediaPath=" + mediaPath + ", mediaType=" + mediaType + ", fileSize="
				+ fileSize + ", likeInfoList=" + likeInfoList + ", commentsInfoList=" + commentsInfoList + ", posted="
				+ posted + ", updated=" + updated + ", postedBy=" + postedBy + "]";
	}

}
