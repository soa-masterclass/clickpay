package com.cgi.soa.masterclass.clickpay.service;

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

	public void deposit(TransactionEntity bean) {
		entityManager.persist(bean);

	}

	public void clear(TransactionEntity bean) {
		entityManager.persist(bean);
	}

	public void pay(TransactionEntity bean) {
		entityManager.persist(bean);
		
		//calculate fee
		float fee = bean.getAmount() * TRANSACTION_FEE_RATE;
		FeeEntity feeEntity = new FeeEntity(bean, fee);
		entityManager.persist(feeEntity);
	}
	
	public List<FeeEntity> getRevenue() {
		List<FeeEntity> results = entityManager.createQuery(
				"SELECT e FROM " + FeeEntity.class.getName() + " e",
				FeeEntity.class).getResultList();
		return results;
	}
	
	public List<TransactionEntity> showUserTransactions(UserEntity UserBean){
		List<TransactionEntity> userTransactions = entityManager.createQuery(
				"SELECT e FROM " + TransactionEntity.class.getName() + " e " +
				"WHERE  recipient = " + UserBean + "OR sender = " + UserBean,
				TransactionEntity.class).getResultList();
//		entityManager.getTransaction().commit();
		return userTransactions;
		
	}

}
