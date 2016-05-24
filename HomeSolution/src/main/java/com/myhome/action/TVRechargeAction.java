package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class TVRechargeAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addTVRecharge(){
    	return "success";
    }
}
