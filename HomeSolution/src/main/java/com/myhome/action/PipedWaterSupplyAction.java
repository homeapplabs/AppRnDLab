package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class PipedWaterSupplyAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addPipedWaterSupplyBill(){
    	return "success";
    }
}
