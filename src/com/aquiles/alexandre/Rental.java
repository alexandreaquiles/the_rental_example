package com.aquiles.alexandre;


public class Rental {

	private Movie movie;
	private Integer daysRented;
	
	public Rental(Movie movie, Integer daysRented) {
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public Integer getDaysRented() {
		return daysRented;
	}

	double getCharge() {
		double result = 0;
		switch(getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if(getDaysRented() > 2)
				result += (getDaysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if(getDaysRented() > 3)
				result += (getDaysRented() - 3) * 1.5;
			break;
		}
		return result;
	}
	
	int getFrequentRenterPoints(int frequentRenterPoints, Rental rental) {
		//add frequent renter points
		frequentRenterPoints++;

		//add bonus for a two day new release rental
		if(getMovie().getPriceCode() == Movie.NEW_RELEASE && getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

	
}
