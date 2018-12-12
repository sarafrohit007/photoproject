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
@Table(name = "pin_code", catalog = "photoapp")
public class PincodeDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 6228250646617693339L;

	private Integer id;

	private String pinNumber;

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

	@Column(name = "pinnumber")
	public String getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@Column(name = "city_detail")
	public CityDetail getCityDetail() {
		return cityDetail;
	}

	public void setCityDetail(CityDetail cityDetail) {
		this.cityDetail = cityDetail;
	}

	@Override
	public String toString() {
		return "PincodeDetail [id=" + id + ", pinNumber=" + pinNumber + ", cityDetail=" + cityDetail + "]";
	}
	
	

}
