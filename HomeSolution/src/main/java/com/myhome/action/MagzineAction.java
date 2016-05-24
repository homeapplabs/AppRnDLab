package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class MagzineAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}

	public String addMagzineBill() {
		return "success";
	}
}
