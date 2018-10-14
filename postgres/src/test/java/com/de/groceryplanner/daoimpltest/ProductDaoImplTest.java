/**
 * 
 */
package com.de.groceryplanner.daoimpltest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.de.groceryplanner.daoimpl.ProductDaoImpl;
import com.de.groceryplanner.dto.ProductDto;

/**
 * @author Mandakini
 *
 */
public class ProductDaoImplTest {

	
	static ProductDto productObject;
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;
	static ProductDaoImpl productionDaoImpl;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		/*
		SessionFactory sessionFactoryObj;
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();

		// Creating Hibernate SessionFactory Instance
		sessionFactoryObj = new MetadataSources(serviceRegistryObj).buildMetadata().buildSessionFactory();
		sessionObj = sessionFactoryObj.openSession();
		
		 productionDaoImpl= new ProductDaoImpl(sessionFactoryObj);*/
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.de.groceryplanner.daoimpl.ProductDaoImpl#findProductById(long)}.
	 */
	@Test
	public void testFindProductById() {
		
		long id=5;
		
		ProductDto product= productionDaoImpl.findProductById(id);
		
		assertTrue(id==product.getProductId());
	}

	/**
	 * Test method for {@link com.de.groceryplanner.daoimpl.ProductDaoImpl#findProductByBarcode(java.lang.String)}.
	 */
	@Test
	public void testFindProductByBarcode() {
String barcode="123455";
		
		ProductDto product= productionDaoImpl.findProductByBarcode(barcode);
		
		assertTrue(barcode.equals(product.getBarCode()));
	}

	/**
	 * Test method for {@link com.de.groceryplanner.daoimpl.ProductDaoImpl#updateProduct(com.de.groceryplanner.dto.ProductDto)}.
	 */
	@Test
	public void testUpdateProduct() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.de.groceryplanner.daoimpl.ProductDaoImpl#deleteProduct(com.de.groceryplanner.dto.ProductDto)}.
	 */
	@Test
	public void testDeleteProduct() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.de.groceryplanner.daoimpl.ProductDaoImpl#saveProduct(com.de.groceryplanner.dto.ProductDto)}.
	 */
	@Test
	public void testSaveProduct() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.de.groceryplanner.daoimpl.ProductDaoImpl#findAllProducts()}.
	 */
	@Test
	public void testFindAllProducts() {
		
		List<ProductDto> listProducts= productionDaoImpl.findAllProducts();

	}

}
