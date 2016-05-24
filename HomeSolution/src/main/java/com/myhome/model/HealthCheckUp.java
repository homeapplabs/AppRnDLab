package com.myhome.model;

import com.myhome.model.base.BaseHealthCheckUp;



public class HealthCheckUp extends BaseHealthCheckUp {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public HealthCheckUp () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public HealthCheckUp (java.lang.Long healthcheckupID) {
		super(healthcheckupID);
	}

	/**
	 * Constructor for required fields
	 */
	public HealthCheckUp (
		java.lang.Long healthcheckupID,
		com.myhome.model.Customer customer) {

		super (
			healthcheckupID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}