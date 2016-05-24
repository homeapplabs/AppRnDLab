package com.myhome.bo;

import java.util.List;

import com.myhome.model.Customer;
 
public interface CustomerBo{
	
	void addCustomer(Customer customer);
	
	List<Customer> listCustomer();
	
}