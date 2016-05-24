package com.myhome.model;

import com.myhome.model.base.BasePhoneMobile;



public class PhoneMobile extends BasePhoneMobile {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public PhoneMobile () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public PhoneMobile (java.lang.Long phonemobileID) {
		super(phonemobileID);
	}

	/**
	 * Constructor for required fields
	 */
	public PhoneMobile (
		java.lang.Long phonemobileID,
		com.myhome.model.Customer customer) {

		super (
			phonemobileID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}