package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the milk_supplier table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="milk_supplier"
 */

public abstract class BaseMilkSupplier  implements Serializable {

	public static String REF = "MilkSupplier";
	public static String PROP_MILK_SUPPLIER_CODE = "milkSupplierCode";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_MILK_SUPPLIER_NAME = "milkSupplierName";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseMilkSupplier () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMilkSupplier (java.lang.Long milkSupplierCode) {
		this.setMilkSupplierCode(milkSupplierCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long milkSupplierCode;

	// fields
	private java.lang.String milkSupplierName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="milk_supplier_code"
     */
	public java.lang.Long getMilkSupplierCode () {
		return milkSupplierCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param milkSupplierCode the new ID
	 */
	public void setMilkSupplierCode (java.lang.Long milkSupplierCode) {
		this.milkSupplierCode = milkSupplierCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: milk_supplier_name
	 */
	public java.lang.String getMilkSupplierName () {
		return milkSupplierName;
	}

	/**
	 * Set the value related to the column: milk_supplier_name
	 * @param milkSupplierName the milk_supplier_name value
	 */
	public void setMilkSupplierName (java.lang.String milkSupplierName) {
		this.milkSupplierName = milkSupplierName;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.MilkSupplier)) return false;
		else {
			com.myhome.model.MilkSupplier milkSupplier = (com.myhome.model.MilkSupplier) obj;
			if (null == this.getMilkSupplierCode() || null == milkSupplier.getMilkSupplierCode()) return false;
			else return (this.getMilkSupplierCode().equals(milkSupplier.getMilkSupplierCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getMilkSupplierCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getMilkSupplierCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}