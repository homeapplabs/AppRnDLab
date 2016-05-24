package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the craditcard table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="craditcard"
 */

public abstract class BaseCraditCard  implements Serializable {

	public static String REF = "CraditCard";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_CRADITCARDNAME = "craditcardname";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_CRADITCARD_I_D = "craditcardID";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_BANK = "bank";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseCraditCard () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCraditCard (java.lang.Long craditcardID) {
		this.setCraditcardID(craditcardID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCraditCard (
		java.lang.Long craditcardID,
		com.myhome.model.Customer customer) {

		this.setCraditcardID(craditcardID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long craditcardID;

	// fields
	private java.lang.String craditcardname;
	private int amount;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.Bank bank;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="craditcard_id"
     */
	public java.lang.Long getCraditcardID () {
		return craditcardID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param craditcardID the new ID
	 */
	public void setCraditcardID (java.lang.Long craditcardID) {
		this.craditcardID = craditcardID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: craditcardname
	 */
	public java.lang.String getCraditcardname () {
		return craditcardname;
	}

	/**
	 * Set the value related to the column: craditcardname
	 * @param craditcardname the craditcardname value
	 */
	public void setCraditcardname (java.lang.String craditcardname) {
		this.craditcardname = craditcardname;
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
	 * Return the value associated with the column: bank
	 */
	public com.myhome.model.Bank getBank () {
		return bank;
	}

	/**
	 * Set the value related to the column: bank
	 * @param bank the bank value
	 */
	public void setBank (com.myhome.model.Bank bank) {
		this.bank = bank;
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
		if (!(obj instanceof com.myhome.model.CraditCard)) return false;
		else {
			com.myhome.model.CraditCard craditCard = (com.myhome.model.CraditCard) obj;
			if (null == this.getCraditcardID() || null == craditCard.getCraditcardID()) return false;
			else return (this.getCraditcardID().equals(craditCard.getCraditcardID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getCraditcardID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getCraditcardID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}