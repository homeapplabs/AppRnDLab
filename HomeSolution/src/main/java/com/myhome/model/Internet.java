package com.myhome.model;

import com.myhome.model.base.BaseInternet;



public class Internet extends BaseInternet {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Internet () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Internet (java.lang.Long internetID) {
		super(internetID);
	}

	/**
	 * Constructor for required fields
	 */
	public Internet (
		java.lang.Long internetID,
		com.myhome.model.Customer customer) {

		super (
			internetID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}