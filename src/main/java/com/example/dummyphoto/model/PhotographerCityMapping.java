package com.example.dummyphoto.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "photgrapher_city_mapping", catalog = "photoapp")
public class PhotographerCityMapping implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -6958908662117202192L;

	private Integer id;

	private PhotoGrapher photgrapher;

	private List<CityDetail> citiesServed;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PhotoGrapher getPhotgrapher() {
		return photgrapher;
	}

	public void setPhotgrapher(PhotoGrapher photgrapher) {
		this.photgrapher = photgrapher;
	}

	public List<CityDetail> getCitiesServed() {
		return citiesServed;
	}

	public void setCitiesServed(List<CityDetail> citiesServed) {
		this.citiesServed = citiesServed;
	}

}