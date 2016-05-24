package com.myhome.model.dao.iface;

import java.io.Serializable;

public interface ElectricitySupplierDAO {
	public com.myhome.model.ElectricitySupplier get(java.lang.Long key);

	public com.myhome.model.ElectricitySupplier load(java.lang.Long key);

	public java.util.List<com.myhome.model.ElectricitySupplier> findAll ();


	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param electricitySupplier a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.ElectricitySupplier electricitySupplier);

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param electricitySupplier a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.myhome.model.ElectricitySupplier electricitySupplier);

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param electricitySupplier a transient instance containing updated state
	 */
	public void update(com.myhome.model.ElectricitySupplier electricitySupplier);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Long id);

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param electricitySupplier the instance to be removed
	 */
	public void delete(com.myhome.model.ElectricitySupplier electricitySupplier);


}