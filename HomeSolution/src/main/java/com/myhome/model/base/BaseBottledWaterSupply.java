package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the bottledwatersupply table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="bottledwatersupply"
 */

public abstract class BaseBottledWaterSupply  implements Serializable {

	public static String REF = "BottledWaterSupply";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_BOTTLEDWATERSUPPLY_I_D = "bottledwatersupplyID";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_OTHER = "other";
	public static String PROP_FIXEDRENTAL = "fixedrental";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATUS = "status";
	public static String PROP_BOTTLED_WATER_SUPPLIER = "bottledWaterSupplier";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_RATEPERUNIT = "rateperunit";
	public static String PROP_UNITCONSUMED = "unitconsumed";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseBottledWaterSupply () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseBottledWaterSupply (java.lang.Long bottledwatersupplyID) {
		this.setBottledwatersupplyID(bottledwatersupplyID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseBottledWaterSupply (
		java.lang.Long bottledwatersupplyID,
		com.myhome.model.Customer customer) {

		this.setBottledwatersupplyID(bottledwatersupplyID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long bottledwatersupplyID;

	// fields
	private int rateperunit;
	private int unitconsumed;
	private int fixedrental;
	private int amount;
	private java.util.Date duedate;
	private java.lang.String other;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.BottledWaterSupply bottledWaterSupplier;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="bottledwatersupply_id"
     */
	public java.lang.Long getBottledwatersupplyID () {
		return bottledwatersupplyID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param bottledwatersupplyID the new ID
	 */
	public void setBottledwatersupplyID (java.lang.Long bottledwatersupplyID) {
		this.bottledwatersupplyID = bottledwatersupplyID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: rateperunit
	 */
	public int getRateperunit () {
		return rateperunit;
	}

	/**
	 * Set the value related to the column: rateperunit
	 * @param rateperunit the rateperunit value
	 */
	public void setRateperunit (int rateperunit) {
		this.rateperunit = rateperunit;
	}



	/**
	 * Return the value associated with the column: unit_consumed
	 */
	public int getUnitconsumed () {
		return unitconsumed;
	}

	/**
	 * Set the value related to the column: unit_consumed
	 * @param unitconsumed the unit_consumed value
	 */
	public void setUnitconsumed (int unitconsumed) {
		this.unitconsumed = unitconsumed;
	}



	/**
	 * Return the value associated with the column: fixedrental
	 */
	public int getFixedrental () {
		return fixedrental;
	}

	/**
	 * Set the value related to the column: fixedrental
	 * @param fixedrental the fixedrental value
	 */
	public void setFixedrental (int fixedrental) {
		this.fixedrental = fixedrental;
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
	 * Return the value associated with the column: due_date
	 */
	public java.util.Date getDuedate () {
		return duedate;
	}

	/**
	 * Set the value related to the column: due_date
	 * @param duedate the due_date value
	 */
	public void setDuedate (java.util.Date duedate) {
		this.duedate = duedate;
	}



	/**
	 * Return the value associated with the column: other_internet
	 */
	public java.lang.String getOther () {
		return other;
	}

	/**
	 * Set the value related to the column: other_internet
	 * @param other the other_internet value
	 */
	public void setOther (java.lang.String other) {
		this.other = other;
	}



	/**
	 * Return the value associated with the column: makemeremind
	 */
	public java.lang.String getMakemeremind () {
		return makemeremind;
	}

	/**
	 * Set the value related to the column: makemeremind
	 * @param makemeremind the makemeremind value
	 */
	public void setMakemeremind (java.lang.String makemeremind) {
		this.makemeremind = makemeremind;
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
	 * Return the value associated with the column: bottledWaterSupplier
	 */
	public com.myhome.model.BottledWaterSupply getBottledWaterSupplier () {
		return bottledWaterSupplier;
	}

	/**
	 * Set the value related to the column: bottledWaterSupplier
	 * @param bottledWaterSupplier the bottledWaterSupplier value
	 */
	public void setBottledWaterSupplier (com.myhome.model.BottledWaterSupply bottledWaterSupplier) {
		this.bottledWaterSupplier = bottledWaterSupplier;
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
		if (!(obj instanceof com.myhome.model.BottledWaterSupply)) return false;
		else {
			com.myhome.model.BottledWaterSupply bottledWaterSupply = (com.myhome.model.BottledWaterSupply) obj;
			if (null == this.getBottledwatersupplyID() || null == bottledWaterSupply.getBottledwatersupplyID()) return false;
			else return (this.getBottledwatersupplyID().equals(bottledWaterSupply.getBottledwatersupplyID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getBottledwatersupplyID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getBottledwatersupplyID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}