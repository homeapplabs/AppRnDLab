package com.myhome.model;

import com.myhome.model.base.BaseBank;



public class Bank extends BaseBank {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Bank () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Bank (java.lang.Long bankCode) {
		super(bankCode);
	}

/*[CONSTRUCTOR MARKER END]*/


}