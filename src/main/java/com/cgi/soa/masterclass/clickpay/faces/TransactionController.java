package com.cgi.soa.masterclass.clickpay.faces;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transaction;

import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;
import com.cgi.soa.masterclass.clickpay.service.TransactionBeanLocal;

public class TransactionController {

	private static final long serialVersionUID = -9137530186564436028L;

	private User user;

	private List<Transaction> userTransactions = new ArrayList<Transaction>();

	@Inject
	private TransactionBeanLocal transactionBean;

	public String makePay() {
		return "/transactions/index.html?faces-redirect=true";

	}
	
	public String makeDeposit() {
		return "/transactions/index.html?faces-redirect=true";

	}
	
	public String makeClearance() {
		return "/transactions/index.html?faces-redirect=true";

	}

	public List<Transaction> getUserTransactions() {

		userTransactions.clear();
		
//		for (TransactionEntity entity : transactionBean.showUserTransactions(userEntity)) {
//			userTransactions.add(new Transaction(entity.getSender(), entity.getRecipient(), 
//					entity.getTransdate(), entity.getPurpose(), entity.getAmount()  ));
//					
//		}
		
		return userTransactions;
	}

	
	public User getUser() {
		if (user == null) {
			user = new User();
		}
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


}
