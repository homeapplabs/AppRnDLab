package com.myhome.model;

import com.myhome.model.base.BaseCookingGas;



public class CookingGas extends BaseCookingGas {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CookingGas () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CookingGas (java.lang.Long cookinggasID) {
		super(cookinggasID);
	}

	/**
	 * Constructor for required fields
	 */
	public CookingGas (
		java.lang.Long cookinggasID,
		com.myhome.model.Customer customer) {

		super (
			cookinggasID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}