package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address_detail", catalog = "photo")
public class AddressDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 7300484584865847599L;
	private Integer id;
	private CityDetail cityDetail;

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
	@Column(name = "city_detail", nullable = false)
	public CityDetail getCityDetail() {
		return cityDetail;
	}

	public void setCityDetail(CityDetail cityDetail) {
		this.cityDetail = cityDetail;
	}

}
