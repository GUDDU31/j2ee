package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.EmployeeDTO;

public class EmployeeDAO {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	
	private static void openConnection() {
		entityManagerFactory = 
				Persistence.createEntityManagerFactory("emp");

		entityManager = entityManagerFactory.createEntityManager();

		entityTransaction = entityManager.getTransaction();
	}
	
	private static void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction.isActive()) {
			entityTransaction.rollback();
		}
	}

	public static void main(String[] args) {

		try {
			openConnection();

			entityTransaction.begin();

			EmployeeDTO employee1 = new EmployeeDTO();
			employee1.setId(1);
			employee1.setName("Komal");
			employee1.setEmail("komal@gmail.com");
			employee1.setContact(9875641531L);
			
			EmployeeDTO employee2 = new EmployeeDTO();
			employee2.setId(2);
			employee2.setName("Kajol");
			employee2.setEmail("kajol@gmail.com");
			employee2.setContact(9875641556L);
			
			EmployeeDTO employee3 = new EmployeeDTO();
			employee3.setId(3);
			employee3.setName("Krishna");
			employee3.setEmail("krishna@gmail.com");
			employee3.setContact(9875641589L);
			
			EmployeeDTO employee4 = new EmployeeDTO();
			employee4.setId(4);
			employee4.setName("guddu");
			employee4.setEmail("guddu@gmail.com");
			employee4.setContact(9875641584L);
			
			EmployeeDTO employee5 = new EmployeeDTO();
			employee5.setId(5);
			employee5.setName("Rakesh");
			employee5.setEmail("Rakesh@gmail.com");
			employee5.setContact(9875641520L);

			entityManager.persist(employee1);
			entityManager.persist(employee2);
			entityManager.persist(employee3);
			entityManager.persist(employee4);
			entityManager.persist(employee5);

			entityTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}
}
