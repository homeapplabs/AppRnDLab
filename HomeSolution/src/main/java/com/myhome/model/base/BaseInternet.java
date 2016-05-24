package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the internet table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="internet"
 */

public abstract class BaseInternet  implements Serializable {

	public static String REF = "Internet";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_DATAUSAGE = "datausage";
	public static String PROP_OTHER = "other";
	public static String PROP_FIXEDRENTAL = "fixedrental";
	public static String PROP_COUNTRY = "country";
	public static String PROP_INTERNET_SERVICE_PROVIDER = "internetServiceProvider";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_RATEPERKB = "rateperkb";
	public static String PROP_INTERNET_I_D = "internetID";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseInternet () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseInternet (java.lang.Long internetID) {
		this.setInternetID(internetID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseInternet (
		java.lang.Long internetID,
		com.myhome.model.Customer customer) {

		this.setInternetID(internetID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long internetID;

	// fields
	private int rateperkb;
	private int amount;
	private int fixedrental;
	private int datausage;
	private java.util.Date duedate;
	private java.lang.String other;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.InternetServiceProvider internetServiceProvider;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="internet_id"
     */
	public java.lang.Long getInternetID () {
		return internetID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param internetID the new ID
	 */
	public void setInternetID (java.lang.Long internetID) {
		this.internetID = internetID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: rate_per_kb
	 */
	public int getRateperkb () {
		return rateperkb;
	}

	/**
	 * Set the value related to the column: rate_per_kb
	 * @param rateperkb the rate_per_kb value
	 */
	public void setRateperkb (int rateperkb) {
		this.rateperkb = rateperkb;
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
	 * Return the value associated with the column: fixed_rental
	 */
	public int getFixedrental () {
		return fixedrental;
	}

	/**
	 * Set the value related to the column: fixed_rental
	 * @param fixedrental the fixed_rental value
	 */
	public void setFixedrental (int fixedrental) {
		this.fixedrental = fixedrental;
	}



	/**
	 * Return the value associated with the column: datausage
	 */
	public int getDatausage () {
		return datausage;
	}

	/**
	 * Set the value related to the column: datausage
	 * @param datausage the datausage value
	 */
	public void setDatausage (int datausage) {
		this.datausage = datausage;
	}



	/**
	 * Return the value associated with the column: due_date
	 */
	public java.util.Date getDuedate () {
		return duedate;
	}

	/**
	 * Set the value related to the column: due_date
	 * @param duedate the due_date value
	 */
	public void setDuedate (java.util.Date duedate) {
		this.duedate = duedate;
	}



	/**
	 * Return the value associated with the column: other_internet
	 */
	public java.lang.String getOther () {
		return other;
	}

	/**
	 * Set the value related to the column: other_internet
	 * @param other the other_internet value
	 */
	public void setOther (java.lang.String other) {
		this.other = other;
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
	 * Return the value associated with the column: internetServiceProvider
	 */
	public com.myhome.model.InternetServiceProvider getInternetServiceProvider () {
		return internetServiceProvider;
	}

	/**
	 * Set the value related to the column: internetServiceProvider
	 * @param internetServiceProvider the internetServiceProvider value
	 */
	public void setInternetServiceProvider (com.myhome.model.InternetServiceProvider internetServiceProvider) {
		this.internetServiceProvider = internetServiceProvider;
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
		if (!(obj instanceof com.myhome.model.Internet)) return false;
		else {
			com.myhome.model.Internet internet = (com.myhome.model.Internet) obj;
			if (null == this.getInternetID() || null == internet.getInternetID()) return false;
			else return (this.getInternetID().equals(internet.getInternetID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getInternetID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getInternetID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}