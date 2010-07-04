package com.aquiles.alexandre;

public class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;

	private String title;
	private Integer priceCode;
	
	public Movie(String title, Integer priceCode) {
		super();
		this.title = title;
		this.priceCode = priceCode;
	}

	public Integer getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(Integer priceCode) {
		this.priceCode = priceCode;
	}

	public String getTitle() {
		return title;
	}
	
	
	
}
