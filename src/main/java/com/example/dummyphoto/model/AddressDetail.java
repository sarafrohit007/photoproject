package com.example.dummyphoto.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "address_detail", catalog = "photo")
public class AddressDetail implements Serializable{

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 7300484584865847599L;
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
