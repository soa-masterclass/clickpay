package com.cgi.soa.masterclass.clickpay.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Fee
 *
 */
@Entity
@Table
public class FeeEntity implements Serializable {

	   
	public FeeEntity(TransactionEntity transaction, float amount) {
		super();
		this.transaction = transaction;
		this.amount = amount;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@JoinColumn
	private TransactionEntity transaction;
	
	@Column
	private float amount;
	
	private static final long serialVersionUID = 1L;

	public FeeEntity() {
	}   
	
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public TransactionEntity getTransaction() {
		return this.transaction;
	}

	public void setTransaction(TransactionEntity transaction) {
		this.transaction = transaction;
	}   
	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
   
}
