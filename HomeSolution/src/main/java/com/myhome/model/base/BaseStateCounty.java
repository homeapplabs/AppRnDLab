package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the state_county_code table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="state_county_code"
 */

public abstract class BaseStateCounty  implements Serializable {

	public static String REF = "StateCounty";
	public static String PROP_STATE_COUNTY_NAME = "State_countyName";
	public static String PROP_STATUS = "status";
	public static String PROP_COUNTRY_CODE = "countryCode";
	public static String PROP_STATE_COUNTY_I_D = "stateCountyID";


	// constructors
	public BaseStateCounty () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseStateCounty (java.lang.String stateCountyID) {
		this.setStateCountyID(stateCountyID);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String stateCountyID;

	// fields
	private java.lang.String state_countyName;
	private java.lang.String countryCode;
	private boolean status;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="state_county_id"
     */
	public java.lang.String getStateCountyID () {
		return stateCountyID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param stateCountyID the new ID
	 */
	public void setStateCountyID (java.lang.String stateCountyID) {
		this.stateCountyID = stateCountyID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: state_county_name
	 */
	public java.lang.String getState_countyName () {
		return state_countyName;
	}

	/**
	 * Set the value related to the column: state_county_name
	 * @param state_countyName the state_county_name value
	 */
	public void setState_countyName (java.lang.String state_countyName) {
		this.state_countyName = state_countyName;
	}



	/**
	 * Return the value associated with the column: country_code
	 */
	public java.lang.String getCountryCode () {
		return countryCode;
	}

	/**
	 * Set the value related to the column: country_code
	 * @param countryCode the country_code value
	 */
	public void setCountryCode (java.lang.String countryCode) {
		this.countryCode = countryCode;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.StateCounty)) return false;
		else {
			com.myhome.model.StateCounty stateCounty = (com.myhome.model.StateCounty) obj;
			if (null == this.getStateCountyID() || null == stateCounty.getStateCountyID()) return false;
			else return (this.getStateCountyID().equals(stateCounty.getStateCountyID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getStateCountyID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getStateCountyID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}