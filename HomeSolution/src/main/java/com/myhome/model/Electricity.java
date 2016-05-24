package com.myhome.model;

import com.myhome.model.base.BaseElectricity;



public class Electricity extends BaseElectricity {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Electricity () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Electricity (java.lang.Long elecricityId) {
		super(elecricityId);
	}

	/**
	 * Constructor for required fields
	 */
	public Electricity (
		java.lang.Long elecricityId,
		com.myhome.model.Customer customer) {

		super (
			elecricityId,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}