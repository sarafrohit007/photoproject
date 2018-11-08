package com.example.dummyphoto.enums;

public enum MediaType {
	
	VIDEO("video"),IMAGE("image");

	private String mediaType;

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	MediaType() {
		
	}
	
	MediaType(String mediaType){
		this.mediaType = mediaType;
	}
	
}
