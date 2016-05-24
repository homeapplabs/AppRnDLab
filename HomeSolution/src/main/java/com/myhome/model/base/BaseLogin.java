package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the login table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="login"
 */

public abstract class BaseLogin  implements Serializable {

	public static String REF = "Login";
	public static String PROP_LOGIN_I_D = "loginID";
	public static String PROP_LOGOUTDATETIME = "logoutdatetime";
	public static String PROP_LOGINDATETIME = "logindatetime";
	public static String PROP_USERNAME = "username";


	// constructors
	public BaseLogin () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLogin (java.lang.Long loginID) {
		this.setLoginID(loginID);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long loginID;

	// fields
	private java.lang.String username;
	private java.util.Date logindatetime;
	private java.util.Date logoutdatetime;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="login_id"
     */
	public java.lang.Long getLoginID () {
		return loginID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param loginID the new ID
	 */
	public void setLoginID (java.lang.Long loginID) {
		this.loginID = loginID;
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
	 * Return the value associated with the column: logindatetime
	 */
	public java.util.Date getLogindatetime () {
		return logindatetime;
	}

	/**
	 * Set the value related to the column: logindatetime
	 * @param logindatetime the logindatetime value
	 */
	public void setLogindatetime (java.util.Date logindatetime) {
		this.logindatetime = logindatetime;
	}



	/**
	 * Return the value associated with the column: logoutdatetime
	 */
	public java.util.Date getLogoutdatetime () {
		return logoutdatetime;
	}

	/**
	 * Set the value related to the column: logoutdatetime
	 * @param logoutdatetime the logoutdatetime value
	 */
	public void setLogoutdatetime (java.util.Date logoutdatetime) {
		this.logoutdatetime = logoutdatetime;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.Login)) return false;
		else {
			com.myhome.model.Login login = (com.myhome.model.Login) obj;
			if (null == this.getLoginID() || null == login.getLoginID()) return false;
			else return (this.getLoginID().equals(login.getLoginID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getLoginID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getLoginID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}