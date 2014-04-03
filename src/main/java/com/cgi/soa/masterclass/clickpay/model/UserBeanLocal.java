package com.cgi.soa.masterclass.clickpay.model;

import javax.ejb.Local;

@Local
public interface UserBeanLocal {
	
	public void createUser(String firstname, String lastName, String email, String accountNumber, String accountFirstName, String accountLastName);
	
	
	
	public void showAllUsers();

}
