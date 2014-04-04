package com.cgi.soa.masterclass.clickpay.service;

import java.util.Collection;
import java.util.List;

import javax.ejb.Local;

import com.cgi.soa.masterclass.clickpay.model.FeeEntity;
import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;
import com.cgi.soa.masterclass.clickpay.model.UserEntity;

@Local
public interface TransactionBeanLocal {
	
    public void deposit(UserEntity user, TransactionEntity bean);
    
    public void clear(UserEntity user, TransactionEntity bean);
    
    public void pay(UserEntity user, TransactionEntity bean);
    
    public Collection<TransactionEntity> showUserTransactions(UserEntity UserBean);
    
	public List<FeeEntity> getRevenue();

}
