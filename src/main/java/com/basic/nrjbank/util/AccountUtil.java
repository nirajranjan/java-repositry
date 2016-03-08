package com.basic.nrjbank.util;

import com.basic.nrjbank.hibernate.Account;
import com.basic.nrjbank.to.AccountTo;

public class AccountUtil {
	public static Account getAccountFromAccountTo(AccountTo acto) {
		Account ac = new Account();
		ac.setAccno(acto.getAccno());
		ac.setAtype(acto.getAtype());
		ac.setBal(acto.getBal());
		return ac;
	}

	public static AccountTo getAccountToFromAccount(Account ac) {
		AccountTo acto = new AccountTo();
		acto.setAccno(ac.getAccno());
		acto.setAtype(ac.getAtype());
		acto.setBal(ac.getBal());
		return acto;

	}
}
