package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the newspaper table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="newspaper"
 */

public abstract class BaseNewspaper  implements Serializable {

	public static String REF = "Newspaper";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_NEWSPAPER_I_D = "newspaperID";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_NEWS_AGENCY = "newsAgency";
	public static String PROP_COUNTRY = "country";
	public static String PROP_MONTH = "month";
	public static String PROP_NEWSPAPER_NAME = "newspaperName";


	// constructors
	public BaseNewspaper () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseNewspaper (java.lang.Long newspaperID) {
		this.setNewspaperID(newspaperID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseNewspaper (
		java.lang.Long newspaperID,
		com.myhome.model.Customer customer) {

		this.setNewspaperID(newspaperID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long newspaperID;

	// fields
	private java.lang.String newspaperName;
	private int month;
	private int amount;
	private boolean status;

	// one to one
	private com.myhome.model.NewsAgency newsAgency;
	private com.myhome.model.Country country;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="newspaper_id"
     */
	public java.lang.Long getNewspaperID () {
		return newspaperID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param newspaperID the new ID
	 */
	public void setNewspaperID (java.lang.Long newspaperID) {
		this.newspaperID = newspaperID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: newspaper_name
	 */
	public java.lang.String getNewspaperName () {
		return newspaperName;
	}

	/**
	 * Set the value related to the column: newspaper_name
	 * @param newspaperName the newspaper_name value
	 */
	public void setNewspaperName (java.lang.String newspaperName) {
		this.newspaperName = newspaperName;
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
	 * Return the value associated with the column: newsAgency
	 */
	public com.myhome.model.NewsAgency getNewsAgency () {
		return newsAgency;
	}

	/**
	 * Set the value related to the column: newsAgency
	 * @param newsAgency the newsAgency value
	 */
	public void setNewsAgency (com.myhome.model.NewsAgency newsAgency) {
		this.newsAgency = newsAgency;
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
		if (!(obj instanceof com.myhome.model.Newspaper)) return false;
		else {
			com.myhome.model.Newspaper newspaper = (com.myhome.model.Newspaper) obj;
			if (null == this.getNewspaperID() || null == newspaper.getNewspaperID()) return false;
			else return (this.getNewspaperID().equals(newspaper.getNewspaperID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getNewspaperID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getNewspaperID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}