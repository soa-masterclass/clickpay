package com.cgi.soa.masterclass.clickpay.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cgi.soa.masterclass.clickpay.model.UserEntity;

/**
 * Session Bean implementation class UserBean
 */
@Stateless
public class UserBean implements UserBeanLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserBean() {
		//
	}

	@Override
	public void createUser(UserEntity user) {
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();

	}

	@Override
	public List<UserEntity> showAllUsers() {
		entityManager.getTransaction().begin();
		List<UserEntity> results = entityManager.createQuery(
				"SELECT e FROM " + UserEntity.class.getName() + " e",
				UserEntity.class).getResultList();
		entityManager.getTransaction().commit();
		return results;

	}

}
