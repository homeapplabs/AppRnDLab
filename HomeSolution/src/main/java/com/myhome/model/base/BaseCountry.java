package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the country table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="country"
 */

public abstract class BaseCountry  implements Serializable {

	public static String REF = "Country";
	public static String PROP_STATUS = "status";
	public static String PROP_COUNTRY_NAME = "countryName";
	public static String PROP_COUNTRY_CODE = "countryCode";


	// constructors
	public BaseCountry () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCountry (java.lang.String countryCode) {
		this.setCountryCode(countryCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String countryCode;

	// fields
	private java.lang.String countryName;
	private boolean status;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="country_code"
     */
	public java.lang.String getCountryCode () {
		return countryCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param countryCode the new ID
	 */
	public void setCountryCode (java.lang.String countryCode) {
		this.countryCode = countryCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: country_name
	 */
	public java.lang.String getCountryName () {
		return countryName;
	}

	/**
	 * Set the value related to the column: country_name
	 * @param countryName the country_name value
	 */
	public void setCountryName (java.lang.String countryName) {
		this.countryName = countryName;
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
		if (!(obj instanceof com.myhome.model.Country)) return false;
		else {
			com.myhome.model.Country country = (com.myhome.model.Country) obj;
			if (null == this.getCountryCode() || null == country.getCountryCode()) return false;
			else return (this.getCountryCode().equals(country.getCountryCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getCountryCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getCountryCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}