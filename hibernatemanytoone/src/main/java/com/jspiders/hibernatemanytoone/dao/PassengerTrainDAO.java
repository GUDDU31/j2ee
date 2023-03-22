package com.jspiders.hibernatemanytoone.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernatemanytoone.dto.PassengerDTO;
import com.jspiders.hibernatemanytoone.dto.TrainDTO;

public class PassengerTrainDAO {
private static EntityManagerFactory factory;
private static EntityManager manager;
private static EntityTransaction transaction;

private static void openConnection() {
	factory=Persistence.createEntityManagerFactory("ManyToOne");
	manager=factory.createEntityManager();
	transaction=manager.getTransaction();
}

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
		
		TrainDTO train=new TrainDTO();
		train.setId(1);
		train.setTrain_name("Chennai Express");
		train.setTrain_no(25525);
		manager.persist(train);
		
		PassengerDTO passenger1=new PassengerDTO();
		passenger1.setId(1);
		passenger1.setName("Guddu");
		passenger1.setAge(25);
		passenger1.setSeat_no(15);
		manager.persist(passenger1);
		
		PassengerDTO passenger2=new PassengerDTO();
		passenger2.setName("Pushpa");
		passenger2.setAge(20);
		passenger2.setSeat_no(16);
		manager.persist(passenger2);
		
		transaction.commit();
	}
	finally {
		closeConnection();
	}
}
}
