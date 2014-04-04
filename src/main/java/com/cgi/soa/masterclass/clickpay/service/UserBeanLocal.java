package com.cgi.soa.masterclass.clickpay.service;

import java.util.List;

import javax.ejb.Local;

import com.cgi.soa.masterclass.clickpay.model.UserEntity;

@Local
public interface UserBeanLocal {
	
	public int createUser(UserEntity user);
	
	public UserEntity findUserById(Integer valueOf);
	
	public List<UserEntity> showAllUsers();

}
