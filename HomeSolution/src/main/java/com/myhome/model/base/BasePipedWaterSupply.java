package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the pipedwatersupply table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="pipedwatersupply"
 */

public abstract class BasePipedWaterSupply  implements Serializable {

	public static String REF = "PipedWaterSupply";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_AMOUNT = "amount";
	public static String PROP_CONNECTIONENUMBER = "connectionenumber";
	public static String PROP_CURRENTREADING = "currentreading";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_PIPEDWATERSUPPLY_I_D = "pipedwatersupplyID";
	public static String PROP_OTHER = "other";
	public static String PROP_FIXEDRENTAL = "fixedrental";
	public static String PROP_COUNTRY = "country";
	public static String PROP_PIPEDWATER_SUPPLIER = "pipedwaterSupplier";
	public static String PROP_PREVIOUSREADING = "previousreading";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_RATEPERUNIT = "rateperunit";
	public static String PROP_UNITCONSUMED = "unitconsumed";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BasePipedWaterSupply () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePipedWaterSupply (java.lang.Long pipedwatersupplyID) {
		this.setPipedwatersupplyID(pipedwatersupplyID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePipedWaterSupply (
		java.lang.Long pipedwatersupplyID,
		com.myhome.model.Customer customer) {

		this.setPipedwatersupplyID(pipedwatersupplyID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long pipedwatersupplyID;

	// fields
	private int connectionenumber;
	private int rateperunit;
	private int unitconsumed;
	private int fixedrental;
	private int previousreading;
	private int currentreading;
	private int amount;
	private java.util.Date duedate;
	private java.lang.String other;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.PipedWaterSupplier pipedwaterSupplier;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="pipedwatersupply_id"
     */
	public java.lang.Long getPipedwatersupplyID () {
		return pipedwatersupplyID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param pipedwatersupplyID the new ID
	 */
	public void setPipedwatersupplyID (java.lang.Long pipedwatersupplyID) {
		this.pipedwatersupplyID = pipedwatersupplyID;
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
	 * Return the value associated with the column: pipedwaterSupplier
	 */
	public com.myhome.model.PipedWaterSupplier getPipedwaterSupplier () {
		return pipedwaterSupplier;
	}

	/**
	 * Set the value related to the column: pipedwaterSupplier
	 * @param pipedwaterSupplier the pipedwaterSupplier value
	 */
	public void setPipedwaterSupplier (com.myhome.model.PipedWaterSupplier pipedwaterSupplier) {
		this.pipedwaterSupplier = pipedwaterSupplier;
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
		if (!(obj instanceof com.myhome.model.PipedWaterSupply)) return false;
		else {
			com.myhome.model.PipedWaterSupply pipedWaterSupply = (com.myhome.model.PipedWaterSupply) obj;
			if (null == this.getPipedwatersupplyID() || null == pipedWaterSupply.getPipedwatersupplyID()) return false;
			else return (this.getPipedwatersupplyID().equals(pipedWaterSupply.getPipedwatersupplyID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getPipedwatersupplyID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getPipedwatersupplyID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}