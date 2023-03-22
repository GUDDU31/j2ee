package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.EmployeeDTO;

public class EmpFindDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("emp");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}
	
	public static void main(String[] args) {
		try {
			
			openConnection();
			
			transaction.begin();
			
			EmployeeDTO employee1 = manager.find(EmployeeDTO.class, 1);
			EmployeeDTO employee2 = manager.find(EmployeeDTO.class, 2);
			EmployeeDTO employee3 = manager.find(EmployeeDTO.class, 3);
			EmployeeDTO employee4 = manager.find(EmployeeDTO.class, 4);
			EmployeeDTO employee5 = manager.find(EmployeeDTO.class, 5);
			
			System.out.println(employee1);
			System.out.println(employee2);
			System.out.println(employee3);
			System.out.println(employee4);
			System.out.println(employee5);
			
			transaction.commit();
			
			
		} finally {
			closeConnection();
		}
	}

}
