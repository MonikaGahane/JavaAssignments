package com.app.core;

public enum ServicePlan {
	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);
	
	// add plan charges as a data member
	private double charges;
	private ServicePlan( double charges) {
		this.charges = charges;
	}
	
	
	// Getter 
	public double getcharges() {
		return charges;
	}
	
}
