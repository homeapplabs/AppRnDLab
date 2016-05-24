package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the phoneMobile table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="phoneMobile"
 */

public abstract class BasePhoneMobile  implements Serializable {

	public static String REF = "PhoneMobile";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_PHONEMOBILENUMBER = "phonemobilenumber";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_PHONEMOBILE_I_D = "phonemobileID";
	public static String PROP_PHONE_MOBILE_SERVICE_PROVIDER = "phoneMobileServiceProvider";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BasePhoneMobile () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePhoneMobile (java.lang.Long phonemobileID) {
		this.setPhonemobileID(phonemobileID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePhoneMobile (
		java.lang.Long phonemobileID,
		com.myhome.model.Customer customer) {

		this.setPhonemobileID(phonemobileID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long phonemobileID;

	// fields
	private int phonemobilenumber;
	private int amount;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.PhoneMobileServiceProvider phoneMobileServiceProvider;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="phonemobile_id"
     */
	public java.lang.Long getPhonemobileID () {
		return phonemobileID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param phonemobileID the new ID
	 */
	public void setPhonemobileID (java.lang.Long phonemobileID) {
		this.phonemobileID = phonemobileID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: phonemobilenumber
	 */
	public int getPhonemobilenumber () {
		return phonemobilenumber;
	}

	/**
	 * Set the value related to the column: phonemobilenumber
	 * @param phonemobilenumber the phonemobilenumber value
	 */
	public void setPhonemobilenumber (int phonemobilenumber) {
		this.phonemobilenumber = phonemobilenumber;
	}



	/**
	 * Return the value associated with the column: amount
	 */
	public int getAmount () {
		return amount;
	}

	/**
	 * Set the value related to the column: amount
	 * @param amount the amount value
	 */
	public void setAmount (int amount) {
		this.amount = amount;
	}



	/**
	 * Return the value associated with the column: duedate
	 */
	public java.util.Date getDuedate () {
		return duedate;
	}

	/**
	 * Set the value related to the column: duedate
	 * @param duedate the duedate value
	 */
	public void setDuedate (java.util.Date duedate) {
		this.duedate = duedate;
	}



	/**
	 * Return the value associated with the column: makemeremind
	 */
	public java.lang.String getMakemeremind () {
		return makemeremind;
	}

	/**
	 * Set the value related to the column: makemeremind
	 * @param makemeremind the makemeremind value
	 */
	public void setMakemeremind (java.lang.String makemeremind) {
		this.makemeremind = makemeremind;
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
	 * Return the value associated with the column: phoneMobileServiceProvider
	 */
	public com.myhome.model.PhoneMobileServiceProvider getPhoneMobileServiceProvider () {
		return phoneMobileServiceProvider;
	}

	/**
	 * Set the value related to the column: phoneMobileServiceProvider
	 * @param phoneMobileServiceProvider the phoneMobileServiceProvider value
	 */
	public void setPhoneMobileServiceProvider (com.myhome.model.PhoneMobileServiceProvider phoneMobileServiceProvider) {
		this.phoneMobileServiceProvider = phoneMobileServiceProvider;
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



	/**
	 * Return the value associated with the column: customer
	 */
	public com.myhome.model.Customer getCustomer () {
		return customer;
	}

	/**
	 * Set the value related to the column: customer
	 * @param customer the customer value
	 */
	public void setCustomer (com.myhome.model.Customer customer) {
		this.customer = customer;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.PhoneMobile)) return false;
		else {
			com.myhome.model.PhoneMobile phoneMobile = (com.myhome.model.PhoneMobile) obj;
			if (null == this.getPhonemobileID() || null == phoneMobile.getPhonemobileID()) return false;
			else return (this.getPhonemobileID().equals(phoneMobile.getPhonemobileID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getPhonemobileID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getPhonemobileID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}