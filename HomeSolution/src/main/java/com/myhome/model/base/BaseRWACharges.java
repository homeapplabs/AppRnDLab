package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the rwacharges table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="rwacharges"
 */

public abstract class BaseRWACharges  implements Serializable {

	public static String REF = "RWACharges";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_SOCIETYNAME = "societyname";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_OTHER = "other";
	public static String PROP_RWACHARGES_I_D = "rwachargesID";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseRWACharges () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseRWACharges (java.lang.Long rwachargesID) {
		this.setRwachargesID(rwachargesID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseRWACharges (
		java.lang.Long rwachargesID,
		com.myhome.model.Customer customer) {

		this.setRwachargesID(rwachargesID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long rwachargesID;

	// fields
	private java.lang.String societyname;
	private int amount;
	private java.lang.String other;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="rwacharges_id"
     */
	public java.lang.Long getRwachargesID () {
		return rwachargesID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param rwachargesID the new ID
	 */
	public void setRwachargesID (java.lang.Long rwachargesID) {
		this.rwachargesID = rwachargesID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: society_name
	 */
	public java.lang.String getSocietyname () {
		return societyname;
	}

	/**
	 * Set the value related to the column: society_name
	 * @param societyname the society_name value
	 */
	public void setSocietyname (java.lang.String societyname) {
		this.societyname = societyname;
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
	 * Return the value associated with the column: other_loan
	 */
	public java.lang.String getOther () {
		return other;
	}

	/**
	 * Set the value related to the column: other_loan
	 * @param other the other_loan value
	 */
	public void setOther (java.lang.String other) {
		this.other = other;
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
		if (!(obj instanceof com.myhome.model.RWACharges)) return false;
		else {
			com.myhome.model.RWACharges rWACharges = (com.myhome.model.RWACharges) obj;
			if (null == this.getRwachargesID() || null == rWACharges.getRwachargesID()) return false;
			else return (this.getRwachargesID().equals(rWACharges.getRwachargesID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getRwachargesID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getRwachargesID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}