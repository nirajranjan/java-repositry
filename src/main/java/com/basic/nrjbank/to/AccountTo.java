package com.basic.nrjbank.to;

import java.io.Serializable;

public class AccountTo implements Serializable{
	private static final long serialVersionUID = 319524648463496569L;
	private int accno;
	private String atype;
	private double bal;
	
	public AccountTo() {
	}

	public AccountTo(String atype, double bal) {
		super();
		this.atype = atype;
		this.bal = bal;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "AccountTo [accno=" + accno + ", atype=" + atype + ", bal=" + bal + "]";
	}
	
}
