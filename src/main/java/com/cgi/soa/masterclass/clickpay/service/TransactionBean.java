package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class TransactionBean
 */
@Stateless
public class TransactionBean implements TransactionBeanLocal {

    /**
     * Default constructor. 
     */
    public TransactionBean() {
        // TODO Auto-generated constructor stub
    }
    
    public void deposit(int userId, String purpose, int amount) {
    	
    }
    
    
    public void clear(int userId, String purpose, int amount) {
    	
    }
    
    public void pay(int userId, String recipientEmail, String purpose, int amount) {
    	
    }

}
