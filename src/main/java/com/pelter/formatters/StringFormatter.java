package com.pelter.formatters;

public class StringFormatter {
	private String formattedString;
	
	/* ------ Constructors --------------*/
	public StringFormatter(String newValue){
		this.formattedString = newValue;
	}
	
	public String toString(){
		return this.formattedString;
	}
}
