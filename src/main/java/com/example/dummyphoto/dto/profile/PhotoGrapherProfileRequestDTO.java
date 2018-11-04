package com.example.dummyphoto.dto.profile;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PhotoGrapherProfileRequestDTO implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 7447254943173578464L;

	private String googleEmailId;

	public String getGoogleEmailId() {
		return googleEmailId;
	}

	public void setGoogleEmailId(String googleEmailId) {
		this.googleEmailId = googleEmailId;
	}

	@Override
	public String toString() {
		return "PhotoGrapherProfileRequestDTO [googleEmailId=" + googleEmailId + "]";
	}

}
