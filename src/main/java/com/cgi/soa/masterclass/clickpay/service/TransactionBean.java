package com.cgi.soa.masterclass.clickpay.service;

import java.util.Collection;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cgi.soa.masterclass.clickpay.model.FeeEntity;
import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;
import com.cgi.soa.masterclass.clickpay.model.UserEntity;

/**
 * Session Bean implementation class TransactionBean
 */
@Stateless
public class TransactionBean implements TransactionBeanLocal {
	
	private float TRANSACTION_FEE_RATE = 0.03f;

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public TransactionBean() {
		// 
	}

	public void deposit(UserEntity user, TransactionEntity transaction) {
		entityManager.persist(transaction);
		entityManager.persist(user);

	}

	public void clear(UserEntity user, TransactionEntity transaction) {
		entityManager.persist(transaction);
		entityManager.persist(user);
	}

	public void pay(UserEntity user, TransactionEntity transaction) {
		entityManager.persist(transaction);
		entityManager.persist(user);
		
		//calculate fee
		float fee = transaction.getAmount() * TRANSACTION_FEE_RATE;
		FeeEntity feeEntity = new FeeEntity(transaction, fee);
		entityManager.persist(feeEntity);
	}
	
	public List<FeeEntity> getRevenue() {
		List<FeeEntity> results = entityManager.createQuery(
				"SELECT e FROM " + FeeEntity.class.getName() + " e",
				FeeEntity.class).getResultList();
		return results;
	}
	
	public Collection<TransactionEntity> showUserTransactions(UserEntity userBean){
		Collection<TransactionEntity> userTransactions = userBean.getTransactions();
		return userTransactions;
		
	}


}
