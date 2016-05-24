package com.myhome.model;

import com.myhome.model.base.BaseInsurancePremium;



public class InsurancePremium extends BaseInsurancePremium {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public InsurancePremium () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public InsurancePremium (java.lang.Long insurancepremiumID) {
		super(insurancepremiumID);
	}

	/**
	 * Constructor for required fields
	 */
	public InsurancePremium (
		java.lang.Long insurancepremiumID,
		com.myhome.model.Customer customer) {

		super (
			insurancepremiumID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}