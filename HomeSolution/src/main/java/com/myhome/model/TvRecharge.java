package com.myhome.model;

import com.myhome.model.base.BaseTvRecharge;



public class TvRecharge extends BaseTvRecharge {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public TvRecharge () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public TvRecharge (java.lang.Long tvrechargeID) {
		super(tvrechargeID);
	}

	/**
	 * Constructor for required fields
	 */
	public TvRecharge (
		java.lang.Long tvrechargeID,
		com.myhome.model.Customer customer) {

		super (
			tvrechargeID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}