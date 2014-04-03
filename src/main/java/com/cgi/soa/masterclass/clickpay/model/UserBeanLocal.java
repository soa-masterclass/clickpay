package com.cgi.soa.masterclass.clickpay.model;

import javax.ejb.Local;

@Local
public interface UserBeanLocal {
	
	public void createUser(UserEntity user);
	
	
	
	public void showAllUsers();

}
