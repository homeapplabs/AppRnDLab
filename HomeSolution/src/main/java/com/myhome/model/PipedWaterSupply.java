package com.myhome.model;

import com.myhome.model.base.BasePipedWaterSupply;



public class PipedWaterSupply extends BasePipedWaterSupply {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public PipedWaterSupply () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public PipedWaterSupply (java.lang.Long pipedwatersupplyID) {
		super(pipedwatersupplyID);
	}

	/**
	 * Constructor for required fields
	 */
	public PipedWaterSupply (
		java.lang.Long pipedwatersupplyID,
		com.myhome.model.Customer customer) {

		super (
			pipedwatersupplyID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}