package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class InsuranceActon implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addIsurancePremium(){
    	return "success";
    }
}
