package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the service table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="service"
 */

public abstract class BaseService  implements Serializable {

	public static String REF = "Service";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_SERVICE_I_D = "serviceID";
	public static String PROP_SERVICE_PROVIDER = "serviceProvider";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_OTHER = "other";
	public static String PROP_COUNTRY = "country";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseService () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseService (java.lang.Long serviceID) {
		this.setServiceID(serviceID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseService (
		java.lang.Long serviceID,
		com.myhome.model.Customer customer) {

		this.setServiceID(serviceID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long serviceID;

	// fields
	private java.lang.String other;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.ServiceProvider serviceProvider;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="service_id"
     */
	public java.lang.Long getServiceID () {
		return serviceID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param serviceID the new ID
	 */
	public void setServiceID (java.lang.Long serviceID) {
		this.serviceID = serviceID;
		this.hashCode = Integer.MIN_VALUE;
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
	 * Return the value associated with the column: serviceProvider
	 */
	public com.myhome.model.ServiceProvider getServiceProvider () {
		return serviceProvider;
	}

	/**
	 * Set the value related to the column: serviceProvider
	 * @param serviceProvider the serviceProvider value
	 */
	public void setServiceProvider (com.myhome.model.ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
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
		if (!(obj instanceof com.myhome.model.Service)) return false;
		else {
			com.myhome.model.Service service = (com.myhome.model.Service) obj;
			if (null == this.getServiceID() || null == service.getServiceID()) return false;
			else return (this.getServiceID().equals(service.getServiceID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getServiceID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getServiceID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}