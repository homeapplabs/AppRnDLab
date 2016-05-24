package com.myhome.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.myhome.model.dao.iface.SavingPolicyDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseSavingPolicyDAO extends com.myhome.model.dao._RootDAO {

	public BaseSavingPolicyDAO () {}
	
	public BaseSavingPolicyDAO (Session session) {
		super(session);
	}

	// query name references


	public static SavingPolicyDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static SavingPolicyDAO getInstance () {
		if (null == instance) instance = new com.myhome.model.dao.SavingPolicyDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.myhome.model.SavingPolicy.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.myhome.model.SavingPolicy
	 */
	public com.myhome.model.SavingPolicy cast (Object object) {
		return (com.myhome.model.SavingPolicy) object;
	}

	public com.myhome.model.SavingPolicy get(java.lang.Long key)
	{
		return (com.myhome.model.SavingPolicy) get(getReferenceClass(), key);
	}

	public com.myhome.model.SavingPolicy get(java.lang.Long key, Session s)
	{
		return (com.myhome.model.SavingPolicy) get(getReferenceClass(), key, s);
	}

	public com.myhome.model.SavingPolicy load(java.lang.Long key)
	{
		return (com.myhome.model.SavingPolicy) load(getReferenceClass(), key);
	}

	public com.myhome.model.SavingPolicy load(java.lang.Long key, Session s)
	{
		return (com.myhome.model.SavingPolicy) load(getReferenceClass(), key, s);
	}

	public com.myhome.model.SavingPolicy loadInitialize(java.lang.Long key, Session s) 
	{ 
		com.myhome.model.SavingPolicy obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.SavingPolicy> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.SavingPolicy> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.myhome.model.SavingPolicy> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param savingPolicy a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.SavingPolicy savingPolicy)
	{
		return (java.lang.Long) super.save(savingPolicy);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param savingPolicy a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.SavingPolicy savingPolicy, Session s)
	{
		return (java.lang.Long) save((Object) savingPolicy, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param savingPolicy a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.myhome.model.SavingPolicy savingPolicy)
	{
		saveOrUpdate((Object) savingPolicy);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param savingPolicy a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.myhome.model.SavingPolicy savingPolicy, Session s)
	{
		saveOrUpdate((Object) savingPolicy, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param savingPolicy a transient instance containing updated state
	 */
	public void update(com.myhome.model.SavingPolicy savingPolicy) 
	{
		update((Object) savingPolicy);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param savingPolicy a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.myhome.model.SavingPolicy savingPolicy, Session s)
	{
		update((Object) savingPolicy, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Long id)
	{
		delete((Object) load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param id the instance ID to be removed
	 * @param s the Session
	 */
	public void delete(java.lang.Long id, Session s)
	{
		delete((Object) load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param savingPolicy the instance to be removed
	 */
	public void delete(com.myhome.model.SavingPolicy savingPolicy)
	{
		delete((Object) savingPolicy);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param savingPolicy the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.myhome.model.SavingPolicy savingPolicy, Session s)
	{
		delete((Object) savingPolicy, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (com.myhome.model.SavingPolicy savingPolicy, Session s)
	{
		refresh((Object) savingPolicy, s);
	}


}