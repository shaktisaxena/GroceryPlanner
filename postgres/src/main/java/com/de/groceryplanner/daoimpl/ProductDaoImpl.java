/**
 * 
 */
package com.de.groceryplanner.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.de.groceryplanner.dao.ProductDao;
import com.de.groceryplanner.dto.ProductDto;
import com.de.hibernate.launcher.HibernateUtil;

/**
 * @author Mandakini
 *
 */
public class ProductDaoImpl implements ProductDao {

	private SessionFactory sessionFactory;

	
	/**
	 * @param sessionFactory
	 */
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.ProductDao#findProductById(long)
	 */
	@Override
	public ProductDto findProductById(long id) {
		Session session = sessionFactory.openSession();
		Transaction transaction= null;
		
		
		ProductDto product=null;
		try {
			transaction=session.beginTransaction();
			
			product = session.get(ProductDto.class,id);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		return product;
	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.ProductDao#findProductByBarcode(java.lang.String)
	 */
	@Override
	public ProductDto findProductByBarcode(String barcode) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction= null;
		
		
		ProductDto product=null;
		try {
			transaction=session.beginTransaction();
			
			product = session.get(ProductDto.class,barcode);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		return product;
		
	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.ProductDao#updateProduct(com.de.groceryplanner.dto.ProductDto)
	 */
	@Override
	public void updateProduct(ProductDto product) {
		Session session = sessionFactory.openSession();
		Transaction transaction= null;
		
		
		
		try {
			transaction=session.beginTransaction();
			
			session.update(product); // update and forget
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.ProductDao#deleteProduct(com.de.groceryplanner.dto.ProductDto)
	 */
	@Override
	public void deleteProduct(ProductDto product) {
		Session session = sessionFactory.openSession();
		Transaction transaction= null;
		
		
		
		try {
			transaction=session.beginTransaction();
			
			session.delete(product); // delete and forget
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

	/* (non-Javadoc)
	 * @see com.de.groceryplanner.dao.ProductDao#saveProduct(com.de.groceryplanner.dto.ProductDto)
	 */
	@Override
	public void saveProduct(ProductDto product) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ProductDto> findAllProducts() {
		Session session = sessionFactory.openSession();
		Transaction transaction= null;
		
		
		List<ProductDto> productList=null;
		try {
			transaction=session.beginTransaction();
			
			productList = session.createCriteria(ProductDto.class).list();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		
		return productList;
	}

}
