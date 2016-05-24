package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the address table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="address"
 */

public abstract class BaseAddress  implements Serializable {

	public static String REF = "Address";
	public static String PROP_POSTCODE = "postcode";
	public static String PROP_ADDRESS_ID = "addressId";
	public static String PROP_STATUS = "status";
	public static String PROP_DISTRICT_TOWN = "districtTown";
	public static String PROP_COUNTRY = "country";
	public static String PROP_ADDRESS_LINE1 = "addressLine1";
	public static String PROP_STATE_COUNTY = "stateCounty";
	public static String PROP_ADDRESS_LINE2 = "addressLine2";


	// constructors
	public BaseAddress () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseAddress (java.lang.Long addressId) {
		this.setAddressId(addressId);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long addressId;

	// fields
	private java.lang.String addressLine1;
	private java.lang.String addressLine2;
	private java.lang.String postcode;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;
	private com.myhome.model.District districtTown;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="address_id"
     */
	public java.lang.Long getAddressId () {
		return addressId;
	}

	/**
	 * Set the unique identifier of this class
	 * @param addressId the new ID
	 */
	public void setAddressId (java.lang.Long addressId) {
		this.addressId = addressId;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: address_line1
	 */
	public java.lang.String getAddressLine1 () {
		return addressLine1;
	}

	/**
	 * Set the value related to the column: address_line1
	 * @param addressLine1 the address_line1 value
	 */
	public void setAddressLine1 (java.lang.String addressLine1) {
		this.addressLine1 = addressLine1;
	}



	/**
	 * Return the value associated with the column: address_line2
	 */
	public java.lang.String getAddressLine2 () {
		return addressLine2;
	}

	/**
	 * Set the value related to the column: address_line2
	 * @param addressLine2 the address_line2 value
	 */
	public void setAddressLine2 (java.lang.String addressLine2) {
		this.addressLine2 = addressLine2;
	}



	/**
	 * Return the value associated with the column: postcode
	 */
	public java.lang.String getPostcode () {
		return postcode;
	}

	/**
	 * Set the value related to the column: postcode
	 * @param postcode the postcode value
	 */
	public void setPostcode (java.lang.String postcode) {
		this.postcode = postcode;
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
		if (!(obj instanceof com.myhome.model.Address)) return false;
		else {
			com.myhome.model.Address address = (com.myhome.model.Address) obj;
			if (null == this.getAddressId() || null == address.getAddressId()) return false;
			else return (this.getAddressId().equals(address.getAddressId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getAddressId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getAddressId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}