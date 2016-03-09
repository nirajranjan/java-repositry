package com.basic.nrjbank.dao;

public interface AccountDao {
	public double getBal(int accno);
	public void fundTransfer(int saccno, int daccno, double amt); 
}
