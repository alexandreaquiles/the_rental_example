package com.aquiles.alexandre.pricing;

import com.aquiles.alexandre.Movie;

public class ChildrensPrice extends Price {

	@Override
	public Integer getPriceCode() {
		return Movie.CHILDRENS;
	}

}
