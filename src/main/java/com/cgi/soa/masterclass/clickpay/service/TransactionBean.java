package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cgi.soa.masterclass.clickpay.model.TransactionEntity;

/**
 * Session Bean implementation class TransactionBean
 */
@Stateless
public class TransactionBean implements TransactionBeanLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public TransactionBean() {
		// TODO Auto-generated constructor stub
	}

	public void deposit(TransactionBean bean) {
		entityManager.persist(bean);

	}

	public void clear(TransactionBean bean) {
		entityManager.persist(bean);
	}

	public void pay(TransactionBean bean) {
		entityManager.persist(bean);
	}

}
