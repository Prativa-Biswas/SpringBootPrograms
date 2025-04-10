package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.nit.entity.Doctor;

public interface IDoctorService {
	
	public void showDoctorByPagination(int pageSize);


}
