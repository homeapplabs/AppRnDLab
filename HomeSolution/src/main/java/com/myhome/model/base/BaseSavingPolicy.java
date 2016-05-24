package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the savingpolicy table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="savingpolicy"
 */

public abstract class BaseSavingPolicy  implements Serializable {

	public static String REF = "SavingPolicy";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_BANK = "bank";
	public static String PROP_OTHER = "other";
	public static String PROP_POLICYPREMIUM = "policypremium";
	public static String PROP_POLICYNUMBER = "policynumber";
	public static String PROP_POLICYTYPE = "policytype";
	public static String PROP_COUNTRY = "country";
	public static String PROP_SAVINGPOLICY_I_D = "savingpolicyID";
	public static String PROP_STATUS = "status";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_POLICYNAME = "policyname";
	public static String PROP_COMPANY = "company";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseSavingPolicy () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSavingPolicy (java.lang.Long savingpolicyID) {
		this.setSavingpolicyID(savingpolicyID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseSavingPolicy (
		java.lang.Long savingpolicyID,
		com.myhome.model.Customer customer) {

		this.setSavingpolicyID(savingpolicyID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long savingpolicyID;

	// fields
	private java.lang.String company;
	private java.lang.String policyname;
	private java.lang.String policytype;
	private int policypremium;
	private int policynumber;
	private java.lang.String other;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.Bank bank;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="savingpolicy_id"
     */
	public java.lang.Long getSavingpolicyID () {
		return savingpolicyID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param savingpolicyID the new ID
	 */
	public void setSavingpolicyID (java.lang.Long savingpolicyID) {
		this.savingpolicyID = savingpolicyID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: company_name
	 */
	public java.lang.String getCompany () {
		return company;
	}

	/**
	 * Set the value related to the column: company_name
	 * @param company the company_name value
	 */
	public void setCompany (java.lang.String company) {
		this.company = company;
	}



	/**
	 * Return the value associated with the column: policy_name
	 */
	public java.lang.String getPolicyname () {
		return policyname;
	}

	/**
	 * Set the value related to the column: policy_name
	 * @param policyname the policy_name value
	 */
	public void setPolicyname (java.lang.String policyname) {
		this.policyname = policyname;
	}



	/**
	 * Return the value associated with the column: policy_type
	 */
	public java.lang.String getPolicytype () {
		return policytype;
	}

	/**
	 * Set the value related to the column: policy_type
	 * @param policytype the policy_type value
	 */
	public void setPolicytype (java.lang.String policytype) {
		this.policytype = policytype;
	}



	/**
	 * Return the value associated with the column: policy_premium
	 */
	public int getPolicypremium () {
		return policypremium;
	}

	/**
	 * Set the value related to the column: policy_premium
	 * @param policypremium the policy_premium value
	 */
	public void setPolicypremium (int policypremium) {
		this.policypremium = policypremium;
	}



	/**
	 * Return the value associated with the column: policy_number
	 */
	public int getPolicynumber () {
		return policynumber;
	}

	/**
	 * Set the value related to the column: policy_number
	 * @param policynumber the policy_number value
	 */
	public void setPolicynumber (int policynumber) {
		this.policynumber = policynumber;
	}



	/**
	 * Return the value associated with the column: other_policy
	 */
	public java.lang.String getOther () {
		return other;
	}

	/**
	 * Set the value related to the column: other_policy
	 * @param other the other_policy value
	 */
	public void setOther (java.lang.String other) {
		this.other = other;
	}



	/**
	 * Return the value associated with the column: due_date
	 */
	public java.util.Date getDuedate () {
		return duedate;
	}

	/**
	 * Set the value related to the column: due_date
	 * @param duedate the due_date value
	 */
	public void setDuedate (java.util.Date duedate) {
		this.duedate = duedate;
	}



	/**
	 * Return the value associated with the column: makemeremind
	 */
	public java.lang.String getMakemeremind () {
		return makemeremind;
	}

	/**
	 * Set the value related to the column: makemeremind
	 * @param makemeremind the makemeremind value
	 */
	public void setMakemeremind (java.lang.String makemeremind) {
		this.makemeremind = makemeremind;
	}



	/**
	 * Return the value associated with the column: status
	 */
	public boolean isStatus () {
		return status;
	}

	/**
	 * Set the value related to the column: status
	 * @param status the status value
	 */
	public void setStatus (boolean status) {
		this.status = status;
	}



	/**
	 * Return the value associated with the column: bank
	 */
	public com.myhome.model.Bank getBank () {
		return bank;
	}

	/**
	 * Set the value related to the column: bank
	 * @param bank the bank value
	 */
	public void setBank (com.myhome.model.Bank bank) {
		this.bank = bank;
	}



	/**
	 * Return the value associated with the column: country
	 */
	public com.myhome.model.Country getCountry () {
		return country;
	}

	/**
	 * Set the value related to the column: country
	 * @param country the country value
	 */
	public void setCountry (com.myhome.model.Country country) {
		this.country = country;
	}



	/**
	 * Return the value associated with the column: stateCounty
	 */
	public com.myhome.model.StateCounty getStateCounty () {
		return stateCounty;
	}

	/**
	 * Set the value related to the column: stateCounty
	 * @param stateCounty the stateCounty value
	 */
	public void setStateCounty (com.myhome.model.StateCounty stateCounty) {
		this.stateCounty = stateCounty;
	}



	/**
	 * Return the value associated with the column: customer
	 */
	public com.myhome.model.Customer getCustomer () {
		return customer;
	}

	/**
	 * Set the value related to the column: customer
	 * @param customer the customer value
	 */
	public void setCustomer (com.myhome.model.Customer customer) {
		this.customer = customer;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.SavingPolicy)) return false;
		else {
			com.myhome.model.SavingPolicy savingPolicy = (com.myhome.model.SavingPolicy) obj;
			if (null == this.getSavingpolicyID() || null == savingPolicy.getSavingpolicyID()) return false;
			else return (this.getSavingpolicyID().equals(savingPolicy.getSavingpolicyID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getSavingpolicyID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getSavingpolicyID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}