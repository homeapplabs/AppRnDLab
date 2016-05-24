package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the district table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="district"
 */

public abstract class BaseDistrict  implements Serializable {

	public static String REF = "District";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_CODE = "districtCode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";
	public static String PROP_STATE_CODE = "stateCode";
	public static String PROP_DISTRICTNAME = "districtname";


	// constructors
	public BaseDistrict () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseDistrict (java.lang.String districtCode) {
		this.setDistrictCode(districtCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String districtCode;

	// fields
	private java.lang.String districtname;
	private java.lang.String stateCode;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="district_code"
     */
	public java.lang.String getDistrictCode () {
		return districtCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param districtCode the new ID
	 */
	public void setDistrictCode (java.lang.String districtCode) {
		this.districtCode = districtCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: district_name
	 */
	public java.lang.String getDistrictname () {
		return districtname;
	}

	/**
	 * Set the value related to the column: district_name
	 * @param districtname the district_name value
	 */
	public void setDistrictname (java.lang.String districtname) {
		this.districtname = districtname;
	}



	/**
	 * Return the value associated with the column: state_code
	 */
	public java.lang.String getStateCode () {
		return stateCode;
	}

	/**
	 * Set the value related to the column: state_code
	 * @param stateCode the state_code value
	 */
	public void setStateCode (java.lang.String stateCode) {
		this.stateCode = stateCode;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.District)) return false;
		else {
			com.myhome.model.District district = (com.myhome.model.District) obj;
			if (null == this.getDistrictCode() || null == district.getDistrictCode()) return false;
			else return (this.getDistrictCode().equals(district.getDistrictCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getDistrictCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getDistrictCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}