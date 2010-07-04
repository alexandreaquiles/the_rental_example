package com.aquiles.alexandre;

import java.util.ArrayList;
import java.util.Collection;

public class Customer {
	
	private String name;
	private Collection<Rental> rentals;
	
	public Customer(String name) {
		super();
		rentals = new ArrayList<Rental>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String statement() {
		String result = "Rental record for " + getName() + "\n";
		for(Rental rental : rentals) {
			//show figures for this rental
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
		}
		
		//add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	private int getTotalFrequentRenterPoints() {
		int totalFrequentRenterPoints = 0;
		for(Rental rental : rentals) {
			totalFrequentRenterPoints += rental.getFrequentRenterPoints();
		}
		return totalFrequentRenterPoints;
	}

	private double getTotalCharge() {
		double totalAmount = 0;
		for(Rental rental : rentals) {
			totalAmount += rental.getCharge();
		}
		return totalAmount;
	}

	public String statementAsHTML() {
		// TODO Auto-generated method stub
		return "";
	}

}

	
	