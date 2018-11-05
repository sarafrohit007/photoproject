package com.example.dummyphoto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "city_detail", catalog = "photoapp")
public class CityDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -1626532602839864416L;

	private Integer id;

	private String name;

	private StateDetail stateDetail;

	private List<PincodeDetail> pinCodesList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StateDetail getStateDetail() {
		return stateDetail;
	}

	public void setStateDetail(StateDetail stateDetail) {
		this.stateDetail = stateDetail;
	}

	public List<PincodeDetail> getPinCodesList() {
		return pinCodesList;
	}

	public void setPinCodesList(List<PincodeDetail> pinCodesList) {
		this.pinCodesList = pinCodesList;
	}

}
