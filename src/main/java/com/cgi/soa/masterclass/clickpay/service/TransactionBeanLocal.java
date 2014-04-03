package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.Local;

@Local
public interface TransactionBeanLocal {
	
    public void deposit(int userId, String purpose, int amount);
    
    public void clear(int userId, String purpose, int amount);
    
    public void pay(int userId, String recipientEmail, String purpose, int amount);

}
