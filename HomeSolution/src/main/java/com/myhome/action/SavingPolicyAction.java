package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class SavingPolicyAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addSavingPolicyPremium(){
    	return "success";
    }
}
