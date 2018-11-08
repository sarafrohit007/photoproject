package com.example.dummyphoto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

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

	private MediaType mediaType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMediaPath() {
		return mediaPath;
	}

	public void setMediaPath(String mediaPath) {
		this.mediaPath = mediaPath;
	}

	public MediaType getMediaType() {
		return mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}

}
