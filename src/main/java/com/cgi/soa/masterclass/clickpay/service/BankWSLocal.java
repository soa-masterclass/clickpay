package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.Local;

import com.cgi.soa.masterclass.clickpay.samplebank.ws.BankWeb;

@Local
public interface BankWSLocal {

	public BankWeb getWebService();
	
}
