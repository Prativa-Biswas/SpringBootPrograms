package com.nit.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.Entity.BankAccount;
import com.nit.Service.BankAccountServiceImpl;
import com.nit.Service.IBankAccountService;

@Component
public class VersoninAndTimeStampingRunners implements CommandLineRunner {

	@Autowired
	private IBankAccountService bankService;
	@Override
	public void run(String... args) throws Exception {
		/*
		try {
			
			String msg = bankService.openAccountInBank(new BankAccount("Ankita",70000.0));
			System.out.println(msg);
		}
		catch(Exception e) 
		{
		   e.printStackTrace();
		}*/
		

		try {
			
			String string = bankService.withdrawAmount(11000000l,5000.0);
			System.out.println(string);
			BankAccount account = bankService.showBankAccount(11000000l);
			System.out.println(account.getAccNo()+" Account Created on "+account.getCreationDate()+"...Account Upadated..."+
			                     account.getUpdatedCount()+" times and Lastly updated on..."+account.getLastlyUpdatedOn());
		}
        catch(Exception e) 
		{
    	   e.printStackTrace();
		}
	}

}
