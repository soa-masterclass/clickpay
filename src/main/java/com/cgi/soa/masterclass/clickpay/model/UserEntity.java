package com.cgi.soa.masterclass.clickpay.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: UserEntity
 *
 */
@Entity

public class UserEntity implements Serializable {

	   
	@Id
	private int Id;
	
	@Column(unique=true)
	private int email;
	
	private String firstname;
	
	private String lastname;
	
	private int accnumber;
	
	private String acc_firstname;
	
	private String acc_lastname;
	
	private float balance;
	
	private static final long serialVersionUID = 1L;

	public UserEntity() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public int getEmail() {
		return this.email;
	}

	public void setEmail(int email) {
		this.email = email;
	}   
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}   
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}   
	public int getAccnumber() {
		return this.accnumber;
	}

	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}   
	public String getAcc_firstname() {
		return this.acc_firstname;
	}

	public void setAcc_firstname(String acc_firstname) {
		this.acc_firstname = acc_firstname;
	}   
	public String getAcc_lastname() {
		return this.acc_lastname;
	}

	public void setAcc_lastname(String acc_lastname) {
		this.acc_lastname = acc_lastname;
	}   
	public float getBalance() {
		return this.balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
   
}
