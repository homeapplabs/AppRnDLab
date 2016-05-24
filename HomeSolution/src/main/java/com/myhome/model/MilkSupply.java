package com.myhome.model;

import com.myhome.model.base.BaseMilkSupply;



public class MilkSupply extends BaseMilkSupply {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public MilkSupply () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public MilkSupply (java.lang.Long milksupplyID) {
		super(milksupplyID);
	}

	/**
	 * Constructor for required fields
	 */
	public MilkSupply (
		java.lang.Long milksupplyID,
		com.myhome.model.Customer customer) {

		super (
			milksupplyID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}