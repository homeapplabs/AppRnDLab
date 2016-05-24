package com.myhome.model;

import com.myhome.model.base.BaseNewsAgency;



public class NewsAgency extends BaseNewsAgency {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public NewsAgency () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public NewsAgency (java.lang.Long newsAgencyCode) {
		super(newsAgencyCode);
	}

/*[CONSTRUCTOR MARKER END]*/


}