package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.Local;

import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;

@Local
public interface TransactionBeanLocal {
	
    public void deposit(TransactionEntity bean);
    
    public void clear(TransactionEntity bean);
    
    public void pay(TransactionEntity bean);

}
