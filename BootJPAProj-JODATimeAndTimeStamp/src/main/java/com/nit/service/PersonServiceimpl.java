package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.PersonInfo;
import com.nit.repository.IPersonInformation;

@Service
public class PersonServiceimpl implements IPersonService {
	
	@Autowired
	private IPersonInformation personRepo;

	@Override
	public String registerPerson(PersonInfo personInfo) {
		Integer id = personRepo.save(personInfo).getPsId();
		return "Person registered with ID "+id;
	}
	
	@Override
	public List<PersonInfo> fetchAllPerson() {
		return personRepo.findAll();
	}

@Override
	public String getAgeOfPersion(Integer id) {
	Optional<PersonInfo> person = personRepo.findById(id);
	Integer age = personRepo.getAge(id);
		return person.get().getPsName()+" age is : "+age;
	}
}
