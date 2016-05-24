package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the cradit_Card_Provider_Bank table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="cradit_Card_Provider_Bank"
 */

public abstract class BaseCraditCardProviderBank  implements Serializable {

	public static String REF = "CraditCardProviderBank";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_CRADITCARDPROVIDERBANKCODE = "craditcardproviderbankcode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_CRADIT_CARD_PROVIDER_BANK_NAME = "craditCardProviderBankName";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseCraditCardProviderBank () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCraditCardProviderBank (java.lang.Long craditcardproviderbankcode) {
		this.setCraditcardproviderbankcode(craditcardproviderbankcode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long craditcardproviderbankcode;

	// fields
	private java.lang.String craditCardProviderBankName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="cradit_card_provider_bank_code"
     */
	public java.lang.Long getCraditcardproviderbankcode () {
		return craditcardproviderbankcode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param craditcardproviderbankcode the new ID
	 */
	public void setCraditcardproviderbankcode (java.lang.Long craditcardproviderbankcode) {
		this.craditcardproviderbankcode = craditcardproviderbankcode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: cradit_card_provider_bank_name
	 */
	public java.lang.String getCraditCardProviderBankName () {
		return craditCardProviderBankName;
	}

	/**
	 * Set the value related to the column: cradit_card_provider_bank_name
	 * @param craditCardProviderBankName the cradit_card_provider_bank_name value
	 */
	public void setCraditCardProviderBankName (java.lang.String craditCardProviderBankName) {
		this.craditCardProviderBankName = craditCardProviderBankName;
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
		if (!(obj instanceof com.myhome.model.CraditCardProviderBank)) return false;
		else {
			com.myhome.model.CraditCardProviderBank craditCardProviderBank = (com.myhome.model.CraditCardProviderBank) obj;
			if (null == this.getCraditcardproviderbankcode() || null == craditCardProviderBank.getCraditcardproviderbankcode()) return false;
			else return (this.getCraditcardproviderbankcode().equals(craditCardProviderBank.getCraditcardproviderbankcode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getCraditcardproviderbankcode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getCraditcardproviderbankcode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}