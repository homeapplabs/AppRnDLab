package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class CookingGasAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addCookingGasBill(){
    	return "success";
    }
}
