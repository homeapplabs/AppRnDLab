package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the internet_service_provider table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="internet_service_provider"
 */

public abstract class BaseInternetServiceProvider  implements Serializable {

	public static String REF = "InternetServiceProvider";
	public static String PROP_STATUS = "status";
	public static String PROP_INTERNET_SERVICE_PROVIDER_CODE = "internetServiceProviderCode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_INTERNET_SERVICE_PROVIDER_NAME = "internetServiceProviderName";


	// constructors
	public BaseInternetServiceProvider () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseInternetServiceProvider (java.lang.String internetServiceProviderCode) {
		this.setInternetServiceProviderCode(internetServiceProviderCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String internetServiceProviderCode;

	// fields
	private java.lang.String internetServiceProviderName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="internet_service_provider_code"
     */
	public java.lang.String getInternetServiceProviderCode () {
		return internetServiceProviderCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param internetServiceProviderCode the new ID
	 */
	public void setInternetServiceProviderCode (java.lang.String internetServiceProviderCode) {
		this.internetServiceProviderCode = internetServiceProviderCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: internet_service_provider_name
	 */
	public java.lang.String getInternetServiceProviderName () {
		return internetServiceProviderName;
	}

	/**
	 * Set the value related to the column: internet_service_provider_name
	 * @param internetServiceProviderName the internet_service_provider_name value
	 */
	public void setInternetServiceProviderName (java.lang.String internetServiceProviderName) {
		this.internetServiceProviderName = internetServiceProviderName;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.InternetServiceProvider)) return false;
		else {
			com.myhome.model.InternetServiceProvider internetServiceProvider = (com.myhome.model.InternetServiceProvider) obj;
			if (null == this.getInternetServiceProviderCode() || null == internetServiceProvider.getInternetServiceProviderCode()) return false;
			else return (this.getInternetServiceProviderCode().equals(internetServiceProvider.getInternetServiceProviderCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getInternetServiceProviderCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getInternetServiceProviderCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}