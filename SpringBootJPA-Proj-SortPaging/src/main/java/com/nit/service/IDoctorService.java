package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.nit.entity.Doctor;

public interface IDoctorService {
	
	public Iterable<Doctor> showAllDoctorInOrder(boolean asc,String propetry );
	public Iterable<Doctor> showAllDoctorInOrder(boolean asc,String ...propetry );
	
	public Iterable<Doctor> showAllDoctorPageBypage(int pageNo,int pageSize);
	public Iterable<Doctor> showAllDoctorPageBypageInOrder(int pageNo,int pageSize,boolean order,String ...prop);

	public Page<Doctor> showDoctorBypageInOrder(int pageNo,int pageSize,boolean order,String ...prop);



}
