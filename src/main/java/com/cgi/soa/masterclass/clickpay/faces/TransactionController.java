package com.cgi.soa.masterclass.clickpay.faces;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transaction;

import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;
import com.cgi.soa.masterclass.clickpay.model.UserEntity;
import com.cgi.soa.masterclass.clickpay.service.TransactionBeanLocal;

public class TransactionController {

	private static final long serialVersionUID = -9137530186564436028L;

	private User user;
	private Transaction transaction;
	UserEntity userEntity = new UserEntity(user.getEmail(),
			user.getFirstName(), user.getLastName(), Integer.parseInt(user
					.getAccnumber()), user.getAccountFirstName(),
			user.getAccountLastName());
	
	//TransactionEntity transactionEntity = new TransactionEntity(transaction.getSender(), transaction.getRecipient(), 
	//		transaction.getTransdate(), transaction.getPurpose(), transaction.getAmount());
	
	private List<Transaction> userTransactions = new ArrayList<Transaction>();

	@Inject
	private TransactionBeanLocal transactionBean;
	
	
	public String createTransaction() {
		
		
		UserEntity userEntity = new UserEntity(user.getEmail(),
				user.getFirstName(), user.getLastName(), Integer.parseInt(user
						.getAccnumber()), user.getAccountFirstName(),
				user.getAccountLastName());
		
		/*
		if(transaction.getPurpose()="")  transactionBean.clear(TransactionEntity);
		if(transaction.getPurpose()="")  transactionBean.deposit(TransactionEntity);
		if(transaction.getPurpose()="")  transactionBean.pay(TransactionEntity);
		*/
		return "/transactions/index.html?faces-redirect=true";

	}

	public List<Transaction> getUserTransactions() {

		userTransactions.clear();
		/*
		for (TransactionEntity entity : transactionBean.showUserTransactions(userEntity)) {
			userTransactions.add(new Transaction(entity.getSender(), entity.getRecipient(), 
					entity.getTransdate(), entity.getPurpose(), entity.getAmount()  ));
					
		}
		//*/
		return userTransactions;
	}
	
	public User getTransaction() {
		if (user == null) {
			user = new User();
		}
		return user;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}


}
