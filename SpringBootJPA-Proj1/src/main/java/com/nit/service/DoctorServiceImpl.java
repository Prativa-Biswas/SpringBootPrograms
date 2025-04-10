package com.nit.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.DAO.IDoctorRepo;
import com.nit.entity.Doctor;



@Service("docService")
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepo docRepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		Doctor doc = docRepo.save(doctor);
		
		return "Doctor is Registered with id "+doc.getDocId();
	}
	
	@Override
	public boolean isDoctorAvailable(Integer id)
	{
		
		return docRepo.existsById(id);
	}

	@Override
	public long totalNoOfDoctorAvailable() {
		return docRepo.count();
	}

	@Override
	public String registerListOfDoctor(List<Doctor> list) {
                  List<Doctor> saveList = (List<Doctor>) docRepo.saveAll(list);
                  List<Integer> listOfIds = saveList.stream().map(art->art.getDocId()).collect(Collectors.toList());
		return listOfIds.size()+" Doctor registerd in the Hostpial with ids "+listOfIds;
	}
	
	@Override
	public Iterable<Doctor> fetchAllDoctorDeatils() {
                Iterable<Doctor> allDoctors = docRepo.findAll();
		return allDoctors;
	}

	@Override
	public Optional<Doctor> fetchDoctorById(Integer id) {
		
		return docRepo.findById(id);
	}
	
	@Override
	public List<Doctor> fetchAllDoctorById(List<Integer> ids) {
		
		List<Doctor> allById = (List<Doctor>)docRepo.findAllById(ids);
		
		return allById;
	}
	@Override
	public Iterable<Doctor> fetchAllDoctorById(Iterable<Integer> ids) {
		
		return docRepo.findAllById(ids);
	}
	
	@Override
	public String registerdOrUpdateDoctor(Doctor doctor) {
		/*Doctor save = docRepo.save(doctor);
		if(docRepo.existsById(doctor.getDocId()))
		   return doctor.getDocName()+" Doctor details updated ";
		else
		   return doctor.getDocName()+" Doctor details saved with id "+save.getDocId();
		*/
   
		if(docRepo.existsById(doctor.getDocId()))
		{
			Doctor save = docRepo.save(doctor);
			return save.getDocName()+" doctor details updated";
		}
		else
		{
			doctor.setDocId(null);
			Doctor save = docRepo.save(doctor);
			return save.getDocName()+" doctor details registed with id "+save.getDocId();
		}
	}
	
@Override
	public String updateDoctor(Doctor doctor) {
     Optional<Doctor> Id = docRepo.findById(doctor.getDocId());
     if(Id.isPresent())
     {
    	 docRepo.save(doctor);
    	 return doctor.getDocName()+" details Updated ";
     }
     else
	    return "No doctor found for the updation";
	}

 @Override
 public String deleteDoctorById(Integer id) {
	Optional<Doctor> opt = docRepo.findById(id);
	if(opt.isPresent())
	{
		docRepo.deleteById(id);
		return "Doctor recod is deleted with id "+id;
	}
	return "No Doctor found with the id "+id;
 }
 @Override
public String deleteDoctor(Doctor doctor) {
	 Optional<Doctor> opt = docRepo.findById(doctor.getDocId());
	 if(opt.isEmpty()) {
		 return "Doctor is not available for deletion";
	 }
	 else {
		 docRepo.delete(doctor);
	return opt.get().getDocName()+" Doctor details is deleted";
	}
}
 
 @Override
public String deleteAllDoctorByIds(Iterable<Integer> ids) {
	 
	 List<Doctor> allById =(List<Doctor>)docRepo.findAllById(ids);
	 long count = allById.stream().count();
	 docRepo.deleteAllById(ids);
	return count+" number of Doctor details deleted";
}
 
 @Override
public String deleteAllDoctor(Iterable<Doctor> doctors) {
	 List<Doctor> list=(List<Doctor>) doctors;
	 List<Integer> ids = list.stream().map(doc->doc.getDocId()).toList();
	 List<Doctor> allById = (List<Doctor>)docRepo.findAllById(ids);
	 docRepo.deleteAll(doctors);
	 return allById.stream().count()+" number of Doctor record deleted";
}
 @Override
public String deleteDoctors() {
	 if(docRepo.count()>0) {
	 docRepo.deleteAll();
	return "All Doctors Details are deleted";}
	 else
		 return "No Record is avilable for deletion";
}
}
