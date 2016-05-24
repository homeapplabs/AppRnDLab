package com.myhome.model;

import com.myhome.model.base.BaseCraditCard;



public class CraditCard extends BaseCraditCard {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public CraditCard () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CraditCard (java.lang.Long craditcardID) {
		super(craditcardID);
	}

	/**
	 * Constructor for required fields
	 */
	public CraditCard (
		java.lang.Long craditcardID,
		com.myhome.model.Customer customer) {

		super (
			craditcardID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}