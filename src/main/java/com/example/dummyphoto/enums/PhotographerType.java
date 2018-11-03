package com.example.dummyphoto.enums;

public enum PhotographerType {
	
	PROFESSIONAL("professional"),STUDENT("student");
	
	private String potoGrapherType;

	public String getPotoGrapherType() {
		return potoGrapherType;
	}

	public void setPotoGrapherType(String potoGrapherType) {
		this.potoGrapherType = potoGrapherType;
	}
	
    PhotographerType(){
		
	}
	
	PhotographerType(String photoGrapherType){
		this.potoGrapherType = photoGrapherType;
	}

}