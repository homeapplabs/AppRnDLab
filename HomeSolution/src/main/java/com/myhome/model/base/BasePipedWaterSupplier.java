package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the piped_Water_Supplier table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="piped_Water_Supplier"
 */

public abstract class BasePipedWaterSupplier  implements Serializable {

	public static String REF = "PipedWaterSupplier";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_PIPED_WATER_SUPPLIER_NAME = "pipedWaterSupplierName";
	public static String PROP_PIPED_WATER_SUPPLIER_CODE = "pipedWaterSupplierCode";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BasePipedWaterSupplier () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePipedWaterSupplier (java.lang.Long pipedWaterSupplierCode) {
		this.setPipedWaterSupplierCode(pipedWaterSupplierCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long pipedWaterSupplierCode;

	// fields
	private java.lang.String pipedWaterSupplierName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="piped_water_supplier_code"
     */
	public java.lang.Long getPipedWaterSupplierCode () {
		return pipedWaterSupplierCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param pipedWaterSupplierCode the new ID
	 */
	public void setPipedWaterSupplierCode (java.lang.Long pipedWaterSupplierCode) {
		this.pipedWaterSupplierCode = pipedWaterSupplierCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: piped_water_supplier_name
	 */
	public java.lang.String getPipedWaterSupplierName () {
		return pipedWaterSupplierName;
	}

	/**
	 * Set the value related to the column: piped_water_supplier_name
	 * @param pipedWaterSupplierName the piped_water_supplier_name value
	 */
	public void setPipedWaterSupplierName (java.lang.String pipedWaterSupplierName) {
		this.pipedWaterSupplierName = pipedWaterSupplierName;
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
		if (!(obj instanceof com.myhome.model.PipedWaterSupplier)) return false;
		else {
			com.myhome.model.PipedWaterSupplier pipedWaterSupplier = (com.myhome.model.PipedWaterSupplier) obj;
			if (null == this.getPipedWaterSupplierCode() || null == pipedWaterSupplier.getPipedWaterSupplierCode()) return false;
			else return (this.getPipedWaterSupplierCode().equals(pipedWaterSupplier.getPipedWaterSupplierCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getPipedWaterSupplierCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getPipedWaterSupplierCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}