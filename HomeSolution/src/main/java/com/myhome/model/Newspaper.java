package com.myhome.model;

import com.myhome.model.base.BaseNewspaper;



public class Newspaper extends BaseNewspaper {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Newspaper () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Newspaper (java.lang.Long newspaperID) {
		super(newspaperID);
	}

	/**
	 * Constructor for required fields
	 */
	public Newspaper (
		java.lang.Long newspaperID,
		com.myhome.model.Customer customer) {

		super (
			newspaperID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}