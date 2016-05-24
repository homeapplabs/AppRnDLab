package com.myhome.dao;

import java.util.List;

import com.myhome.model.Customer;
 
public interface CustomerDAO{
	
	void addCustomer(Customer customer);
	
	List<Customer> listCustomer();
	
}