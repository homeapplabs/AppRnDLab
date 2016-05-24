
package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class LoanAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addLoanPremium(){
    	return "success";
    }
}
