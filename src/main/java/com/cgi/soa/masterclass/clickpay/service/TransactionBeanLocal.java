package com.cgi.soa.masterclass.clickpay.service;

import java.util.List;

import javax.ejb.Local;

import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;
import com.cgi.soa.masterclass.clickpay.model.UserEntity;

@Local
public interface TransactionBeanLocal {
	
    public void deposit(TransactionEntity bean);
    
    public void clear(TransactionEntity bean);
    
    public void pay(TransactionEntity bean);
    
    public List<TransactionEntity> showUserTransactions(UserEntity UserBean);

}
