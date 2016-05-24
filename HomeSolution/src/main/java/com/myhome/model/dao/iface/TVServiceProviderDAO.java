package com.myhome.model.dao.iface;

import java.io.Serializable;

public interface TVServiceProviderDAO {
	public com.myhome.model.TVServiceProvider get(java.lang.Long key);

	public com.myhome.model.TVServiceProvider load(java.lang.Long key);

	public java.util.List<com.myhome.model.TVServiceProvider> findAll ();


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param tVServiceProvider a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.TVServiceProvider tVServiceProvider);

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param tVServiceProvider a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.myhome.model.TVServiceProvider tVServiceProvider);

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param tVServiceProvider a transient instance containing updated state
	 */
	public void update(com.myhome.model.TVServiceProvider tVServiceProvider);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Long id);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param tVServiceProvider the instance to be removed
	 */
	public void delete(com.myhome.model.TVServiceProvider tVServiceProvider);


}