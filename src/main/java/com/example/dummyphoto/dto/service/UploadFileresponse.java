package com.example.dummyphoto.dto.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UploadFileresponse extends ServiceResponse implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 7492826311785484265L;

	private String link;

	private List<UploadedFile> files = new ArrayList<UploadFileresponse.UploadedFile>();

	public static class UploadedFile {

		private String name;
		private Long size;
		private String url;
		private String thumbnail_url;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Long getSize() {
			return size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getThumbnail_url() {
			return thumbnail_url;
		}

		public void setThumbnail_url(String thumbnail_url) {
			this.thumbnail_url = thumbnail_url;
		}

		@Override
		public String toString() {
			return "UploadedFile [name=" + name + ", size=" + size + ", url=" + url + ", thumbnail_url=" + thumbnail_url
					+ "]";
		}

	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<UploadedFile> getFiles() {
		return files;
	}

	public void setFiles(List<UploadedFile> files) {
		this.files = files;
	}

}
