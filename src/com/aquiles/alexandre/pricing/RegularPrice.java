package com.aquiles.alexandre.pricing;

import com.aquiles.alexandre.Movie;

public class RegularPrice extends Price {

	@Override
	public Integer getPriceCode() {
		return Movie.REGULAR;
	}

}
