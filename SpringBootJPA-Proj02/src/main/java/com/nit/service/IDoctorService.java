package com.nit.service;

import com.nit.entity.Doctor;

public interface IDoctorService {
	
	public Iterable<Doctor> showAllDoctorInOrder(boolean asc,String propetry );

}
