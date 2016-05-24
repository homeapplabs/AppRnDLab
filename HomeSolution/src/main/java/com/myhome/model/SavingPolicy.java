package com.myhome.model;

import com.myhome.model.base.BaseSavingPolicy;



public class SavingPolicy extends BaseSavingPolicy {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public SavingPolicy () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public SavingPolicy (java.lang.Long savingpolicyID) {
		super(savingpolicyID);
	}

	/**
	 * Constructor for required fields
	 */
	public SavingPolicy (
		java.lang.Long savingpolicyID,
		com.myhome.model.Customer customer) {

		super (
			savingpolicyID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}