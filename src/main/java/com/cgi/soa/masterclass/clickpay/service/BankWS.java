package com.cgi.soa.masterclass.clickpay.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import com.cgi.soa.masterclass.clickpay.samplebank.ws.BankWeb;
import com.cgi.soa.masterclass.clickpay.samplebank.ws.BankWebService;

/**
 * Session Bean implementation class BankWS
 */
@Stateless
@LocalBean
public class BankWS implements BankWSLocal {

	@WebServiceRef
	BankWebService service;
	

    /**
     * Default constructor. 
     */
    public BankWS() {
        // TODO Auto-generated constructor stub
    }


	@Override
	public BankWeb getWebService(){
		return service.getBankWebPort();
	}

}


