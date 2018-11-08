package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	private Integer numberOfReviews;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "isCommercial", nullable = false)
	public boolean isCommercial() {
		return isCommercial;
	}

	public void setCommercial(boolean isCommercial) {
		this.isCommercial = isCommercial;
	}

	@Column(name = "rating", nullable = false)
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "address_detail", nullable = false)
	public AddressDetail getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(AddressDetail addressDetail) {
		this.addressDetail = addressDetail;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "login_detail", nullable = false)
	public LoginDetail getLoginDetail() {
		return loginDetail;
	}

	public void setLoginDetail(LoginDetail loginDetail) {
		this.loginDetail = loginDetail;
	}

	@Column(name = "numberOfReviews", nullable = false, columnDefinition = "int(11) default = '0'")
	public Integer getNumberOfReviews() {
		return numberOfReviews;
	}

	public void setNumberOfReviews(Integer numberOfReviews) {
		this.numberOfReviews = numberOfReviews;
	}

}
