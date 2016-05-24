package com.myhome.model;

import com.myhome.model.base.BaseBottledWaterSupply;



public class BottledWaterSupply extends BaseBottledWaterSupply {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public BottledWaterSupply () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public BottledWaterSupply (java.lang.Long bottledwatersupplyID) {
		super(bottledwatersupplyID);
	}

	/**
	 * Constructor for required fields
	 */
	public BottledWaterSupply (
		java.lang.Long bottledwatersupplyID,
		com.myhome.model.Customer customer) {

		super (
			bottledwatersupplyID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}