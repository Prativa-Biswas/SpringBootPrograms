package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nit.Repository.IDocRepository;
import com.nit.entity.Doctor;

@Service("docService")
public class DoctorServiceImplentaion implements IDoctorService {
	
	@Autowired
	private IDocRepository docRepo;
	
	@Override
	public Iterable<Doctor> showAllDoctorInOrder(boolean asc, String propetry) {
          Sort sort=Sort.by(Direction.ASC, propetry);
          Iterable<Doctor> allDoctors = docRepo.findAll(sort);
		
		return allDoctors;
	}

}
