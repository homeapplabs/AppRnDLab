package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the tutionfees table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="tutionfees"
 */

public abstract class BaseTutionFees  implements Serializable {

	public static String REF = "TutionFees";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_TOTALAMOUNT = "totalamount";
	public static String PROP_TUTIONFEES_I_D = "tutionfeesID";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseTutionFees () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTutionFees (java.lang.Long tutionfeesID) {
		this.setTutionfeesID(tutionfeesID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTutionFees (
		java.lang.Long tutionfeesID,
		com.myhome.model.Customer customer) {

		this.setTutionfeesID(tutionfeesID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long tutionfeesID;

	// fields
	private int totalamount;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="tutionfees_id"
     */
	public java.lang.Long getTutionfeesID () {
		return tutionfeesID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param tutionfeesID the new ID
	 */
	public void setTutionfeesID (java.lang.Long tutionfeesID) {
		this.tutionfeesID = tutionfeesID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: total_amount
	 */
	public int getTotalamount () {
		return totalamount;
	}

	/**
	 * Set the value related to the column: total_amount
	 * @param totalamount the total_amount value
	 */
	public void setTotalamount (int totalamount) {
		this.totalamount = totalamount;
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
		if (!(obj instanceof com.myhome.model.TutionFees)) return false;
		else {
			com.myhome.model.TutionFees tutionFees = (com.myhome.model.TutionFees) obj;
			if (null == this.getTutionfeesID() || null == tutionFees.getTutionfeesID()) return false;
			else return (this.getTutionfeesID().equals(tutionFees.getTutionfeesID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getTutionfeesID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getTutionfeesID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}