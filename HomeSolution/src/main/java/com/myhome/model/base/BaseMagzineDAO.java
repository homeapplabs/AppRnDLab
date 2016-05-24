package com.myhome.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.myhome.model.dao.iface.MagzineDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseMagzineDAO extends com.myhome.model.dao._RootDAO {

	public BaseMagzineDAO () {}
	
	public BaseMagzineDAO (Session session) {
		super(session);
	}

	// query name references


	public static MagzineDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static MagzineDAO getInstance () {
		if (null == instance) instance = new com.myhome.model.dao.MagzineDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.myhome.model.Magzine.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.myhome.model.Magzine
	 */
	public com.myhome.model.Magzine cast (Object object) {
		return (com.myhome.model.Magzine) object;
	}

	public com.myhome.model.Magzine get(java.lang.Long key)
	{
		return (com.myhome.model.Magzine) get(getReferenceClass(), key);
	}

	public com.myhome.model.Magzine get(java.lang.Long key, Session s)
	{
		return (com.myhome.model.Magzine) get(getReferenceClass(), key, s);
	}

	public com.myhome.model.Magzine load(java.lang.Long key)
	{
		return (com.myhome.model.Magzine) load(getReferenceClass(), key);
	}

	public com.myhome.model.Magzine load(java.lang.Long key, Session s)
	{
		return (com.myhome.model.Magzine) load(getReferenceClass(), key, s);
	}

	public com.myhome.model.Magzine loadInitialize(java.lang.Long key, Session s) 
	{ 
		com.myhome.model.Magzine obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.Magzine> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.Magzine> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.myhome.model.Magzine> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param magzine a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.Magzine magzine)
	{
		return (java.lang.Long) super.save(magzine);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param magzine a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.Magzine magzine, Session s)
	{
		return (java.lang.Long) save((Object) magzine, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param magzine a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.myhome.model.Magzine magzine)
	{
		saveOrUpdate((Object) magzine);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param magzine a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.myhome.model.Magzine magzine, Session s)
	{
		saveOrUpdate((Object) magzine, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param magzine a transient instance containing updated state
	 */
	public void update(com.myhome.model.Magzine magzine) 
	{
		update((Object) magzine);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param magzine a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.myhome.model.Magzine magzine, Session s)
	{
		update((Object) magzine, s);
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
	 * @param magzine the instance to be removed
	 */
	public void delete(com.myhome.model.Magzine magzine)
	{
		delete((Object) magzine);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param magzine the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.myhome.model.Magzine magzine, Session s)
	{
		delete((Object) magzine, s);
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
	public void refresh (com.myhome.model.Magzine magzine, Session s)
	{
		refresh((Object) magzine, s);
	}


}