package com.cgi.soa.masterclass.clickpay.faces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Transaction implements Serializable {

	private static final long serialVersionUID = 3943840197882902274L;
	private String amount;
	private String id;
	private String purpose;
	private String recipient;
	private String sender;
	private String transdate;
//	private float balance;
	
	public Transaction() {
		//
	}

	public Transaction(String amount, String id, String purpose, String recipient, String sender, String transdate ) {
		super();
		this.amount = amount;
		this.setId(id);
		this.purpose = purpose;
		this.recipient = recipient;
		this.sender = sender;
		this.transdate = transdate;

	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String Amount) {
		this.amount = Amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getTransdate() {
		return transdate;
	}

	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}



}