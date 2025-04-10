package com.nit.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nit.Entity.Doctor;
import com.nit.Repository.IDocRepository;

@Service("docService")
public class DoctorServiceImplementation implements IDocService {

	@Autowired
	private IDocRepository doctorRepo;
	
	@Override
	public String deleteAllDoctorByIdsInBatch(List<Integer> ids) {
		
		long count = doctorRepo.findAllById(ids).stream().map(doc->doc.getDocId()).count();
		doctorRepo.deleteAllByIdInBatch(ids);

	return count+" Number of Doctor details deleted from the register";	
	}
	
	@Override
	public String deleteAllDoctorInBtach(List<Doctor> doctors) {
		long count = doctorRepo.findAllById(doctors.stream().map(doc->doc.getDocId()).collect(Collectors.toList())).stream().count();
		doctorRepo.deleteAllInBatch(doctors);
		return count>0? count+" Number of Doctor record deleted":"No Doctor record found for deletion";
	}
	
	@Override
	public String removeAllDoctor() {
		long count = doctorRepo.count();
		doctorRepo.deleteAllInBatch();
		if(count>0)
		    return count+" Number of Doctor details removed";
		else
			return "No record found for deletion";
	}
	
@SuppressWarnings("unchecked")
@Override
public List<Doctor> showDoctorExampleDta(Doctor doctor) {
	Example eObj=Example.of(doctor);
	return doctorRepo.findAll(eObj);
}

@Override
	public List<Doctor> showDoctorExampleDtaInOrder(Doctor doctor, boolean asc, String... prop) {

	Example eObj=Example.of(doctor);
	List all = doctorRepo.findAll(eObj, Sort.by(asc? Direction.ASC:Direction.DESC, prop)); // internally generate query with and and condition
	return all;
	}

@Override
public Doctor showDoctorById(Integer id) {
	
	Doctor doctorById = doctorRepo.getReferenceById(id);
	return doctorById;
}

@Override
public String registerDoctorAndSaveChanges(Doctor doc) {
	doctorRepo.saveAndFlush(doc);
	return "Doctor "+doc.getDocName()+" get Registered with ID "+doc.getDocId();
}

@Override
public String registerAllDoctorAndSaveChanges(List<Doctor> list) {
	List<Doctor> flush = doctorRepo.saveAllAndFlush(list);
	long count = flush.stream().count();
	return count+" Number of Doctor got registered";
}
}
