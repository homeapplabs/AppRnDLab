package com.myhome.model;

import com.myhome.model.base.BaseInsuranceCompany;



public class InsuranceCompany extends BaseInsuranceCompany {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public InsuranceCompany () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public InsuranceCompany (java.lang.Long insuranceCompanyCode) {
		super(insuranceCompanyCode);
	}

/*[CONSTRUCTOR MARKER END]*/


}