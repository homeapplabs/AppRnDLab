package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the saving_policy_provider table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="saving_policy_provider"
 */

public abstract class BaseSavingPolicyProvider  implements Serializable {

	public static String REF = "SavingPolicyProvider";
	public static String PROP_STATUS = "status";
	public static String PROP_BANK = "bank";
	public static String PROP_COUNTRY = "country";
	public static String PROP_SAVING_POLICY_CODE = "savingPolicyCode";
	public static String PROP_STATE_COUNTY = "stateCounty";
	public static String PROP_SAVING_POLICY_PROVIDER_NAME = "savingPolicyProviderName";


	// constructors
	public BaseSavingPolicyProvider () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseSavingPolicyProvider (java.lang.Long savingPolicyCode) {
		this.setSavingPolicyCode(savingPolicyCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long savingPolicyCode;

	// fields
	private java.lang.String savingPolicyProviderName;
	private boolean status;

	// one to one
	private com.myhome.model.Bank bank;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="saving_policy_code"
     */
	public java.lang.Long getSavingPolicyCode () {
		return savingPolicyCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param savingPolicyCode the new ID
	 */
	public void setSavingPolicyCode (java.lang.Long savingPolicyCode) {
		this.savingPolicyCode = savingPolicyCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: saving_policy_provider_name
	 */
	public java.lang.String getSavingPolicyProviderName () {
		return savingPolicyProviderName;
	}

	/**
	 * Set the value related to the column: saving_policy_provider_name
	 * @param savingPolicyProviderName the saving_policy_provider_name value
	 */
	public void setSavingPolicyProviderName (java.lang.String savingPolicyProviderName) {
		this.savingPolicyProviderName = savingPolicyProviderName;
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
	 * Return the value associated with the column: bank
	 */
	public com.myhome.model.Bank getBank () {
		return bank;
	}

	/**
	 * Set the value related to the column: bank
	 * @param bank the bank value
	 */
	public void setBank (com.myhome.model.Bank bank) {
		this.bank = bank;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.SavingPolicyProvider)) return false;
		else {
			com.myhome.model.SavingPolicyProvider savingPolicyProvider = (com.myhome.model.SavingPolicyProvider) obj;
			if (null == this.getSavingPolicyCode() || null == savingPolicyProvider.getSavingPolicyCode()) return false;
			else return (this.getSavingPolicyCode().equals(savingPolicyProvider.getSavingPolicyCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getSavingPolicyCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getSavingPolicyCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}