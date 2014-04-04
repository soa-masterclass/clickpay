package com.cgi.soa.masterclass.clickpay.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cgi.soa.masterclass.clickpay.faces.User;



/**
 * Entity implementation class for Entity: Transaction
 *
 */
@Entity
@Table
public class TransactionEntity implements Serializable {

	@OneToOne
	private FeeEntity fee;
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private UserEntity sender;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private UserEntity recipient;
	
	@Column
	private Date transdate;
	
	@Column
	private String purpose;
	
	@Column
	private float amount;
	
	private static final long serialVersionUID = 1L;

	public TransactionEntity() {
	}   
	
	public TransactionEntity(UserEntity sender, UserEntity recipient,
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
	public UserEntity getSender() {
		return this.sender;
	}

	public void setSender(UserEntity sender) {
		this.sender = sender;
	}   
	public UserEntity getRecipient() {
		return this.recipient;
	}

	public void setRecipient(UserEntity recipient) {
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
