/**
 * 
 */
package com.de.groceryplanner.daoimpl;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.de.groceryplanner.dao.ProductDao;
import com.de.groceryplanner.dto.ProductDto;

/**
 * @author Mandakini
 *
 */
@Dependent
public class ProductDaoImpl implements ProductDao {

	private EntityManager entityManager;
	
	public ProductDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getSessionFactory() {
		return entityManager;
	}

	/**
	 * @param entityManager the entityManager to set
	 */
	public void setSessionFactory(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.de.groceryplanner.dao.ProductDao#findProductById(long)
	 */
	@Override
	public ProductDto findProductById(long id) {
		
		ProductDto product = null;
		try {
			entityManager.getTransaction().begin();

			product = entityManager.find(ProductDto.class, id);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}

		return product;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.de.groceryplanner.dao.ProductDao#findProductByBarcode(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ProductDto findProductByBarcode(String barcode) {

		
	

		ProductDto product = null;
		try {
			entityManager.getTransaction().begin();


			@SuppressWarnings("deprecation")
			javax.persistence.Query q = entityManager.createNativeQuery(
					"select _Product from ProductDto _Product where PRODUCT_BARCODE=" + "'" + barcode + "'");

			product = (ProductDto) q.getSingleResult();
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}

		return product;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.de.groceryplanner.dao.ProductDao#updateProduct(com.de.groceryplanner.dto.
	 * ProductDto)
	 */
	@Override
	public void updateProduct(ProductDto product) {
		
		try {
			entityManager.getTransaction().begin();

			entityManager.persist(product); // update and forget
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.de.groceryplanner.dao.ProductDao#deleteProduct(com.de.groceryplanner.dto.
	 * ProductDto)
	 */
	@Override
	public void deleteProduct(ProductDto product) {
		/*Session session = entityManager.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			session.delete(product); // delete and forget
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
*/
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.de.groceryplanner.dao.ProductDao#saveProduct(com.de.groceryplanner.dto.
	 * ProductDto)
	 */
	@Override
	public void saveProduct(ProductDto product) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ProductDto> findAllProducts() {
		Query query=null;
		
		try {
			entityManager.getTransaction().begin();


	    query = entityManager.createQuery("SELECT e FROM Product e");
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityManager.getTransaction().rollback();
		}

		 return (List<ProductDto>) query.getResultList();
	}

}
