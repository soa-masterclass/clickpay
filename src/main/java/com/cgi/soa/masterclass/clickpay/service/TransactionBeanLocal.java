package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.Local;

@Local
public interface TransactionBeanLocal {
	
    public void deposit(TransactionBean bean);
    
    public void clear(TransactionBean bean);
    
    public void pay(TransactionBean bean);

}
