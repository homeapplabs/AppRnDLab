package com.myhome.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.myhome.model.dao.iface.CraditCardDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseCraditCardDAO extends com.myhome.model.dao._RootDAO {

	public BaseCraditCardDAO () {}
	
	public BaseCraditCardDAO (Session session) {
		super(session);
	}

	// query name references


	public static CraditCardDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static CraditCardDAO getInstance () {
		if (null == instance) instance = new com.myhome.model.dao.CraditCardDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.myhome.model.CraditCard.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.myhome.model.CraditCard
	 */
	public com.myhome.model.CraditCard cast (Object object) {
		return (com.myhome.model.CraditCard) object;
	}

	public com.myhome.model.CraditCard get(java.lang.Long key)
	{
		return (com.myhome.model.CraditCard) get(getReferenceClass(), key);
	}

	public com.myhome.model.CraditCard get(java.lang.Long key, Session s)
	{
		return (com.myhome.model.CraditCard) get(getReferenceClass(), key, s);
	}

	public com.myhome.model.CraditCard load(java.lang.Long key)
	{
		return (com.myhome.model.CraditCard) load(getReferenceClass(), key);
	}

	public com.myhome.model.CraditCard load(java.lang.Long key, Session s)
	{
		return (com.myhome.model.CraditCard) load(getReferenceClass(), key, s);
	}

	public com.myhome.model.CraditCard loadInitialize(java.lang.Long key, Session s) 
	{ 
		com.myhome.model.CraditCard obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.CraditCard> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.CraditCard> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.myhome.model.CraditCard> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param craditCard a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.CraditCard craditCard)
	{
		return (java.lang.Long) super.save(craditCard);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param craditCard a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.CraditCard craditCard, Session s)
	{
		return (java.lang.Long) save((Object) craditCard, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param craditCard a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.myhome.model.CraditCard craditCard)
	{
		saveOrUpdate((Object) craditCard);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param craditCard a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.myhome.model.CraditCard craditCard, Session s)
	{
		saveOrUpdate((Object) craditCard, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param craditCard a transient instance containing updated state
	 */
	public void update(com.myhome.model.CraditCard craditCard) 
	{
		update((Object) craditCard);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param craditCard a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.myhome.model.CraditCard craditCard, Session s)
	{
		update((Object) craditCard, s);
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
	 * @param craditCard the instance to be removed
	 */
	public void delete(com.myhome.model.CraditCard craditCard)
	{
		delete((Object) craditCard);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param craditCard the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.myhome.model.CraditCard craditCard, Session s)
	{
		delete((Object) craditCard, s);
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
	public void refresh (com.myhome.model.CraditCard craditCard, Session s)
	{
		refresh((Object) craditCard, s);
	}


}