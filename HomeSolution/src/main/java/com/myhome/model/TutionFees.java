package com.myhome.model;

import com.myhome.model.base.BaseTutionFees;



public class TutionFees extends BaseTutionFees {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public TutionFees () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public TutionFees (java.lang.Long tutionfeesID) {
		super(tutionfeesID);
	}

	/**
	 * Constructor for required fields
	 */
	public TutionFees (
		java.lang.Long tutionfeesID,
		com.myhome.model.Customer customer) {

		super (
			tutionfeesID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}