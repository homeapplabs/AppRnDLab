package com.myhome.model;

import com.myhome.model.base.BaseRWACharges;



public class RWACharges extends BaseRWACharges {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public RWACharges () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public RWACharges (java.lang.Long rwachargesID) {
		super(rwachargesID);
	}

	/**
	 * Constructor for required fields
	 */
	public RWACharges (
		java.lang.Long rwachargesID,
		com.myhome.model.Customer customer) {

		super (
			rwachargesID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}