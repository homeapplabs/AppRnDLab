package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the loan_provider table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="loan_provider"
 */

public abstract class BaseLoanProvider  implements Serializable {

	public static String REF = "LoanProvider";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_LOAN_PROVIDER_CODE = "loanProviderCode";
	public static String PROP_INSURANCE_PROVIDER_NAME = "insuranceProviderName";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseLoanProvider () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLoanProvider (java.lang.Long loanProviderCode) {
		this.setLoanProviderCode(loanProviderCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long loanProviderCode;

	// fields
	private java.lang.String insuranceProviderName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="loan_provider_code"
     */
	public java.lang.Long getLoanProviderCode () {
		return loanProviderCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param loanProviderCode the new ID
	 */
	public void setLoanProviderCode (java.lang.Long loanProviderCode) {
		this.loanProviderCode = loanProviderCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: insurance_provider_name
	 */
	public java.lang.String getInsuranceProviderName () {
		return insuranceProviderName;
	}

	/**
	 * Set the value related to the column: insurance_provider_name
	 * @param insuranceProviderName the insurance_provider_name value
	 */
	public void setInsuranceProviderName (java.lang.String insuranceProviderName) {
		this.insuranceProviderName = insuranceProviderName;
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
		if (!(obj instanceof com.myhome.model.LoanProvider)) return false;
		else {
			com.myhome.model.LoanProvider loanProvider = (com.myhome.model.LoanProvider) obj;
			if (null == this.getLoanProviderCode() || null == loanProvider.getLoanProviderCode()) return false;
			else return (this.getLoanProviderCode().equals(loanProvider.getLoanProviderCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getLoanProviderCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getLoanProviderCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}