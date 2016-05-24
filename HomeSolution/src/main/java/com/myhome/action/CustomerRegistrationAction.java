package com.myhome.action;

import com.myhome.model.Customer;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerRegistrationAction implements ModelDriven {

	Customer customer = new Customer();

	// CustomerRegistrationBo customerRegistrationBo;

	public Object getModel() {
		return customer;
	}

	public String customerRegistration() {

		return "success";
	}
}
