package com.nit.Service;

import com.nit.Entity.BankAccount;

public interface IBankAccountService {

	public String openAccountInBank(BankAccount account);
	public String withdrawAmount(Long accNo, Double amt);
	public BankAccount showBankAccount(Long accNo);
}
