package com.nit.Service;

import java.util.List;

import com.nit.Entity.Doctor;

public interface IDocService {
	
	public String deleteAllDoctorByIdsInBatch(List<Integer> ids); // parameter type Iterable<T>
	public String deleteAllDoctorInBtach(List<Doctor> doctors);  // parameter type Iterable<T>
	public String removeAllDoctor();
	
	public List<Doctor> showDoctorExampleDta(Doctor doctor);
	public List<Doctor> showDoctorExampleDtaInOrder(Doctor doctor,boolean asc,String ...prop);
	public Doctor showDoctorById(Integer id);
	
	public String registerDoctorAndSaveChanges(Doctor doc);//parameter type Iterable<T>
	public String registerAllDoctorAndSaveChanges(List<Doctor> list);//parameter type Iterable<T>

}
