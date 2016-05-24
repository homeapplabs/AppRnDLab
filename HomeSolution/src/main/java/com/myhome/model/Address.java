package com.myhome.model;

import com.myhome.model.base.BaseAddress;



public class Address extends BaseAddress {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Address () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Address (java.lang.Long addressId) {
		super(addressId);
	}

/*[CONSTRUCTOR MARKER END]*/


}