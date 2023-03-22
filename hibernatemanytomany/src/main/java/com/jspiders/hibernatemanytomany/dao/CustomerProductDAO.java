package com.jspiders.hibernatemanytomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernatemanytomany.dto.CustomerDTO;
import com.jspiders.hibernatemanytomany.dto.ProductDTO;

public class CustomerProductDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	// open connection
	private static void openConnection() {
		factory=Persistence.createEntityManagerFactory("ManyToMany");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}

	//close connection
	private static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		if(transaction.isActive()) {
			transaction.rollback();
		}
	}
public static void main(String[] args) {
	try {
		openConnection();
		transaction.begin();
		
		CustomerDTO customer1=new CustomerDTO();
		customer1.setId(1);
		customer1.setName("Seerat");
		customer1.setCity("Delhi");
		customer1.setContact(25643565622l);
		manager.persist(customer1);
		
		CustomerDTO customer2=new CustomerDTO();
		customer2.setId(2);
		customer2.setName("Rinku");
		customer2.setCity("Patna");
		customer2.setContact(256435698787l);
		manager.persist(customer2);
		
		CustomerDTO customer3=new CustomerDTO();
		customer3.setId(3);
		customer3.setName("Rajkumar");
		customer3.setCity("Mumbai");
		customer3.setContact(25643565365l);
		manager.persist(customer3);
		
		ProductDTO product1=new ProductDTO();
		product1.setId(1);
		product1.setName("TV");
		product1.setCategory("Electronics");
		product1.setPrice(24000);
		
		 List<ProductDTO> product1=Arrays.asList(product1, product2);
		 customer1.setProducts(product1);
		 manager.persist(customer1);
		 
		 List<ProductDTO> product2=Arrays.asList(product2, product3);
		 customer2.setProducts(product2);
		 manager.persist(customer2);
		 
		 List<ProductDTO> product3=Arrays.asList(product1, product3);
		 customer3.setProducts(product3);
		 manager.persist(customer3);
		 
		transaction.commit();
	}
	finally {
		closeConnection();
	}
}
}
