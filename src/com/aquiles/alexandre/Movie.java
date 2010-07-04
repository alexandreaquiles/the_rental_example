package com.aquiles.alexandre;

import com.aquiles.alexandre.pricing.ChildrensPrice;
import com.aquiles.alexandre.pricing.NewReleasePrice;
import com.aquiles.alexandre.pricing.Price;
import com.aquiles.alexandre.pricing.RegularPrice;

public class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;

	private String title;
	private Price price;
	
	public Movie(String title, Integer priceCode) {
		super();
		this.title = title;
		setPriceCode(priceCode);
	}

	public Integer getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(Integer priceCode) {
		switch(priceCode) {
		case Movie.REGULAR:
			price = new RegularPrice();
			break;
		case Movie.NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		case Movie.CHILDRENS:
			price = new ChildrensPrice();
			break;
			
		}
	}

	public String getTitle() {
		return title;
	}

	public Double getCharge(Integer daysRented) {
		Double result = 0.0;
		switch(getPriceCode()) {
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

	public Integer getFrequentRenterPoints(Integer daysRented) {
		if(getPriceCode() == Movie.NEW_RELEASE && daysRented > 1)
			return 2;
		else 
			return 1;
	}
	
	
	
}
