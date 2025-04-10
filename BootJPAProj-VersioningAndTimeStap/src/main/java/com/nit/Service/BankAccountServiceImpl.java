package com.nit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Entity.BankAccount;
import com.nit.Repository.IBankRepository;

@Service("bank_service")
public class BankAccountServiceImpl implements IBankAccountService {

	@Autowired
	private IBankRepository bankRepo;
	@Override
	public String openAccountInBank(BankAccount account) {
		Long accNo = bankRepo.save(account).getAccNo();
		return "Account Created with account no : "+accNo;
	}
	

@Override
public String withdrawAmount(Long accNo,Double amt) {
	BankAccount account=bankRepo.findById(accNo).orElseThrow(()->new IllegalArgumentException("No Account Fount with this Account number"));
	account.setAmount(account.getAmount()-amt);
	bankRepo.save(account);
	return "Money withdrwan";	
}

@Override
public BankAccount showBankAccount(Long accNo) {
	
	return bankRepo.findById(accNo).orElseThrow(()->new IllegalArgumentException("No Account Fount with this Account number"));
}
}
