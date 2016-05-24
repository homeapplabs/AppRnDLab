package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the magzine table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="magzine"
 */

public abstract class BaseMagzine  implements Serializable {

	public static String REF = "Magzine";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_MAGZINE_I_D = "magzineID";
	public static String PROP_COUNTRY = "country";
	public static String PROP_MONTH = "month";
	public static String PROP_MAGZINE_NAME = "magzineName";


	// constructors
	public BaseMagzine () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMagzine (java.lang.Long magzineID) {
		this.setMagzineID(magzineID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMagzine (
		java.lang.Long magzineID,
		com.myhome.model.Customer customer) {

		this.setMagzineID(magzineID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long magzineID;

	// fields
	private java.lang.String magzineName;
	private int month;
	private int amount;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="magzine_id"
     */
	public java.lang.Long getMagzineID () {
		return magzineID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param magzineID the new ID
	 */
	public void setMagzineID (java.lang.Long magzineID) {
		this.magzineID = magzineID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: magzine_name
	 */
	public java.lang.String getMagzineName () {
		return magzineName;
	}

	/**
	 * Set the value related to the column: magzine_name
	 * @param magzineName the magzine_name value
	 */
	public void setMagzineName (java.lang.String magzineName) {
		this.magzineName = magzineName;
	}



	/**
	 * Return the value associated with the column: month_name
	 */
	public int getMonth () {
		return month;
	}

	/**
	 * Set the value related to the column: month_name
	 * @param month the month_name value
	 */
	public void setMonth (int month) {
		this.month = month;
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
		if (!(obj instanceof com.myhome.model.Magzine)) return false;
		else {
			com.myhome.model.Magzine magzine = (com.myhome.model.Magzine) obj;
			if (null == this.getMagzineID() || null == magzine.getMagzineID()) return false;
			else return (this.getMagzineID().equals(magzine.getMagzineID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getMagzineID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getMagzineID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}