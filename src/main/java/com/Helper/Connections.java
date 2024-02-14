package com.Helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Connections {
	 public static EntityManagerFactory factory=null;
	 public static EntityManager manager =null;
	 public static EntityTransaction transaction=null;
	static {
		factory = Persistence.createEntityManagerFactory("vikas");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
}
