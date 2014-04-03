package com.cgi.soa.masterclass.clickpay.faces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.cgi.soa.masterclass.clickpay.model.UserEntity;
import com.cgi.soa.masterclass.clickpay.service.UserBeanLocal;

@Named
@RequestScoped
public class UserController implements Serializable {

	private static final long serialVersionUID = -9137530186564436028L;

	private User user;
	
	private List<User> allUsers = new ArrayList<User>();

	@Inject
	private UserBeanLocal userBean;
	
	
	public String createUser() {
		
		
		UserEntity userEntity = new UserEntity(user.getEmail(),
				user.getFirstName(), user.getLastName(), Integer.parseInt(user
						.getAccnumber()), user.getAccountFirstName(),
				user.getAccountLastName());

		userBean.createUser(userEntity);
		return "/users/index.html?faces-redirect=true";

	}

	public List<User> getAllUsers() {

		allUsers.clear();
		for (UserEntity entity : userBean.showAllUsers()) {
			allUsers.add(new User(entity.getFirstname(), entity.getLastname(),
					String.valueOf(entity.getAccnumber()), entity
							.getAcc_firstname(), entity.getAcc_lastname(),
					entity.getEmail()));
		}
		return allUsers;
	}

	public User getUser() {
		if (user == null) {
			user = new User();
		}
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
