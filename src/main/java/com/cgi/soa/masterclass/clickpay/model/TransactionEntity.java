package com.cgi.soa.masterclass.clickpay.model;

import java.io.Serializable;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cgi.soa.masterclass.clickpay.faces.User;



/**
 * Entity implementation class for Entity: Transaction
 *
 */
@Entity
@Table
public class TransactionEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private User sender;
	
	@Column
	private User recipient;
	
	@Column
	private Date transdate;
	
	@Column
	private String purpose;
	
	@Column
	private float amount;
	
	private static final long serialVersionUID = 1L;

	public TransactionEntity() {
	}   
	
	public TransactionEntity(User sender, User recipient,
			Date transdate, String purpose, float amount) {
		super();
		this.sender = sender;
		this.recipient = recipient;
		this.transdate = transdate;
		this.purpose = purpose;
		this.amount = amount;
	}

	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public User getSender() {
		return this.sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}   
	public User getRecipient() {
		return this.recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}   
	public Date getTransdate() {
		return this.transdate;
	}

	public void setTransdate(Date transdate) {
		this.transdate = transdate;
	}   
	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}   
	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
   
}
