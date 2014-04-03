package com.cgi.soa.masterclass.clickpay.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: UserEntity
 *
 */
@Entity
@Table
public class UserEntity implements Serializable {

	   
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(unique=true)
	private String email;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private int accnumber;
	
	@Column
	private String acc_firstname;
	
	@Column
	private String acc_lastname;
	
	@Column
	private float balance;
	
	private static final long serialVersionUID = 1L;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserEntity() {
		
	}
	public UserEntity(String email, String firstname, String lastname,
			int accnumber, String acc_firstname, String acc_lastname) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.accnumber = accnumber;
		this.acc_firstname = acc_firstname;
		this.acc_lastname = acc_lastname;
		this.balance = 0;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(int accnumber) {
		this.accnumber = accnumber;
	}

	public String getAcc_firstname() {
		return acc_firstname;
	}

	public void setAcc_firstname(String acc_firstname) {
		this.acc_firstname = acc_firstname;
	}

	public String getAcc_lastname() {
		return acc_lastname;
	}

	public void setAcc_lastname(String acc_lastname) {
		this.acc_lastname = acc_lastname;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

   
}
