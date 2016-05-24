package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class ElectricAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
   public String addElectricBill(){
	   return "success";
   }
}
