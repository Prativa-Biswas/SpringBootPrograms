package com.nit.Runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.Entity.Doctor;
import com.nit.Service.IDocService;

@Component
public class DoctorImplmentedRunners implements CommandLineRunner {

	@Autowired
	private IDocService doctorService;
	@Override
	public void run(String... args) throws Exception {
		
		/*try {
			// System.out.println(doctorService.deleteAllDoctorByIdsInBatch(List.of(1,23,499,null,678,214)));
			//null not acceptable
			 System.out.println(doctorService.deleteAllDoctorByIdsInBatch(List.of(1,23,499,678,214)));
			 System.out.println(doctorService.deleteAllDoctorByIdsInBatch(Arrays.asList(100,89,23,600)));
		
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
	/*	try {
			String msg = doctorService.deleteAllDoctorInBtach(Arrays.asList(new Doctor(12,"Prativa","cardio",90000.0),new Doctor(790,"Praveen","cardio",90000.0),new Doctor(120,"Ankita","cardio",90000.0)));
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
	/*try {
	     
	     System.out.println(doctorService.removeAllDoctor());
			
			}catch(Exception e) {
			e.printStackTrace();
			}
	
	*/
		
		/*try {
			Doctor doc= new Doctor();
			doc.setIncome(7800000.0); doc.setSpecialization("Surgen");
			List<Doctor> list = doctorService.showDoctorExampleDtaInOrder(doc, true, "docId");
			list.forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
		Doctor doc= new Doctor();
		doc.setIncome(9000000.0); doc.setSpecialization("Surgen");
		List<Doctor> list = doctorService.showDoctorExampleDta(doc);
		list.forEach(System.out::println);
		}catch(Exception e) {
		e.printStackTrace();
		}*/
		
	/*	try {
			Doctor doctor = doctorService.showDoctorById(12);
			System.out.println(doctor);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}*/
		
		try {
	     Doctor doc= new Doctor("Rutika","ENT",760000.0);
	     System.out.println(doctorService.registerDoctorAndSaveChanges(doc));
			
			}catch(Exception e) {
			e.printStackTrace();
			}
	
		
	try {
	     Doctor doc1= new Doctor("Jessika","Cardio",760000.0);
	     Doctor doc2= new Doctor("Maya","Gynac",560000.0);
	     Doctor doc3= new Doctor("Mayank","Pshycologist",890000.0);
	     Doctor doc4= new Doctor("Rubi","Pedriatition",860000.0);
	     System.out.println(doctorService.registerAllDoctorAndSaveChanges(Arrays.asList(doc1,doc2,doc3,doc4)));
		
		}catch(Exception e) {
		e.printStackTrace();
		}

	}

}
