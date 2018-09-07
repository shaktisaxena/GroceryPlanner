package postgres;



import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import com.de.hibernate.businessobject.Product;

public class TestProduct {/*
	
	
	
	@Test
	public void crud() {
		 Product productObject;
		 Session sessionObj;
		 SessionFactory sessionFactoryObj;

		// Creating Configuration Instance & Passing Hibernate Configuration File
				
				// exception handling omitted for brevity

		       
				// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
				ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 

				// Creating Hibernate SessionFactory Instance
				sessionFactoryObj = new MetadataSources( serviceRegistryObj )
	                    .buildMetadata()
	                    .buildSessionFactory();
				sessionObj = sessionFactoryObj.openSession();
				 
		create(sessionObj);
		read(sessionObj);
		
		update(sessionObj);
		read(sessionObj);
		
		delete(sessionObj);
		read(sessionObj);
		
		sessionObj.close();
	}
	
	private void delete(Session session) {
		System.out.println("Deleting mondeo record...");
		Product mondeo = session.get(Product.class, "mondeo");
		
		session.beginTransaction();
		session.delete(mondeo);
		session.getTransaction().commit();
	}
	
	private void update(Session session) {
		System.out.println("Updating mustang NumberOfItems...");
		Product product = session.get(Product.class, "mustang");
		product.setBarCode("Toothpaste");
		product.setNumberOfItems(5);
		
		session.beginTransaction();
		session.saveOrUpdate(product);
		session.getTransaction().commit();
	}

	private void create(Session session) {
		System.out.println("Creating Product records...");
		Object object=null;
		Product product=null;
		JSONParser parser= new JSONParser();
		
		try {
			 object= parser.parse(new FileReader("src/test/resources/Products.json"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject jsonObject = (JSONObject) object; 
		 
		
		JSONArray productList = (JSONArray) jsonObject.get("Product");
		 
		
		Iterator<JSONObject> iterator = productList.iterator();
		session.beginTransaction();
        while (iterator.hasNext()) {
        	JSONObject jsonProd=iterator.next();
            System.out.println();
        	 product = new Product();
        	product.setBarCode((String)jsonProd.get(""));
        	product.setNumberOfItems(Integer.parseInt((String)jsonProd.get("numberofitems")));
        	
        	session.save(product);
        	session.getTransaction().commit();
        }
		 
		
		
		
	}
	
	private void read(Session session) {
		
		@SuppressWarnings("deprecation")
		Query<Product> q = session.createQuery("select _Product from product _Product");
		
		List<Product> Products = q.list();
		
		System.out.println("Reading Product records...");
		System.out.printf("%-30.30s  %-30.30s%n", "BarCode", "NumberOfItems");
		for (Product c : Products) {
			System.out.printf("%-30.30s  %-30.30s%n", c.getBarCode(), c.getNumberOfItems());
		}
		
	}
*/}


