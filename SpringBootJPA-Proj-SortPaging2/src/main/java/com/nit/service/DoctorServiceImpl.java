package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nit.DAO.IDoctorRepo;
import com.nit.entity.Doctor;



@Service("docService")
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepo docRepo;
	
@Override
	public void showDoctorByPagination(int pageSize) {
	long count = docRepo.count();  
	long pageCount=count/pageSize;
	if(count%pageCount!=0)
		pageCount++;
	
	for(int i=0;i<pageCount;i++)
	{
		Pageable pageable=PageRequest.of(i,pageSize);
		Page<Doctor> page = docRepo.findAll(pageable);
		System.out.println("----------------------"+(page.getNumber()+1)+"/"+page.getTotalPages()+"----------------------");
		page.getContent().stream().sorted((s1,s2)->s1.getDocId().compareTo(s2.getDocId())).forEach(System.out::println);
		System.out.println();
		
	}
	}
}
