package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the registration table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="registration"
 */

public abstract class BaseRegistration  implements Serializable {

	public static String REF = "Registration";
	public static String PROP_UPDATED = "updated";
	public static String PROP_STATUS = "status";
	public static String PROP_REGISTRATION_I_D = "registrationID";
	public static String PROP_CREATED = "created";
	public static String PROP_PASSWORD = "password";
	public static String PROP_USERNAME = "username";


	// constructors
	public BaseRegistration () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseRegistration (java.lang.Long registrationID) {
		this.setRegistrationID(registrationID);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long registrationID;

	// fields
	private java.lang.String username;
	private java.lang.String password;
	private java.util.Date created;
	private java.util.Date updated;
	private boolean status;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="registration_id"
     */
	public java.lang.Long getRegistrationID () {
		return registrationID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param registrationID the new ID
	 */
	public void setRegistrationID (java.lang.Long registrationID) {
		this.registrationID = registrationID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: user_name
	 */
	public java.lang.String getUsername () {
		return username;
	}

	/**
	 * Set the value related to the column: user_name
	 * @param username the user_name value
	 */
	public void setUsername (java.lang.String username) {
		this.username = username;
	}



	/**
	 * Return the value associated with the column: password
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: password
	 * @param password the password value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}



	/**
	 * Return the value associated with the column: created
	 */
	public java.util.Date getCreated () {
		return created;
	}

	/**
	 * Set the value related to the column: created
	 * @param created the created value
	 */
	public void setCreated (java.util.Date created) {
		this.created = created;
	}



	/**
	 * Return the value associated with the column: updated
	 */
	public java.util.Date getUpdated () {
		return updated;
	}

	/**
	 * Set the value related to the column: updated
	 * @param updated the updated value
	 */
	public void setUpdated (java.util.Date updated) {
		this.updated = updated;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.Registration)) return false;
		else {
			com.myhome.model.Registration registration = (com.myhome.model.Registration) obj;
			if (null == this.getRegistrationID() || null == registration.getRegistrationID()) return false;
			else return (this.getRegistrationID().equals(registration.getRegistrationID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getRegistrationID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getRegistrationID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}