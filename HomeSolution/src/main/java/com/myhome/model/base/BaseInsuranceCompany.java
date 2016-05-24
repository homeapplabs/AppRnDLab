package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the insurance_company table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="insurance_company"
 */

public abstract class BaseInsuranceCompany  implements Serializable {

	public static String REF = "InsuranceCompany";
	public static String PROP_INSURANCE_COMPANY_CODE = "insuranceCompanyCode";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_INSURANCE_COMPANY_NAME = "insuranceCompanyName";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseInsuranceCompany () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseInsuranceCompany (java.lang.Long insuranceCompanyCode) {
		this.setInsuranceCompanyCode(insuranceCompanyCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long insuranceCompanyCode;

	// fields
	private java.lang.String insuranceCompanyName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="insurance_company_code"
     */
	public java.lang.Long getInsuranceCompanyCode () {
		return insuranceCompanyCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param insuranceCompanyCode the new ID
	 */
	public void setInsuranceCompanyCode (java.lang.Long insuranceCompanyCode) {
		this.insuranceCompanyCode = insuranceCompanyCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: insurance_company_name
	 */
	public java.lang.String getInsuranceCompanyName () {
		return insuranceCompanyName;
	}

	/**
	 * Set the value related to the column: insurance_company_name
	 * @param insuranceCompanyName the insurance_company_name value
	 */
	public void setInsuranceCompanyName (java.lang.String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
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
	 * Return the value associated with the column: districtTown
	 */
	public com.myhome.model.District getDistrictTown () {
		return districtTown;
	}

	/**
	 * Set the value related to the column: districtTown
	 * @param districtTown the districtTown value
	 */
	public void setDistrictTown (com.myhome.model.District districtTown) {
		this.districtTown = districtTown;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.InsuranceCompany)) return false;
		else {
			com.myhome.model.InsuranceCompany insuranceCompany = (com.myhome.model.InsuranceCompany) obj;
			if (null == this.getInsuranceCompanyCode() || null == insuranceCompany.getInsuranceCompanyCode()) return false;
			else return (this.getInsuranceCompanyCode().equals(insuranceCompany.getInsuranceCompanyCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getInsuranceCompanyCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getInsuranceCompanyCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}