package com.cgi.soa.masterclass.clickpay.faces;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User implements Serializable {

	private static final long serialVersionUID = 3943840197882902274L;
	private String firstName;
	private String lastName;
	private String accnumber;
	private String accountFirstName;
	private String accountLastName;
//	private float balance;
	private String email;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User() {
		//
	}

	public User(String firstName, String lastName, String accnumber,
			String accountFirstName, String accountLastName, String email, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accnumber = accnumber;
		this.accountFirstName = accountFirstName;
		this.accountLastName = accountLastName;
		this.email = email;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAccnumber() {
		return accnumber;
	}

	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}

	public String getAccountFirstName() {
		return accountFirstName;
	}

	public void setAccountFirstName(String accountFirstName) {
		this.accountFirstName = accountFirstName;
	}

	public String getAccountLastName() {
		return accountLastName;
	}

	public void setAccountLastName(String accountLastName) {
		this.accountLastName = accountLastName;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		this.firstName = name;
	}

}