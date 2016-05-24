package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the phone_mobile_service_provider table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="phone_mobile_service_provider"
 */

public abstract class BasePhoneMobileServiceProvider  implements Serializable {

	public static String REF = "PhoneMobileServiceProvider";
	public static String PROP_PHONE_MOBILE_SERVICE_PROVIDER_NAME = "phoneMobileServiceProviderName";
	public static String PROP_STATUS = "status";
	public static String PROP_COUNTRY = "country";
	public static String PROP_PHONE_MOBILE_SERVICE_PROVIDER_CODE = "phoneMobileServiceProviderCode";


	// constructors
	public BasePhoneMobileServiceProvider () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePhoneMobileServiceProvider (java.lang.String phoneMobileServiceProviderCode) {
		this.setPhoneMobileServiceProviderCode(phoneMobileServiceProviderCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String phoneMobileServiceProviderCode;

	// fields
	private java.lang.String phoneMobileServiceProviderName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="phone_mobile_service_provider_code"
     */
	public java.lang.String getPhoneMobileServiceProviderCode () {
		return phoneMobileServiceProviderCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param phoneMobileServiceProviderCode the new ID
	 */
	public void setPhoneMobileServiceProviderCode (java.lang.String phoneMobileServiceProviderCode) {
		this.phoneMobileServiceProviderCode = phoneMobileServiceProviderCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: phone_mobile_service_provider_name
	 */
	public java.lang.String getPhoneMobileServiceProviderName () {
		return phoneMobileServiceProviderName;
	}

	/**
	 * Set the value related to the column: phone_mobile_service_provider_name
	 * @param phoneMobileServiceProviderName the phone_mobile_service_provider_name value
	 */
	public void setPhoneMobileServiceProviderName (java.lang.String phoneMobileServiceProviderName) {
		this.phoneMobileServiceProviderName = phoneMobileServiceProviderName;
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
		if (!(obj instanceof com.myhome.model.PhoneMobileServiceProvider)) return false;
		else {
			com.myhome.model.PhoneMobileServiceProvider phoneMobileServiceProvider = (com.myhome.model.PhoneMobileServiceProvider) obj;
			if (null == this.getPhoneMobileServiceProviderCode() || null == phoneMobileServiceProvider.getPhoneMobileServiceProviderCode()) return false;
			else return (this.getPhoneMobileServiceProviderCode().equals(phoneMobileServiceProvider.getPhoneMobileServiceProviderCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getPhoneMobileServiceProviderCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getPhoneMobileServiceProviderCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}