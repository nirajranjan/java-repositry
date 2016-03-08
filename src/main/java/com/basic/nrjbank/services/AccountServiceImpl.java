package com.basic.nrjbank.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.basic.nrjbank.dao.AccountDao;

@Transactional
public class AccountServiceImpl implements AccountService{
	
	@Transactional
	public double getBal(int accno) {
		return adao.getBal(accno);
	}

	@Autowired
	AccountDao adao;
	@Transactional
	public void fundsTransfer(int saccno, int daccno, double amt) {
		adao.fundTransfer(saccno,daccno,amt);
	}

}
