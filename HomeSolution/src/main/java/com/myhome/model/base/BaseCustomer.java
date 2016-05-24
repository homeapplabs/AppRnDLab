package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the customer table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="customer"
 */

public abstract class BaseCustomer  implements Serializable {

	public static String REF = "Customer";
	public static String PROP_STATUS = "status";
	public static String PROP_LAST_UPDATED = "lastUpdated";
	public static String PROP_CUSTOMER_ID = "customerId";
	public static String PROP_ADDRESS = "address";
	public static String PROP_GENDER = "gender";
	public static String PROP_CREATED_DATE = "createdDate";
	public static String PROP_FIRST_NAME = "firstName";
	public static String PROP_FAMILY_NAME = "familyName";
	public static String PROP_DOB = "dob";


	// constructors
	public BaseCustomer () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCustomer (java.lang.Long customerId) {
		this.setCustomerId(customerId);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long customerId;

	// fields
	private java.lang.String firstName;
	private java.lang.String familyName;
	private java.lang.String gender;
	private java.util.Date createdDate;
	private java.util.Date lastUpdated;
	private java.util.Date dob;
	private boolean status;

	// one to one
	private com.myhome.model.Address address;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="customer_id"
     */
	public java.lang.Long getCustomerId () {
		return customerId;
	}

	/**
	 * Set the unique identifier of this class
	 * @param customerId the new ID
	 */
	public void setCustomerId (java.lang.Long customerId) {
		this.customerId = customerId;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: first_name
	 */
	public java.lang.String getFirstName () {
		return firstName;
	}

	/**
	 * Set the value related to the column: first_name
	 * @param firstName the first_name value
	 */
	public void setFirstName (java.lang.String firstName) {
		this.firstName = firstName;
	}



	/**
	 * Return the value associated with the column: family_name
	 */
	public java.lang.String getFamilyName () {
		return familyName;
	}

	/**
	 * Set the value related to the column: family_name
	 * @param familyName the family_name value
	 */
	public void setFamilyName (java.lang.String familyName) {
		this.familyName = familyName;
	}



	/**
	 * Return the value associated with the column: gender
	 */
	public java.lang.String getGender () {
		return gender;
	}

	/**
	 * Set the value related to the column: gender
	 * @param gender the gender value
	 */
	public void setGender (java.lang.String gender) {
		this.gender = gender;
	}



	/**
	 * Return the value associated with the column: created_date
	 */
	public java.util.Date getCreatedDate () {
		return createdDate;
	}

	/**
	 * Set the value related to the column: created_date
	 * @param createdDate the created_date value
	 */
	public void setCreatedDate (java.util.Date createdDate) {
		this.createdDate = createdDate;
	}



	/**
	 * Return the value associated with the column: last_updated
	 */
	public java.util.Date getLastUpdated () {
		return lastUpdated;
	}

	/**
	 * Set the value related to the column: last_updated
	 * @param lastUpdated the last_updated value
	 */
	public void setLastUpdated (java.util.Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}



	/**
	 * Return the value associated with the column: dob
	 */
	public java.util.Date getDob () {
		return dob;
	}

	/**
	 * Set the value related to the column: dob
	 * @param dob the dob value
	 */
	public void setDob (java.util.Date dob) {
		this.dob = dob;
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
	 * Return the value associated with the column: address
	 */
	public com.myhome.model.Address getAddress () {
		return address;
	}

	/**
	 * Set the value related to the column: address
	 * @param address the address value
	 */
	public void setAddress (com.myhome.model.Address address) {
		this.address = address;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.Customer)) return false;
		else {
			com.myhome.model.Customer customer = (com.myhome.model.Customer) obj;
			if (null == this.getCustomerId() || null == customer.getCustomerId()) return false;
			else return (this.getCustomerId().equals(customer.getCustomerId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getCustomerId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getCustomerId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}