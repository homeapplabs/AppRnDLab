package com.myhome.model;

import com.myhome.model.base.BaseElectricitySupplier;



public class ElectricitySupplier extends BaseElectricitySupplier {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public ElectricitySupplier () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public ElectricitySupplier (java.lang.Long electricitySupplierCode) {
		super(electricitySupplierCode);
	}

	/**
	 * Constructor for required fields
	 */
	public ElectricitySupplier (
		java.lang.Long electricitySupplierCode,
		com.myhome.model.Customer customer) {

		super (
			electricitySupplierCode,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}