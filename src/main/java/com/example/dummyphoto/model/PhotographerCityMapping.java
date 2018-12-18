package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	private Set<CityDetail> citiesServed;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "photographer")
	public PhotoGrapher getPhotgrapher() {
		return photgrapher;
	}

	public void setPhotgrapher(PhotoGrapher photgrapher) {
		this.photgrapher = photgrapher;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@Column(name  = "cities_served")
	public Set<CityDetail> getCitiesServed() {
		return citiesServed;
	}

	public void setCitiesServed(Set<CityDetail> citiesServed) {
		this.citiesServed = citiesServed;
	}

	@Override
	public String toString() {
		return "PhotographerCityMapping [id=" + id + ", photgrapher=" + photgrapher + ", citiesServed=" + citiesServed
				+ "]";
	}
	
	

}
