package com.aquiles.alexandre.pricing;

import com.aquiles.alexandre.Movie;

public class NewReleasePrice extends Price {

	@Override
	public Integer getPriceCode() {
		return Movie.NEW_RELEASE;
	}

}
