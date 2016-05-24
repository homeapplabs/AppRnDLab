package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the bottled_Water_Supplier table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="bottled_Water_Supplier"
 */

public abstract class BaseBottledWaterSupplier  implements Serializable {

	public static String REF = "BottledWaterSupplier";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_BOTTLED_WATER_SUPPLIER_NAME = "bottledWaterSupplierName";
	public static String PROP_COUNTRY = "country";
	public static String PROP_BOTTLED_WATER_SUPPLIER_CODE = "bottledWaterSupplierCode";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseBottledWaterSupplier () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBottledWaterSupplier (java.lang.Long bottledWaterSupplierCode) {
		this.setBottledWaterSupplierCode(bottledWaterSupplierCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long bottledWaterSupplierCode;

	// fields
	private java.lang.String bottledWaterSupplierName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="bottled_water_supplier_code"
     */
	public java.lang.Long getBottledWaterSupplierCode () {
		return bottledWaterSupplierCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param bottledWaterSupplierCode the new ID
	 */
	public void setBottledWaterSupplierCode (java.lang.Long bottledWaterSupplierCode) {
		this.bottledWaterSupplierCode = bottledWaterSupplierCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: bottled_water_supplier_name
	 */
	public java.lang.String getBottledWaterSupplierName () {
		return bottledWaterSupplierName;
	}

	/**
	 * Set the value related to the column: bottled_water_supplier_name
	 * @param bottledWaterSupplierName the bottled_water_supplier_name value
	 */
	public void setBottledWaterSupplierName (java.lang.String bottledWaterSupplierName) {
		this.bottledWaterSupplierName = bottledWaterSupplierName;
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
		if (!(obj instanceof com.myhome.model.BottledWaterSupplier)) return false;
		else {
			com.myhome.model.BottledWaterSupplier bottledWaterSupplier = (com.myhome.model.BottledWaterSupplier) obj;
			if (null == this.getBottledWaterSupplierCode() || null == bottledWaterSupplier.getBottledWaterSupplierCode()) return false;
			else return (this.getBottledWaterSupplierCode().equals(bottledWaterSupplier.getBottledWaterSupplierCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getBottledWaterSupplierCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getBottledWaterSupplierCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}