package com.cgi.soa.masterclass.clickpay.faces;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transaction;

import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;
import com.cgi.soa.masterclass.clickpay.service.TransactionBeanLocal;

public class TransactionController {

	private static final long serialVersionUID = -9137530186564436028L;

	private Transaction transaction;
	
	private List<Transaction> allTransactions = new ArrayList<Transaction>();

	@Inject
	private TransactionBeanLocal transactionBean;
	
	
	public String createTransaction() {
		
		
		TransactionEntity transactionEntity = new TransactionEntity(((TransactionEntity) transaction).getAmount(),
				((TransactionEntity) transaction).getId(), ((TransactionEntity) transaction).getPurpose(),
				((TransactionEntity) transaction).getRecipient(),
				((TransactionEntity) transaction).getSender(), transaction.getTransdate());

		transactionBean.createTransaction(transactionEntity);
		return "/transactions/index.html?faces-redirect=true";

	}

	public List<Transaction> getAllTransactions() {

		allTransactions.clear();
		for (TransactionEntity entity : transactionBean.showAllTransactions()) {
			allTransactions.add(new Transaction(entity.getFirstname(), entity.getLastname(),
					String.valueOf(entity.getAccnumber()), entity
							.getAcc_firstname(), entity.getAcc_lastname(),
					entity.getEmail()));
		}
		return allTransactions;
	}

	public Transaction getTransaction() {
		if (transaction == null) {
			transaction = new Transaction();
		}
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}


}
