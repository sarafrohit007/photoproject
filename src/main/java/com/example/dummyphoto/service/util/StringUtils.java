package com.example.dummyphoto.service.util;

import java.io.Serializable;

public class StringUtils implements Serializable{

	/**
	 * @author rohitsaraf
	 */
	private static final long serialVersionUID = -7137836651312216575L;

	public static boolean isNotEmpty(String input){
		if(input!=null && !input.trim().equals("")){
			return true;
		}
		return false;
	}
	
	public static boolean isEmpty(String input){
		if(input == null || input.trim().equals("")){
			return true;
		}
		return false;
	}
	
	
}
