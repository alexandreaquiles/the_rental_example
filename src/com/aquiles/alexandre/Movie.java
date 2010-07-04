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

	public Double getCharge(Integer daysRented) {
		Double result = 0.0;
		switch(priceCode) {
		case Movie.REGULAR:
			result += 2;
			if(daysRented > 2)
				result += (daysRented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if(daysRented > 3)
				result += (daysRented - 3) * 1.5;
			break;
		}
		return result;
	}
	
	
	
}
