package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the bank table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="bank"
 */

public abstract class BaseBank  implements Serializable {

	public static String REF = "Bank";
	public static String PROP_STATUS = "status";
	public static String PROP_BANK_CODE = "bankCode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_BANK_NAME = "bankName";


	// constructors
	public BaseBank () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBank (java.lang.Long bankCode) {
		this.setBankCode(bankCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long bankCode;

	// fields
	private java.lang.String bankName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="bank_code"
     */
	public java.lang.Long getBankCode () {
		return bankCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param bankCode the new ID
	 */
	public void setBankCode (java.lang.Long bankCode) {
		this.bankCode = bankCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: bank_name
	 */
	public java.lang.String getBankName () {
		return bankName;
	}

	/**
	 * Set the value related to the column: bank_name
	 * @param bankName the bank_name value
	 */
	public void setBankName (java.lang.String bankName) {
		this.bankName = bankName;
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
		if (!(obj instanceof com.myhome.model.Bank)) return false;
		else {
			com.myhome.model.Bank bank = (com.myhome.model.Bank) obj;
			if (null == this.getBankCode() || null == bank.getBankCode()) return false;
			else return (this.getBankCode().equals(bank.getBankCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getBankCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getBankCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}