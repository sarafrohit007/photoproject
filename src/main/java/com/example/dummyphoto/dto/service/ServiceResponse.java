package com.example.dummyphoto.dto.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ServiceResponse implements Serializable {

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = 2243745759763162366L;

	private boolean successful = true;
	private String message;
	private Map<String, Object> items;

	public boolean isSuccessful() {
		return successful;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getItems() {
		return items;
	}

	public void setItems(Map<String, Object> items) {
		this.items = items;
	}
	
	public void addItem(String name, Object value) {
        if (items == null) {
            items = new HashMap<String, Object>();
        }
        items.put(name, value);
    }
	
	

}
