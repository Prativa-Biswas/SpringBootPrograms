package com.nit.service;

import java.util.List;

import com.nit.entity.PersonInfo;

public interface IPersonService {
	
	public String registerPerson(PersonInfo personInfo);
	public List<PersonInfo> fetchAllPerson();
	public String getAgeOfPersion(Integer id);

}
