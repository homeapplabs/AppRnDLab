package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the elecricity table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="elecricity"
 */

public abstract class BaseElectricity  implements Serializable {

	public static String REF = "Electricity";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_CURRENTREADING = "currentreading";
	public static String PROP_ELECTRICITY_SUPPLIER = "electricitySupplier";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_EBILL_AMOUNT = "ebillAmount";
	public static String PROP_COUNTRY = "country";
	public static String PROP_PREVIOUSREADING = "previousreading";
	public static String PROP_STATUS = "status";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_ELECRICITY_ID = "elecricityId";
	public static String PROP_RATEPERUNIT = "rateperunit";
	public static String PROP_CONNECTIONNUMBER = "connectionnumber";
	public static String PROP_MONTHLYRENTAL = "monthlyrental";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseElectricity () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseElectricity (java.lang.Long elecricityId) {
		this.setElecricityId(elecricityId);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseElectricity (
		java.lang.Long elecricityId,
		com.myhome.model.Customer customer) {

		this.setElecricityId(elecricityId);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long elecricityId;

	// fields
	private int connectionnumber;
	private int rateperunit;
	private int monthlyrental;
	private int previousreading;
	private int currentreading;
	private int ebillAmount;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.ElectricitySupplier electricitySupplier;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="elecricity_id"
     */
	public java.lang.Long getElecricityId () {
		return elecricityId;
	}

	/**
	 * Set the unique identifier of this class
	 * @param elecricityId the new ID
	 */
	public void setElecricityId (java.lang.Long elecricityId) {
		this.elecricityId = elecricityId;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: connection_number
	 */
	public int getConnectionnumber () {
		return connectionnumber;
	}

	/**
	 * Set the value related to the column: connection_number
	 * @param connectionnumber the connection_number value
	 */
	public void setConnectionnumber (int connectionnumber) {
		this.connectionnumber = connectionnumber;
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
	 * Return the value associated with the column: monthly_rental
	 */
	public int getMonthlyrental () {
		return monthlyrental;
	}

	/**
	 * Set the value related to the column: monthly_rental
	 * @param monthlyrental the monthly_rental value
	 */
	public void setMonthlyrental (int monthlyrental) {
		this.monthlyrental = monthlyrental;
	}



	/**
	 * Return the value associated with the column: previous_reading
	 */
	public int getPreviousreading () {
		return previousreading;
	}

	/**
	 * Set the value related to the column: previous_reading
	 * @param previousreading the previous_reading value
	 */
	public void setPreviousreading (int previousreading) {
		this.previousreading = previousreading;
	}



	/**
	 * Return the value associated with the column: current_reading
	 */
	public int getCurrentreading () {
		return currentreading;
	}

	/**
	 * Set the value related to the column: current_reading
	 * @param currentreading the current_reading value
	 */
	public void setCurrentreading (int currentreading) {
		this.currentreading = currentreading;
	}



	/**
	 * Return the value associated with the column: ebill_amount
	 */
	public int getEbillAmount () {
		return ebillAmount;
	}

	/**
	 * Set the value related to the column: ebill_amount
	 * @param ebillAmount the ebill_amount value
	 */
	public void setEbillAmount (int ebillAmount) {
		this.ebillAmount = ebillAmount;
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
	 * Return the value associated with the column: electricitySupplier
	 */
	public com.myhome.model.ElectricitySupplier getElectricitySupplier () {
		return electricitySupplier;
	}

	/**
	 * Set the value related to the column: electricitySupplier
	 * @param electricitySupplier the electricitySupplier value
	 */
	public void setElectricitySupplier (com.myhome.model.ElectricitySupplier electricitySupplier) {
		this.electricitySupplier = electricitySupplier;
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
		if (!(obj instanceof com.myhome.model.Electricity)) return false;
		else {
			com.myhome.model.Electricity electricity = (com.myhome.model.Electricity) obj;
			if (null == this.getElecricityId() || null == electricity.getElecricityId()) return false;
			else return (this.getElecricityId().equals(electricity.getElecricityId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getElecricityId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getElecricityId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}