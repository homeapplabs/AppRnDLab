package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the cooking_Gas_Supplier table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="cooking_Gas_Supplier"
 */

public abstract class BaseCookingGasSupplier  implements Serializable {

	public static String REF = "CookingGasSupplier";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_COOKING_GAS_SUPPLIER_NAME = "cookingGasSupplierName";
	public static String PROP_COOKING_GAS_SUPPLIER_CODE = "cookingGasSupplierCode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseCookingGasSupplier () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCookingGasSupplier (java.lang.Long cookingGasSupplierCode) {
		this.setCookingGasSupplierCode(cookingGasSupplierCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long cookingGasSupplierCode;

	// fields
	private java.lang.String cookingGasSupplierName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="cooking_gas_supplier_code"
     */
	public java.lang.Long getCookingGasSupplierCode () {
		return cookingGasSupplierCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param cookingGasSupplierCode the new ID
	 */
	public void setCookingGasSupplierCode (java.lang.Long cookingGasSupplierCode) {
		this.cookingGasSupplierCode = cookingGasSupplierCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: cooking_gas_supplier_name
	 */
	public java.lang.String getCookingGasSupplierName () {
		return cookingGasSupplierName;
	}

	/**
	 * Set the value related to the column: cooking_gas_supplier_name
	 * @param cookingGasSupplierName the cooking_gas_supplier_name value
	 */
	public void setCookingGasSupplierName (java.lang.String cookingGasSupplierName) {
		this.cookingGasSupplierName = cookingGasSupplierName;
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
		if (!(obj instanceof com.myhome.model.CookingGasSupplier)) return false;
		else {
			com.myhome.model.CookingGasSupplier cookingGasSupplier = (com.myhome.model.CookingGasSupplier) obj;
			if (null == this.getCookingGasSupplierCode() || null == cookingGasSupplier.getCookingGasSupplierCode()) return false;
			else return (this.getCookingGasSupplierCode().equals(cookingGasSupplier.getCookingGasSupplierCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getCookingGasSupplierCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getCookingGasSupplierCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}