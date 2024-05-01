package com.app.core;
/*
 * 1.Customer should be assigned system generated 
 * (auto increment) customer id : int
Store - first name, last name email(string),
password(string),registrationAmount(double),dob(LocalDate),
plan(ServicePlan : enum)
Unique ID - email (2 customers CAN NOT have SAME email id)
 */

import java.time.LocalDate;


public class Customer {
	private int custID;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double regAmt;
	private LocalDate dob;
	private ServicePlan servicePlan;
	//add static field to generate customer ids (as Customer ID Auto Increment)
	private static int uniqueID = 0;
	
	// Parameterized Constructor
	public Customer(int custID,String firstName ,String lastName,String email , String password , double regAmt, LocalDate dob , ServicePlan servicePlan ) {
		super();
		uniqueID++;
		this.custID = uniqueID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.dob = dob;
		this.servicePlan = servicePlan;
		
	}
	
	//add overloaded constructor , to wrap PK (email) (For checkForDuplicateEmail Method)
	public Customer (String email ) {
		this.email =email;
	}
	
	
	//override equals method to replace reference equality by PK based equality
	@Override
	public boolean equals(Object o) {
		System.out.println("in customer equals");
		if (o instanceof Customer) {
			return this.email == ((Customer) o).email;
		}
		//if the passed arguments is not a Customer : return false
		return false;
		
		
	}
	
}
