package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the tv_service_provider table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="tv_service_provider"
 */

public abstract class BaseTVServiceProvider  implements Serializable {

	public static String REF = "TVServiceProvider";
	public static String PROP_STATUS = "status";
	public static String PROP_TV_SERVICE_PROVIDER_CODE = "tvServiceProviderCode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_TV_SERVICE_PROVIDER_NAME = "tvServiceProviderName";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseTVServiceProvider () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTVServiceProvider (java.lang.Long tvServiceProviderCode) {
		this.setTvServiceProviderCode(tvServiceProviderCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long tvServiceProviderCode;

	// fields
	private java.lang.String tvServiceProviderName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="tv_service_provider_code"
     */
	public java.lang.Long getTvServiceProviderCode () {
		return tvServiceProviderCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param tvServiceProviderCode the new ID
	 */
	public void setTvServiceProviderCode (java.lang.Long tvServiceProviderCode) {
		this.tvServiceProviderCode = tvServiceProviderCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: tv_service_provider_name
	 */
	public java.lang.String getTvServiceProviderName () {
		return tvServiceProviderName;
	}

	/**
	 * Set the value related to the column: tv_service_provider_name
	 * @param tvServiceProviderName the tv_service_provider_name value
	 */
	public void setTvServiceProviderName (java.lang.String tvServiceProviderName) {
		this.tvServiceProviderName = tvServiceProviderName;
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
		if (!(obj instanceof com.myhome.model.TVServiceProvider)) return false;
		else {
			com.myhome.model.TVServiceProvider tVServiceProvider = (com.myhome.model.TVServiceProvider) obj;
			if (null == this.getTvServiceProviderCode() || null == tVServiceProvider.getTvServiceProviderCode()) return false;
			else return (this.getTvServiceProviderCode().equals(tVServiceProvider.getTvServiceProviderCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getTvServiceProviderCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getTvServiceProviderCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}