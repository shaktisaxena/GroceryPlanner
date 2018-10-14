/**
 * 
 */
package com.de.groceryplanner.daoimpl;

import org.hibernate.SessionFactory;

import com.de.groceryplanner.dao.CategoryDao;
import com.de.groceryplanner.dto.CategoryDto;

/**
 * @author Mandakini
 *
 */
public class CategoryDaoImpl implements CategoryDao {

	private SessionFactory sessionFactory;
	
	/**
	 * @param sessionFactory
	 */
	public CategoryDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 
	 */
	public CategoryDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.CategoryDao#findProductById(long)
	 */
	@Override
	public CategoryDto findProductById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.CategoryDao#updateCategory(com.de.groceryplanner.dto.CategoryDto)
	 */
	@Override
	public void updateCategory(CategoryDto category) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.CategoryDao#deleteCategory(com.de.groceryplanner.dto.CategoryDto)
	 */
	@Override
	public void deleteCategory(CategoryDto category) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.CategoryDao#saveCategory(com.de.groceryplanner.dto.CategoryDto)
	 */
	@Override
	public void saveCategory(CategoryDto category) {
		// TODO Auto-generated method stub

	}

}
