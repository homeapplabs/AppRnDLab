package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the tvrecharge table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="tvrecharge"
 */

public abstract class BaseTvRecharge  implements Serializable {

	public static String REF = "TvRecharge";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_TV_SERVICE_PROVIDER = "tvServiceProvider";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_OTHER = "other";
	public static String PROP_TOTALAMOUNT = "totalamount";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";
	public static String PROP_ACCOUNTNUMBER = "accountnumber";
	public static String PROP_TVRECHARGE_I_D = "tvrechargeID";


	// constructors
	public BaseTvRecharge () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseTvRecharge (java.lang.Long tvrechargeID) {
		this.setTvrechargeID(tvrechargeID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseTvRecharge (
		java.lang.Long tvrechargeID,
		com.myhome.model.Customer customer) {

		this.setTvrechargeID(tvrechargeID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long tvrechargeID;

	// fields
	private int accountnumber;
	private int totalamount;
	private java.lang.String other;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.TVServiceProvider tvServiceProvider;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="tvrecharge_id"
     */
	public java.lang.Long getTvrechargeID () {
		return tvrechargeID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param tvrechargeID the new ID
	 */
	public void setTvrechargeID (java.lang.Long tvrechargeID) {
		this.tvrechargeID = tvrechargeID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: account_number
	 */
	public int getAccountnumber () {
		return accountnumber;
	}

	/**
	 * Set the value related to the column: account_number
	 * @param accountnumber the account_number value
	 */
	public void setAccountnumber (int accountnumber) {
		this.accountnumber = accountnumber;
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
	 * Return the value associated with the column: other
	 */
	public java.lang.String getOther () {
		return other;
	}

	/**
	 * Set the value related to the column: other
	 * @param other the other value
	 */
	public void setOther (java.lang.String other) {
		this.other = other;
	}



	/**
	 * Return the value associated with the column: duedate
	 */
	public java.util.Date getDuedate () {
		return duedate;
	}

	/**
	 * Set the value related to the column: duedate
	 * @param duedate the duedate value
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
	 * Return the value associated with the column: tvServiceProvider
	 */
	public com.myhome.model.TVServiceProvider getTvServiceProvider () {
		return tvServiceProvider;
	}

	/**
	 * Set the value related to the column: tvServiceProvider
	 * @param tvServiceProvider the tvServiceProvider value
	 */
	public void setTvServiceProvider (com.myhome.model.TVServiceProvider tvServiceProvider) {
		this.tvServiceProvider = tvServiceProvider;
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
		if (!(obj instanceof com.myhome.model.TvRecharge)) return false;
		else {
			com.myhome.model.TvRecharge tvRecharge = (com.myhome.model.TvRecharge) obj;
			if (null == this.getTvrechargeID() || null == tvRecharge.getTvrechargeID()) return false;
			else return (this.getTvrechargeID().equals(tvRecharge.getTvrechargeID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getTvrechargeID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getTvrechargeID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}