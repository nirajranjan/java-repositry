package com.basic.nrjbank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class HibernateAccountDao implements AccountDao{

	@Autowired
	private HibernateTemplate temp;
	
	
	public double getBal(int accno) {
		return 0;
	}

	
	public void fundTransfer(int saccno, int daccno, double amt) {
		
	}

}
