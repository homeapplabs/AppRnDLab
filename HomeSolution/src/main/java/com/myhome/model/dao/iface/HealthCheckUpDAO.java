package com.myhome.model.dao.iface;

import java.io.Serializable;

public interface HealthCheckUpDAO {
	public com.myhome.model.HealthCheckUp get(java.lang.Long key);

	public com.myhome.model.HealthCheckUp load(java.lang.Long key);

	public java.util.List<com.myhome.model.HealthCheckUp> findAll ();


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param healthCheckUp a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.HealthCheckUp healthCheckUp);

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param healthCheckUp a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.myhome.model.HealthCheckUp healthCheckUp);

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param healthCheckUp a transient instance containing updated state
	 */
	public void update(com.myhome.model.HealthCheckUp healthCheckUp);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Long id);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param healthCheckUp the instance to be removed
	 */
	public void delete(com.myhome.model.HealthCheckUp healthCheckUp);


}