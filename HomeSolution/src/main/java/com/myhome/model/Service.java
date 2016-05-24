package com.myhome.model;

import com.myhome.model.base.BaseService;



public class Service extends BaseService {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Service () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Service (java.lang.Long serviceID) {
		super(serviceID);
	}

	/**
	 * Constructor for required fields
	 */
	public Service (
		java.lang.Long serviceID,
		com.myhome.model.Customer customer) {

		super (
			serviceID,
			customer);
	}

/*[CONSTRUCTOR MARKER END]*/


}