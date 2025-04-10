package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nit.DAO.IDoctorRepo;
import com.nit.entity.Doctor;



@Service("docService")
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepo docRepo;
	
	@Override
	public Iterable<Doctor> showAllDoctorInOrder(boolean asc, String propetry) {
         // Sort sort=Sort.by(Direction.DESC, propetry); // only provide ascending sorting order
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, propetry);  
		Iterable<Doctor> allDoctors = docRepo.findAll(sort);
		
		return allDoctors;
	}
	
@Override
	public Iterable<Doctor> showAllDoctorInOrder(boolean asc, String... propetry) {
		Sort sort= Sort.by(asc?Direction.ASC:Direction.DESC, propetry);
		Iterable<Doctor> all = docRepo.findAll(sort);
		
		return all;
	}

@Override
public Iterable<Doctor> showAllDoctorPageBypage(int pageNo, int pageSize) {
   
	Pageable pageable=PageRequest.of(pageNo,pageSize);
	Page<Doctor> page = docRepo.findAll(pageable);
	return page;
}

@Override
public Iterable<Doctor> showAllDoctorPageBypageInOrder(int pageNo, int pageSize, boolean order, String... prop) {
   Sort sort=Sort.by(order?Direction.ASC:Direction.DESC, prop);
   Pageable pageable=PageRequest.of(pageNo, pageSize, sort);       
    Page<Doctor> page = docRepo.findAll(pageable);
	return page;
}

@Override
public Page<Doctor> showDoctorBypageInOrder(int pageNo, int pageSize, boolean order, String... prop) {
	Pageable pageable = PageRequest.of(pageNo, pageSize, order?Direction.ASC:Direction.DESC, prop);	
	Page<Doctor> page = docRepo.findAll(pageable);
	return page;
}
}
