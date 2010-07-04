package com.aquiles.alexandre.pricing;

import com.aquiles.alexandre.Movie;


public abstract class Price {

	public abstract Integer getPriceCode();

	public abstract Double getCharge(Integer daysRented);

	public Integer getFrequentRenterPoints(Integer daysRented) {
		if(getPriceCode() == Movie.NEW_RELEASE && daysRented > 1)
			return 2;
		else 
			return 1;
	}
}
