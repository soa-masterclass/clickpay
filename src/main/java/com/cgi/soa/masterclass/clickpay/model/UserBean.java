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
	public void createUser(String firstname, String lastName, String email,
			String accountNumber, String accountFirstName,
			String accountLastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAllUsers() {
		// TODO Auto-generated method stub
		
	}

}
