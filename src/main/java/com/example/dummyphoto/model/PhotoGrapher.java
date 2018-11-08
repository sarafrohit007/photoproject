package com.example.dummyphoto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.dummyphoto.enums.PhotographerType;

@Entity
@Table(name = "photographer", catalog = "photo")
public class PhotoGrapher implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -8534874523939844384L;
	
	private Integer id;

	private boolean isCommercial;

	private Float rating;

	private PhotographerType photographerType;

	private AddressDetail addressDetail;
	
	private LoginDetail loginDetail;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isCommercial() {
		return isCommercial;
	}

	public void setCommercial(boolean isCommercial) {
		this.isCommercial = isCommercial;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public PhotographerType getPhotographerType() {
		return photographerType;
	}

	public void setPhotographerType(PhotographerType photographerType) {
		this.photographerType = photographerType;
	}

	public AddressDetail getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(AddressDetail addressDetail) {
		this.addressDetail = addressDetail;
	}

}
