package com.myhome.model;

import com.myhome.model.base.BaseCustomer;



public class Customer extends BaseCustomer {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Customer () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Customer (java.lang.Long customerId) {
		super(customerId);
	}

/*[CONSTRUCTOR MARKER END]*/


}