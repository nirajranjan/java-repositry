package com.basic.nrjbank.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.basic.nrjbank.dao.CustomerDao;
import com.basic.nrjbank.to.CustomerTo;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao cdao;
	@Transactional
	public CustomerTo getCustomerByCid(int cid) {
		return cdao.getCustomerByCid(cid);
	}

	@Transactional
	public void updateCustomer(CustomerTo cto) {
		cdao.updateCustomer(cto);
		
	}

	@Transactional
	public CustomerTo verifyCustomer(String un, String pw) {
		return cdao.verifyCustomer(un,pw);
	}

}
