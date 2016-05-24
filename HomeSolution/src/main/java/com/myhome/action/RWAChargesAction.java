package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class RWAChargesAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addRWACharges(){
    	return "success";
    }
}
