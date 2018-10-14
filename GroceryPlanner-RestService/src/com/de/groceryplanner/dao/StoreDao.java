/**
 * 
 */
package com.de.groceryplanner.dao;

import com.de.groceryplanner.dto.StoreDto;

/**
 * @author Mandakini
 *
 */
public interface StoreDao {
	
	StoreDto findStoreById(long id);


	void updateStore(StoreDto store);

	void deleteStore(StoreDto store);
	
	void saveStore(StoreDto store);

}
