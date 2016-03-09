package com.basic.nrjbank.services;

import com.basic.nrjbank.to.CustomerTo;

public interface CustomerService {
	public CustomerTo getCustomerByCid(int cid);
	public void updateCustomer(CustomerTo cto);
	public CustomerTo verifyCustomer(String un,String pw);
}
