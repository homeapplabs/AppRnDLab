package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the service_provider table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="service_provider"
 */

public abstract class BaseServiceProvider  implements Serializable {

	public static String REF = "ServiceProvider";
	public static String PROP_STATUS = "status";
	public static String PROP_SERVICE_PROVIDER_CODE = "serviceProviderCode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";
	public static String PROP_SERVICE_PROVIDER_NAME = "serviceProviderName";


	// constructors
	public BaseServiceProvider () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseServiceProvider (java.lang.Long serviceProviderCode) {
		this.setServiceProviderCode(serviceProviderCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long serviceProviderCode;

	// fields
	private java.lang.String serviceProviderName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="service_provider_code"
     */
	public java.lang.Long getServiceProviderCode () {
		return serviceProviderCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param serviceProviderCode the new ID
	 */
	public void setServiceProviderCode (java.lang.Long serviceProviderCode) {
		this.serviceProviderCode = serviceProviderCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: service_provider_name
	 */
	public java.lang.String getServiceProviderName () {
		return serviceProviderName;
	}

	/**
	 * Set the value related to the column: service_provider_name
	 * @param serviceProviderName the service_provider_name value
	 */
	public void setServiceProviderName (java.lang.String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
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
		if (!(obj instanceof com.myhome.model.ServiceProvider)) return false;
		else {
			com.myhome.model.ServiceProvider serviceProvider = (com.myhome.model.ServiceProvider) obj;
			if (null == this.getServiceProviderCode() || null == serviceProvider.getServiceProviderCode()) return false;
			else return (this.getServiceProviderCode().equals(serviceProvider.getServiceProviderCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getServiceProviderCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getServiceProviderCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}