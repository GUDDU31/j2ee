package com.jspiders.hibernateonetoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernateonetoone.dto.AadharDTO;
import com.jspiders.hibernateonetoone.dto.PersonDTO;

public class PersonAadharDAO {
private static EntityManagerFactory factory;
private static EntityManager manager;
private static EntityTransaction transaction;

// open connection
private static void openConnection() {
	factory=Persistence.createEntityManagerFactory("aadhar");
	manager=factory.createEntityManager();
	transaction=manager.getTransaction();
}

// close connection
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
		
		PersonDTO person=new PersonDTO();
		person.setId(1);
		person.setName("Guddu Kumar Singh");
		person.setFathers_name("Balistar Singh");
		person.setContact(8360294684l);
		person.setDate_of_birth("20-March-1996");
		person.setAddress("Gopalganj");
		
		AadharDTO aadhar=new AadharDTO();
		aadhar.setId(1);
		aadhar.setAadhar_no(405071958489l);
		aadhar.setContact(8360294684l);
		aadhar.setState("Bihar");
		
		aadhar.setPerson(person);
		person.setAadhar(aadhar);
		
		manager.persist(person);
		manager.persist(aadhar);
		
		transaction.commit();
		
	}
	finally {
		closeConnection();
	}
}
}
