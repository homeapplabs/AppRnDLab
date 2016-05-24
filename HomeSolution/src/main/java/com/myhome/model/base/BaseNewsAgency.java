package com.myhome.model.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the news_agency table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="news_agency"
 */

public abstract class BaseNewsAgency  implements Serializable {

	public static String REF = "NewsAgency";
	public static String PROP_NEWS_AGENCY_CODE = "newsAgencyCode";
	public static String PROP_STATUS = "status";
	public static String PROP_COUNTRY = "country";
	public static String PROP_NEWS_AGENCY_NAME = "newsAgencyName";


	// constructors
	public BaseNewsAgency () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseNewsAgency (java.lang.Long newsAgencyCode) {
		this.setNewsAgencyCode(newsAgencyCode);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Long newsAgencyCode;

	// fields
	private java.lang.String newsAgencyName;
	private boolean status;

	// one to one
	private com.myhome.model.Country country;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  column="news_agency_code"
     */
	public java.lang.Long getNewsAgencyCode () {
		return newsAgencyCode;
	}

	/**
	 * Set the unique identifier of this class
	 * @param newsAgencyCode the new ID
	 */
	public void setNewsAgencyCode (java.lang.Long newsAgencyCode) {
		this.newsAgencyCode = newsAgencyCode;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: news_agency_name
	 */
	public java.lang.String getNewsAgencyName () {
		return newsAgencyName;
	}

	/**
	 * Set the value related to the column: news_agency_name
	 * @param newsAgencyName the news_agency_name value
	 */
	public void setNewsAgencyName (java.lang.String newsAgencyName) {
		this.newsAgencyName = newsAgencyName;
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




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.myhome.model.NewsAgency)) return false;
		else {
			com.myhome.model.NewsAgency newsAgency = (com.myhome.model.NewsAgency) obj;
			if (null == this.getNewsAgencyCode() || null == newsAgency.getNewsAgencyCode()) return false;
			else return (this.getNewsAgencyCode().equals(newsAgency.getNewsAgencyCode()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getNewsAgencyCode()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getNewsAgencyCode().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}