package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the loanpremium table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="loanpremium"
 */

public abstract class BaseLoanPremium  implements Serializable {

	public static String REF = "LoanPremium";
	public static String PROP_CUSTOMER = "customer";
	public static String PROP_DUEDATE = "duedate";
	public static String PROP_BANK = "bank";
	public static String PROP_OTHER = "other";
	public static String PROP_COUNTRY = "country";
	public static String PROP_LOANPREMIUM = "loanpremium";
	public static String PROP_LOANTYPE = "loantype";
	public static String PROP_LOANNUMBER = "loannumber";
	public static String PROP_STATUS = "status";
	public static String PROP_MAKEMEREMIND = "makemeremind";
	public static String PROP_LOANPREMIUM_I_D = "loanpremiumID";
	public static String PROP_LOANNAME = "loanname";
	public static String PROP_STATE_COUNTY = "stateCounty";


	// constructors
	public BaseLoanPremium () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseLoanPremium (java.lang.Long loanpremiumID) {
		this.setLoanpremiumID(loanpremiumID);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseLoanPremium (
		java.lang.Long loanpremiumID,
		com.myhome.model.Customer customer) {

		this.setLoanpremiumID(loanpremiumID);
		this.setCustomer(customer);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long loanpremiumID;

	// fields
	private java.lang.String loantype;
	private java.lang.String loanname;
	private int loanpremium;
	private int loannumber;
	private java.lang.String other;
	private java.util.Date duedate;
	private java.lang.String makemeremind;
	private boolean status;

	// one to one
	private com.myhome.model.Bank bank;
	private com.myhome.model.Country country;
	private com.myhome.model.StateCounty stateCounty;

	// many to one
	private com.myhome.model.Customer customer;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="loanpremium_id"
     */
	public java.lang.Long getLoanpremiumID () {
		return loanpremiumID;
	}

	/**
	 * Set the unique identifier of this class
	 * @param loanpremiumID the new ID
	 */
	public void setLoanpremiumID (java.lang.Long loanpremiumID) {
		this.loanpremiumID = loanpremiumID;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: loan_type
	 */
	public java.lang.String getLoantype () {
		return loantype;
	}

	/**
	 * Set the value related to the column: loan_type
	 * @param loantype the loan_type value
	 */
	public void setLoantype (java.lang.String loantype) {
		this.loantype = loantype;
	}



	/**
	 * Return the value associated with the column: loan_name
	 */
	public java.lang.String getLoanname () {
		return loanname;
	}

	/**
	 * Set the value related to the column: loan_name
	 * @param loanname the loan_name value
	 */
	public void setLoanname (java.lang.String loanname) {
		this.loanname = loanname;
	}



	/**
	 * Return the value associated with the column: loan_premium
	 */
	public int getLoanpremium () {
		return loanpremium;
	}

	/**
	 * Set the value related to the column: loan_premium
	 * @param loanpremium the loan_premium value
	 */
	public void setLoanpremium (int loanpremium) {
		this.loanpremium = loanpremium;
	}



	/**
	 * Return the value associated with the column: loan_number
	 */
	public int getLoannumber () {
		return loannumber;
	}

	/**
	 * Set the value related to the column: loan_number
	 * @param loannumber the loan_number value
	 */
	public void setLoannumber (int loannumber) {
		this.loannumber = loannumber;
	}



	/**
	 * Return the value associated with the column: other_loan
	 */
	public java.lang.String getOther () {
		return other;
	}

	/**
	 * Set the value related to the column: other_loan
	 * @param other the other_loan value
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
		if (!(obj instanceof com.myhome.model.LoanPremium)) return false;
		else {
			com.myhome.model.LoanPremium loanPremium = (com.myhome.model.LoanPremium) obj;
			if (null == this.getLoanpremiumID() || null == loanPremium.getLoanpremiumID()) return false;
			else return (this.getLoanpremiumID().equals(loanPremium.getLoanpremiumID()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getLoanpremiumID()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getLoanpremiumID().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}