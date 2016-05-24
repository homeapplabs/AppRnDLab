package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class BottledWaterSupplyAction implements ModelDriven{

	@Override
	public Object getModel() {
		return null;
	}
    public String addBottledWaterSupplyBill(){
    	return "success";
    }
}
