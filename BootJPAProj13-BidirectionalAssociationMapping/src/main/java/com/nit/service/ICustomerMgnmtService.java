package com.nit.service;

import java.util.List;

public interface ICustomerMgnmtService {
	
	public String saveDataUsingParentToChild();
	public String saveDataUsingChild();
	
	public void loadDataUsingParent();
	public void loadDataUsingChild();

	public String deleteDataUsingParent(Integer cust_id );
	public String deleteAllPhoneNumbersOfCustomer(Integer cust_id);
	public String addNewPhonesnumberToExstingCustomer();
	public String deleteDataUsingChild();
	
	public List<Object[]> showAllDataUsingJoin();
}
