package com.cgi.soa.masterclass.clickpay.faces;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;

import com.cgi.soa.masterclass.clickpay.service.UserBean;

public class UserConverter implements Converter {

	@Inject
	UserBean userEJB;

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		return userEJB.findUserById(Integer.valueOf(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		return String.valueOf(((User)arg2).getId());
	}
}
