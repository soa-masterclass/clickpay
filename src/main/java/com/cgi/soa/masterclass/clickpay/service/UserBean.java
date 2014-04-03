package com.cgi.soa.masterclass.clickpay.service;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public Collection<UserEntity> showAllUsers() {
		entityManager.getTransaction().begin();
	    Query query = entityManager.createQuery("SELECT e FROM Professor e");
	    Collection<UserEntity> results = (Collection<UserEntity>) query.getResultList();
	    entityManager.getTransaction().commit();
	    return results;
		
	}

}
