package com.example.dummyphoto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	public CityDetail getCityDetail() {
		return cityDetail;
	}

	public void setCityDetail(CityDetail cityDetail) {
		this.cityDetail = cityDetail;
	}

}
