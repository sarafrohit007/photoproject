package com.example.dummyphoto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pin_code", catalog = "photoapp")
public class PincodeDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 6228250646617693339L;

	private Integer id;

	private String pinNumber;

	private CityDetail cityDetail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public CityDetail getCityDetail() {
		return cityDetail;
	}

	public void setCityDetail(CityDetail cityDetail) {
		this.cityDetail = cityDetail;
	}

}
