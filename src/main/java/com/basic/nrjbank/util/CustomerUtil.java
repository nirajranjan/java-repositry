package com.basic.nrjbank.util;

import com.basic.nrjbank.hibernate.Customer;
import com.basic.nrjbank.to.CustomerTo;

public class CustomerUtil {
	public static Customer getCustomerFromCustomerTo(CustomerTo cto) {
		Customer cu = new Customer();
		cu.setCid(cto.getCid());
		cu.setCity(cto.getCity());
		cu.setCname(cto.getCname());
		cu.setEmail(cto.getEmail());
		cu.setPassword(cto.getPassword());
		cu.setPhone(cto.getPhone());
		cu.setUsername(cto.getUsername());
		if (cto.getAccountTo() != null)
			cu.setAccount(AccountUtil.getAccountFromAccountTo(cto.getAccountTo()));

		return cu;
	}

	public static CustomerTo getCustomerToFromCustomer(Customer cu) {
		CustomerTo cto = new CustomerTo();
		cto.setCid(cu.getCid());
		cto.setCity(cu.getCity());
		cto.setCname(cu.getCname());
		cto.setEmail(cu.getEmail());
		cto.setPassword(cu.getPassword());
		cto.setPhone(cu.getPhone());
		cto.setUsername(cu.getUsername());
		if (cu.getAccount() != null)
			cto.setAccountTo(AccountUtil.getAccountToFromAccount(cu.getAccount()));
		return cto;

	}
}
