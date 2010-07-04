package com.aquiles.alexandre.statement;

import com.aquiles.alexandre.Customer;
import com.aquiles.alexandre.Rental;

public class HtmlStatement extends Statement {

	public HtmlStatement(Customer customer) {
		super(customer);
	}

	@Override
	protected String detail(Rental rental) {
		return "<P>" + rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "</P>\n";
	}

	@Override
	protected String footer() {
		return "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM></P>\n" + "<P>On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points</P>";
	}

	@Override
	protected String header() {
		return "<P><H1>Rentals for <EM>" + customer.getName() + "</EM></H1></P>\n";
	}

}
