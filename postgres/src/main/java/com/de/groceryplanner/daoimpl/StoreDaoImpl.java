/**
 * 
 */
package com.de.groceryplanner.daoimpl;

import org.hibernate.SessionFactory;

import com.de.groceryplanner.dao.StoreDao;
import com.de.groceryplanner.dto.StoreDto;

/**
 * @author Mandakini
 *
 */
public class StoreDaoImpl implements StoreDao {

	
	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 */
	public StoreDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 
	 */
	public StoreDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.StoreDao#findStoreById(long)
	 */
	@Override
	public StoreDto findStoreById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.StoreDao#updateStore(com.de.groceryplanner.dto.StoreDto)
	 */
	@Override
	public void updateStore(StoreDto store) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.StoreDao#deleteStore(com.de.groceryplanner.dto.StoreDto)
	 */
	@Override
	public void deleteStore(StoreDto store) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.StoreDao#saveStore(com.de.groceryplanner.dto.StoreDto)
	 */
	@Override
	public void saveStore(StoreDto store) {
		// TODO Auto-generated method stub

	}

}
