package com.jspiders.hibernateonetomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernateonetomany.dto.CompanyDTO;
import com.jspiders.hibernateonetomany.dto.EmployeesDTO;

public class CompanyEmployeesDAO {
private static EntityManagerFactory factory;
private static EntityManager manager;
private static EntityTransaction transaction;

// open connection
private static void openConnection() {
	factory=Persistence.createEntityManagerFactory("OneToMany");
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

// main()
     public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			EmployeesDTO employee1=new EmployeesDTO();
			employee1.setId(1);
			employee1.setName("Guddu");
			employee1.setDesignation("developer");
			employee1.setEmail("guddu@gmail.com");
			employee1.setSalary(58555.50);
			manager.persist(employee1);
			
			EmployeesDTO employee2=new EmployeesDTO();
			employee2.setId(2);
			employee2.setName("Sunil");
			employee2.setDesignation("Testing");
			employee2.setEmail("sunil@gmail.com");
			employee2.setSalary(40005.55);
			manager.persist(employee2);
			
			List<EmployeesDTO> employees=Arrays.asList(employee1, employee2);
			
			CompanyDTO company1=new CompanyDTO();
			company1.setId(1);
			company1.setName("TCS");
			company1.setCity("Delhi");
			company1.setEmployees(employees);
			
			transaction.commit();
		}
		finally {
			closeConnection();
		}
	}
}
