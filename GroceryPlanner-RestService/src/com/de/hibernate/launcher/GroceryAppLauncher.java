package com.de.hibernate.launcher;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.de.groceryplanner.daoimpl.ProductDaoImpl;
import com.de.groceryplanner.dto.ProductDto;

public class GroceryAppLauncher {
	static ProductDto productObject;
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	public static void main(String[] args) {
	/*	
		String barcode="123455";
		SessionFactory sessionFactoryObj;
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml")
				.build();

		// Creating Hibernate SessionFactory Instance
		sessionFactoryObj = new MetadataSources(serviceRegistryObj).buildMetadata().buildSessionFactory();
		sessionObj = sessionFactoryObj.openSession();
		
		ProductDaoImpl productdao= new ProductDaoImpl(sessionFactoryObj);
		
		ProductDto productdto=	productdao.findProductByBarcode(barcode);
		
	
		System.out.println(productdto);
		
		List<ProductDto> list= productdao.findAllProducts();
		
		for (ProductDto productDto2 : list) {
			System.out.println(productDto2);
		}
		
		
*/
	}
}
