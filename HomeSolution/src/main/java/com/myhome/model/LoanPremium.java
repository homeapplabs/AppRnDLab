package com.myhome.model;

import com.myhome.model.base.BaseLoanPremium;



public class LoanPremium extends BaseLoanPremium {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public LoanPremium () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public LoanPremium (java.lang.Long loanpremiumID) {
		super(loanpremiumID);
	}

	/**
	 * Constructor for required fields
	 */
	public LoanPremium (
		java.lang.Long loanpremiumID,
		com.myhome.model.Customer customer) {

		super (
			loanpremiumID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}