package com.UserDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.UserEntity.UserInfo;

public class UserDao {
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager manager = factory.createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();

	public static UserInfo saveUser(UserInfo user) {

		transaction.begin();
		manager.persist(user);
		transaction.commit();

		return user;
	}

}
