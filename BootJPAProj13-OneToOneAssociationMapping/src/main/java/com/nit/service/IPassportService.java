package com.nit.service;

import java.util.List;

import com.nit.entity.Passport;
import com.nit.entity.Person;

public interface IPassportService {

	public String loadPersonPassprtDetails(String pName,String pAddress,String passportNumber,String issued_Country);
	public String loadAllPersonPassportDetails();
}
