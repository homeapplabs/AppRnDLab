package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class MilkSupplyAction implements ModelDriven{

	@Override
	public Object getModel() {
				return null;
	}
    public String addMilkSupplyBill(){
    	return "success";
    }
}
