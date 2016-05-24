package com.myhome.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.myhome.model.dao.iface.InternetServiceProviderDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseInternetServiceProviderDAO extends com.myhome.model.dao._RootDAO {

	public BaseInternetServiceProviderDAO () {}
	
	public BaseInternetServiceProviderDAO (Session session) {
		super(session);
	}

	// query name references


	public static InternetServiceProviderDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static InternetServiceProviderDAO getInstance () {
		if (null == instance) instance = new com.myhome.model.dao.InternetServiceProviderDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.myhome.model.InternetServiceProvider.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.myhome.model.InternetServiceProvider
	 */
	public com.myhome.model.InternetServiceProvider cast (Object object) {
		return (com.myhome.model.InternetServiceProvider) object;
	}

	public com.myhome.model.InternetServiceProvider get(java.lang.String key)
	{
		return (com.myhome.model.InternetServiceProvider) get(getReferenceClass(), key);
	}

	public com.myhome.model.InternetServiceProvider get(java.lang.String key, Session s)
	{
		return (com.myhome.model.InternetServiceProvider) get(getReferenceClass(), key, s);
	}

	public com.myhome.model.InternetServiceProvider load(java.lang.String key)
	{
		return (com.myhome.model.InternetServiceProvider) load(getReferenceClass(), key);
	}

	public com.myhome.model.InternetServiceProvider load(java.lang.String key, Session s)
	{
		return (com.myhome.model.InternetServiceProvider) load(getReferenceClass(), key, s);
	}

	public com.myhome.model.InternetServiceProvider loadInitialize(java.lang.String key, Session s) 
	{ 
		com.myhome.model.InternetServiceProvider obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.InternetServiceProvider> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.InternetServiceProvider> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.myhome.model.InternetServiceProvider> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param internetServiceProvider a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.String save(com.myhome.model.InternetServiceProvider internetServiceProvider)
	{
		return (java.lang.String) super.save(internetServiceProvider);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param internetServiceProvider a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.String save(com.myhome.model.InternetServiceProvider internetServiceProvider, Session s)
	{
		return (java.lang.String) save((Object) internetServiceProvider, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param internetServiceProvider a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.myhome.model.InternetServiceProvider internetServiceProvider)
	{
		saveOrUpdate((Object) internetServiceProvider);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param internetServiceProvider a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.myhome.model.InternetServiceProvider internetServiceProvider, Session s)
	{
		saveOrUpdate((Object) internetServiceProvider, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param internetServiceProvider a transient instance containing updated state
	 */
	public void update(com.myhome.model.InternetServiceProvider internetServiceProvider) 
	{
		update((Object) internetServiceProvider);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param internetServiceProvider a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.myhome.model.InternetServiceProvider internetServiceProvider, Session s)
	{
		update((Object) internetServiceProvider, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.String id)
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
	public void delete(java.lang.String id, Session s)
	{
		delete((Object) load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param internetServiceProvider the instance to be removed
	 */
	public void delete(com.myhome.model.InternetServiceProvider internetServiceProvider)
	{
		delete((Object) internetServiceProvider);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param internetServiceProvider the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.myhome.model.InternetServiceProvider internetServiceProvider, Session s)
	{
		delete((Object) internetServiceProvider, s);
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
	public void refresh (com.myhome.model.InternetServiceProvider internetServiceProvider, Session s)
	{
		refresh((Object) internetServiceProvider, s);
	}


}