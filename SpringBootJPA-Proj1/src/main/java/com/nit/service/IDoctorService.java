package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.Doctor;

public interface IDoctorService {
	public String registerDoctor(Doctor doctor);
	public String registerListOfDoctor(List<Doctor> list);
	
	public boolean isDoctorAvailable(Integer id);
	public Optional<Doctor>  fetchDoctorById(Integer id);
	public List<Doctor> fetchAllDoctorById(List<Integer> ids);
	public Iterable<Doctor> fetchAllDoctorById(Iterable<Integer> ids);
	public Iterable<Doctor> fetchAllDoctorDeatils();
	public long  totalNoOfDoctorAvailable();
	
	public String registerdOrUpdateDoctor(Doctor doctor);
	public String updateDoctor(Doctor doctor);
	
	public String deleteDoctorById(Integer id);
	public String deleteDoctor(Doctor doctor);
	public String deleteAllDoctorByIds(Iterable<Integer> ids);
	public String deleteAllDoctor(Iterable<Doctor> doctors);
	public String deleteDoctors();

}
