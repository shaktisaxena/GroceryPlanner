package com.de.hibernate.launcher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.de.hibernate.businessobject.Category;
import com.de.hibernate.businessobject.Product;
import com.de.hibernate.businessobject.Store;
import com.de.hibernate.businessobject.StoreType;

public class AppMain {

	static Product productObject;
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	private static SessionFactory buildSessionFactory() {
		// Creating Configuration Instance & Passing Hibernate Configuration File
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");

		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 

		// Creating Hibernate SessionFactory Instance
		sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		return sessionFactoryObj;
	}

	public static void main(String[] args) {
		System.out.println(".......Hibernate Maven Example.......\n");
		try {
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
				
				Store store = new Store("EDEKA",StoreType.ONLINE,"https://www");
				productObject = new Product("Toothpaste","123455",4,store, new Category("Daily"));
				
				sessionObj.beginTransaction();
				sessionObj.saveOrUpdate(productObject);
			
			System.out.println("\n.......Records Saved Successfully To The Database.......\n");

			// Committing The Transactions To The Database
			// commit only if tx still hasn't been committed yet (by hibernate)
			
			sessionObj.getTransaction().commit();
		} catch(Exception sqlException) {
			if(null != sessionObj.getTransaction()) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				sessionObj.getTransaction().rollback();
			}
			sqlException.printStackTrace();
		} finally {
			if(sessionObj != null) {
				sessionObj.close();
			}
		}
	}
}