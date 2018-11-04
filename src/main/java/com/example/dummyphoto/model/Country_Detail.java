package com.example.dummyphoto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="country_detail",catalog="address")
public class Country_Detail implements Serializable{

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -273332354699780924L;

	private Integer id;
	
	private String name;
	
	private boolean isServed;

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

	public boolean isServed() {
		return isServed;
	}

	public void setServed(boolean isServed) {
		this.isServed = isServed;
	}
	
	
	
}
