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
@Table(name = "city_detail", catalog = "photoapp")
public class CityDetail implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -1626532602839864416L;

	private Integer id;

	private String name;

	private StateDetail stateDetail;

	private Set<PincodeDetail> pinCodesList;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JoinColumn(name = "state_detail", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	public StateDetail getStateDetail() {
		return stateDetail;
	}

	public void setStateDetail(StateDetail stateDetail) {
		this.stateDetail = stateDetail;
	}

	@Column(name = "pin_codes_list", nullable = false)
	@OneToMany(fetch = FetchType.LAZY)
	public Set<PincodeDetail> getPinCodesList() {
		return pinCodesList;
	}

	public void setPinCodesList(Set<PincodeDetail> pinCodesList) {
		this.pinCodesList = pinCodesList;
	}

	@Override
	public String toString() {
		return "CityDetail [id=" + id + ", name=" + name + ", stateDetail=" + stateDetail + ", pinCodesList="
				+ pinCodesList + "]";
	}

}
