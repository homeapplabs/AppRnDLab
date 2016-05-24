package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the cookinggas table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="cookinggas"
 */

public abstract class BaseCookingGas  implements Serializable {

	public static String REF = "CookingGas";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_CONNECTIONENUMBER = "connectionenumber";
	public static String PROP_CURRENTREADING = "currentreading";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_OTHER = "other";
	public static String PROP_COUNTRY = "country";
	public static String PROP_PREVIOUSREADING = "previousreading";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_COOKING_GAS_SUPPLIER = "cookingGasSupplier";
	public static String PROP_COOKINGGAS_I_D = "cookinggasID";
	public static String PROP_RATEPERUNIT = "rateperunit";
	public static String PROP_MONTHLYRENTAL = "monthlyrental";
	public static String PROP_UNITCONSUMED = "unitconsumed";
	public static String PROP_COOKAMOUNT = "cookamount";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseCookingGas () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCookingGas (java.lang.Long cookinggasID) {
		this.setCookinggasID(cookinggasID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCookingGas (
		java.lang.Long cookinggasID,
		com.myhome.model.Customer customer) {

		this.setCookinggasID(cookinggasID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long cookinggasID;

	// fields
	private int connectionenumber;
	private int rateperunit;
	private int unitconsumed;
	private int monthlyrental;
	private int previousreading;
	private int currentreading;
	private int cookamount;
	private java.util.Date duedate;
	private java.lang.String other;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.CookingGasSupplier cookingGasSupplier;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="cookinggas_id"
     */
	public java.lang.Long getCookinggasID () {
		return cookinggasID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param cookinggasID the new ID
	 */
	public void setCookinggasID (java.lang.Long cookinggasID) {
		this.cookinggasID = cookinggasID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: connection_number
	 */
	public int getConnectionenumber () {
		return connectionenumber;
	}

	/**
	 * Set the value related to the column: connection_number
	 * @param connectionenumber the connection_number value
	 */
	public void setConnectionenumber (int connectionenumber) {
		this.connectionenumber = connectionenumber;
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
	 * Return the value associated with the column: monthlyrental
	 */
	public int getMonthlyrental () {
		return monthlyrental;
	}

	/**
	 * Set the value related to the column: monthlyrental
	 * @param monthlyrental the monthlyrental value
	 */
	public void setMonthlyrental (int monthlyrental) {
		this.monthlyrental = monthlyrental;
	}



	/**
	 * Return the value associated with the column: previousreading
	 */
	public int getPreviousreading () {
		return previousreading;
	}

	/**
	 * Set the value related to the column: previousreading
	 * @param previousreading the previousreading value
	 */
	public void setPreviousreading (int previousreading) {
		this.previousreading = previousreading;
	}



	/**
	 * Return the value associated with the column: currentreading
	 */
	public int getCurrentreading () {
		return currentreading;
	}

	/**
	 * Set the value related to the column: currentreading
	 * @param currentreading the currentreading value
	 */
	public void setCurrentreading (int currentreading) {
		this.currentreading = currentreading;
	}



	/**
	 * Return the value associated with the column: cook_amount
	 */
	public int getCookamount () {
		return cookamount;
	}

	/**
	 * Set the value related to the column: cook_amount
	 * @param cookamount the cook_amount value
	 */
	public void setCookamount (int cookamount) {
		this.cookamount = cookamount;
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
	 * Return the value associated with the column: cookingGasSupplier
	 */
	public com.myhome.model.CookingGasSupplier getCookingGasSupplier () {
		return cookingGasSupplier;
	}

	/**
	 * Set the value related to the column: cookingGasSupplier
	 * @param cookingGasSupplier the cookingGasSupplier value
	 */
	public void setCookingGasSupplier (com.myhome.model.CookingGasSupplier cookingGasSupplier) {
		this.cookingGasSupplier = cookingGasSupplier;
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
		if (!(obj instanceof com.myhome.model.CookingGas)) return false;
		else {
			com.myhome.model.CookingGas cookingGas = (com.myhome.model.CookingGas) obj;
			if (null == this.getCookinggasID() || null == cookingGas.getCookinggasID()) return false;
			else return (this.getCookinggasID().equals(cookingGas.getCookinggasID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getCookinggasID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getCookinggasID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}