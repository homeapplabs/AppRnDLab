package com.myhome.model.base;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import com.myhome.model.dao.iface.LoanProviderDAO;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseLoanProviderDAO extends com.myhome.model.dao._RootDAO {

	public BaseLoanProviderDAO () {}
	
	public BaseLoanProviderDAO (Session session) {
		super(session);
	}

	// query name references


	public static LoanProviderDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static LoanProviderDAO getInstance () {
		if (null == instance) instance = new com.myhome.model.dao.LoanProviderDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.myhome.model.LoanProvider.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.myhome.model.LoanProvider
	 */
	public com.myhome.model.LoanProvider cast (Object object) {
		return (com.myhome.model.LoanProvider) object;
	}

	public com.myhome.model.LoanProvider get(java.lang.Long key)
	{
		return (com.myhome.model.LoanProvider) get(getReferenceClass(), key);
	}

	public com.myhome.model.LoanProvider get(java.lang.Long key, Session s)
	{
		return (com.myhome.model.LoanProvider) get(getReferenceClass(), key, s);
	}

	public com.myhome.model.LoanProvider load(java.lang.Long key)
	{
		return (com.myhome.model.LoanProvider) load(getReferenceClass(), key);
	}

	public com.myhome.model.LoanProvider load(java.lang.Long key, Session s)
	{
		return (com.myhome.model.LoanProvider) load(getReferenceClass(), key, s);
	}

	public com.myhome.model.LoanProvider loadInitialize(java.lang.Long key, Session s) 
	{ 
		com.myhome.model.LoanProvider obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.LoanProvider> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.myhome.model.LoanProvider> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.myhome.model.LoanProvider> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param loanProvider a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.LoanProvider loanProvider)
	{
		return (java.lang.Long) super.save(loanProvider);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param loanProvider a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Long save(com.myhome.model.LoanProvider loanProvider, Session s)
	{
		return (java.lang.Long) save((Object) loanProvider, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param loanProvider a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.myhome.model.LoanProvider loanProvider)
	{
		saveOrUpdate((Object) loanProvider);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param loanProvider a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.myhome.model.LoanProvider loanProvider, Session s)
	{
		saveOrUpdate((Object) loanProvider, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param loanProvider a transient instance containing updated state
	 */
	public void update(com.myhome.model.LoanProvider loanProvider) 
	{
		update((Object) loanProvider);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param loanProvider a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.myhome.model.LoanProvider loanProvider, Session s)
	{
		update((Object) loanProvider, s);
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
	 * @param loanProvider the instance to be removed
	 */
	public void delete(com.myhome.model.LoanProvider loanProvider)
	{
		delete((Object) loanProvider);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param loanProvider the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.myhome.model.LoanProvider loanProvider, Session s)
	{
		delete((Object) loanProvider, s);
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
	public void refresh (com.myhome.model.LoanProvider loanProvider, Session s)
	{
		refresh((Object) loanProvider, s);
	}


}