package com.myhome.model;

import com.myhome.model.base.BaseCountry;



public class Country extends BaseCountry {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Country () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Country (java.lang.String countryCode) {
		super(countryCode);
	}

/*[CONSTRUCTOR MARKER END]*/


}