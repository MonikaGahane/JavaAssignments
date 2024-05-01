package com.app.cust_validation;

import java.util.List; // For List<Customer> 

import com.app.core.Customer; // For Class Customer -- List<Customer> 

import com.app.core.ServicePlan; // For ServicePlan parseValidatePlanAndCharges

import custome_exception.CustManageSysException; // For throws CustManageSysException

public class CustomerValidation {
	// add a static method for checking duplicate customers emailID (primary_keys--
	// custID, email)(composite key)
	// (i.e if the customer tries to register using existing email ,raise custom
	// exception)

	public static void checkForDuplicateEmail (String email, List<Customer> customerlist) throws CustManageSysException {
		// 1. create customer class instance wrapping Primary Key
		Customer cust = new Customer(email);
		
		// invoke "contains" using the customer reference (for checking whether email which is we are passing is present or not)
		if(customerlist.contains(cust))
			throw new CustManageSysException ("Passing Duplicate email ....");

		// add a method to parse (i.e. change) and validate plan and it's charges
		// import com.app.core.ServicePlan;
	}
		
		public static ServicePlan parseValidatePlanAndCharges (String servicePlan1, double regAmt ) throws CustManageSysException 
		{
	  //public static ServicePlan parseAndValidatePlanAndCharges(String plan, double regAmount) throws CMSException {	
			//1. parse string(plan) -- > enum (we know datatype is enum but customer doesn't that's why we are using String for serviceplan)
			ServicePlan servicePlan = ServicePlan.valueOf(servicePlan1.toUpperCase());
			
			// If plan is valid , now chk if reg amount is correct
			
			if(servicePlan.getcharges()==regAmt)
				return servicePlan;
			// => If incorrect reg amount then throw custom exception
			throw new CustManageSysException ("Reg amount doesn't match with the chose serviceplan") ;	
			
		}
	}

