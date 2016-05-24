package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the milksupply table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="milksupply"
 */

public abstract class BaseMilkSupply  implements Serializable {

	public static String REF = "MilkSupply";
	public static String PROP_MILKSUPPLY_I_D = "milksupplyID";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_MILK_SUPPLIER = "milkSupplier";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_RATEPERUNIT = "rateperunit";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_COUNTRY = "country";
	public static String PROP_UNITCONSUMED = "unitconsumed";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseMilkSupply () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseMilkSupply (java.lang.Long milksupplyID) {
		this.setMilksupplyID(milksupplyID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseMilkSupply (
		java.lang.Long milksupplyID,
		com.myhome.model.Customer customer) {

		this.setMilksupplyID(milksupplyID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long milksupplyID;

	// fields
	private int rateperunit;
	private int unitconsumed;
	private int amount;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.MilkSupplier milkSupplier;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="milksupply_id"
     */
	public java.lang.Long getMilksupplyID () {
		return milksupplyID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param milksupplyID the new ID
	 */
	public void setMilksupplyID (java.lang.Long milksupplyID) {
		this.milksupplyID = milksupplyID;
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
	 * Return the value associated with the column: milkSupplier
	 */
	public com.myhome.model.MilkSupplier getMilkSupplier () {
		return milkSupplier;
	}

	/**
	 * Set the value related to the column: milkSupplier
	 * @param milkSupplier the milkSupplier value
	 */
	public void setMilkSupplier (com.myhome.model.MilkSupplier milkSupplier) {
		this.milkSupplier = milkSupplier;
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
		if (!(obj instanceof com.myhome.model.MilkSupply)) return false;
		else {
			com.myhome.model.MilkSupply milkSupply = (com.myhome.model.MilkSupply) obj;
			if (null == this.getMilksupplyID() || null == milkSupply.getMilksupplyID()) return false;
			else return (this.getMilksupplyID().equals(milkSupply.getMilksupplyID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getMilksupplyID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getMilksupplyID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}