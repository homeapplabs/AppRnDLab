package com.myhome.model;

import com.myhome.model.base.BaseMagzine;



public class Magzine extends BaseMagzine {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Magzine () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Magzine (java.lang.Long magzineID) {
		super(magzineID);
	}

	/**
	 * Constructor for required fields
	 */
	public Magzine (
		java.lang.Long magzineID,
		com.myhome.model.Customer customer) {

		super (
			magzineID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}