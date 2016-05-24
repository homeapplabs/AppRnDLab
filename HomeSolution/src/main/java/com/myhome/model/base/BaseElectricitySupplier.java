package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the electricity_supplier table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="electricity_supplier"
 */

public abstract class BaseElectricitySupplier  implements Serializable {

	public static String REF = "ElectricitySupplier";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_ELECTRICITY_SUPPLIER_CODE = "electricitySupplierCode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_ELECTRICITY_SUPPLIER_NAME = "electricitySupplierName";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseElectricitySupplier () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseElectricitySupplier (java.lang.Long electricitySupplierCode) {
		this.setElectricitySupplierCode(electricitySupplierCode);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseElectricitySupplier (
		java.lang.Long electricitySupplierCode,
		com.myhome.model.Customer customer) {

		this.setElectricitySupplierCode(electricitySupplierCode);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long electricitySupplierCode;

	// fields
	private java.lang.String electricitySupplierName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="electricity_supplier_code"
     */
	public java.lang.Long getElectricitySupplierCode () {
		return electricitySupplierCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param electricitySupplierCode the new ID
	 */
	public void setElectricitySupplierCode (java.lang.Long electricitySupplierCode) {
		this.electricitySupplierCode = electricitySupplierCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: electricity_supplier_name
	 */
	public java.lang.String getElectricitySupplierName () {
		return electricitySupplierName;
	}

	/**
	 * Set the value related to the column: electricity_supplier_name
	 * @param electricitySupplierName the electricity_supplier_name value
	 */
	public void setElectricitySupplierName (java.lang.String electricitySupplierName) {
		this.electricitySupplierName = electricitySupplierName;
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
		if (!(obj instanceof com.myhome.model.ElectricitySupplier)) return false;
		else {
			com.myhome.model.ElectricitySupplier electricitySupplier = (com.myhome.model.ElectricitySupplier) obj;
			if (null == this.getElectricitySupplierCode() || null == electricitySupplier.getElectricitySupplierCode()) return false;
			else return (this.getElectricitySupplierCode().equals(electricitySupplier.getElectricitySupplierCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getElectricitySupplierCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getElectricitySupplierCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}