package com.cgi.soa.masterclass.clickpay.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createUser(UserEntity user) {
		entityManager.persist(user);
		
	}

	@Override
	public void showAllUsers() {
		// TODO Auto-generated method stub
		
	}

}
