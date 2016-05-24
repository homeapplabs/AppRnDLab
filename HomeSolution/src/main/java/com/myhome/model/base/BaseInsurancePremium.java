package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the insurancepremium table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="insurancepremium"
 */

public abstract class BaseInsurancePremium  implements Serializable {

	public static String REF = "InsurancePremium";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_INSURANCEPREMIUM_I_D = "insurancepremiumID";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_INSURANCETYPE = "insurancetype";
	public static String PROP_OTHER = "other";
	public static String PROP_INSURANCE_COMPANY = "insuranceCompany";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATUS = "status";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_INSURANCENUMBER = "insurancenumber";
	public static String PROP_COMPANY = "company";
	public static String PROP_INSURANCEPREMIUM = "insurancepremium";
	public static String PROP_STATE_COUNTY = "stateCounty";
	public static String PROP_INSURANCENAME = "insurancename";


	// constructors
	public BaseInsurancePremium () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseInsurancePremium (java.lang.Long insurancepremiumID) {
		this.setInsurancepremiumID(insurancepremiumID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseInsurancePremium (
		java.lang.Long insurancepremiumID,
		com.myhome.model.Customer customer) {

		this.setInsurancepremiumID(insurancepremiumID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long insurancepremiumID;

	// fields
	private java.lang.String company;
	private java.lang.String insurancetype;
	private java.lang.String insurancename;
	private int insurancepremium;
	private int insurancenumber;
	private java.lang.String other;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.InsuranceCompany insuranceCompany;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="insurancepremium_id"
     */
	public java.lang.Long getInsurancepremiumID () {
		return insurancepremiumID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param insurancepremiumID the new ID
	 */
	public void setInsurancepremiumID (java.lang.Long insurancepremiumID) {
		this.insurancepremiumID = insurancepremiumID;
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
	 * Return the value associated with the column: insurance_type
	 */
	public java.lang.String getInsurancetype () {
		return insurancetype;
	}

	/**
	 * Set the value related to the column: insurance_type
	 * @param insurancetype the insurance_type value
	 */
	public void setInsurancetype (java.lang.String insurancetype) {
		this.insurancetype = insurancetype;
	}



	/**
	 * Return the value associated with the column: insurance_name
	 */
	public java.lang.String getInsurancename () {
		return insurancename;
	}

	/**
	 * Set the value related to the column: insurance_name
	 * @param insurancename the insurance_name value
	 */
	public void setInsurancename (java.lang.String insurancename) {
		this.insurancename = insurancename;
	}



	/**
	 * Return the value associated with the column: insurance_premium
	 */
	public int getInsurancepremium () {
		return insurancepremium;
	}

	/**
	 * Set the value related to the column: insurance_premium
	 * @param insurancepremium the insurance_premium value
	 */
	public void setInsurancepremium (int insurancepremium) {
		this.insurancepremium = insurancepremium;
	}



	/**
	 * Return the value associated with the column: insurance_number
	 */
	public int getInsurancenumber () {
		return insurancenumber;
	}

	/**
	 * Set the value related to the column: insurance_number
	 * @param insurancenumber the insurance_number value
	 */
	public void setInsurancenumber (int insurancenumber) {
		this.insurancenumber = insurancenumber;
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
	 * Return the value associated with the column: insuranceCompany
	 */
	public com.myhome.model.InsuranceCompany getInsuranceCompany () {
		return insuranceCompany;
	}

	/**
	 * Set the value related to the column: insuranceCompany
	 * @param insuranceCompany the insuranceCompany value
	 */
	public void setInsuranceCompany (com.myhome.model.InsuranceCompany insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
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
		if (!(obj instanceof com.myhome.model.InsurancePremium)) return false;
		else {
			com.myhome.model.InsurancePremium insurancePremium = (com.myhome.model.InsurancePremium) obj;
			if (null == this.getInsurancepremiumID() || null == insurancePremium.getInsurancepremiumID()) return false;
			else return (this.getInsurancepremiumID().equals(insurancePremium.getInsurancepremiumID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getInsurancepremiumID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getInsurancepremiumID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}