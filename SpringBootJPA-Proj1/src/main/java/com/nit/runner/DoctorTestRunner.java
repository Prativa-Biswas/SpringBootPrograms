package com.nit.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Doctor;
import com.nit.service.DoctorServiceImpl;
import com.nit.service.IDoctorService;

@Component
public class DoctorTestRunner implements CommandLineRunner {

    private final DoctorServiceImpl docService_1;

	@Autowired
	private IDoctorService docService;

    DoctorTestRunner(DoctorServiceImpl docService_1) {
        this.docService_1 = docService_1;
    }
	
	@Override
	public void run(String... args) throws Exception {

		
		try {
			/*
			 * Doctor doctor = new Doctor(); doctor.setDocName("Praveen");
			 * doctor.setSpecialization("Psychologist");doctor.setIncome(7800000.0); String
			 * registerDoctor = docService.registerDoctor(doctor);
			 * System.out.println(registerDoctor);
			 */
			
			/*
			 * Doctor doc1= new Doctor("Smith","Surgen",700000.0); Doctor doc2= new
			 * Doctor("Scott","Arthodox",870000.0); Doctor doc3= new
			 * Doctor("Jessika","Gynac",650000.0); Doctor doc4= new
			 * Doctor("Allen","Neurology",900000.0); Doctor doc5= new
			 * Doctor("Jhon","Cosmetic Surgen",7800000.0);
			 * 
			 * String msg =
			 * docService.registerListOfDoctor(List.of(doc1,doc2,doc3,doc4,doc5));
			 * System.out.println(msg);
			 */
			
				/*
				 * Integer id=152; boolean doctorAvailable = docService.isDoctorAvailable(id);
				 * if(doctorAvailable) System.out.println("Doctor is vailable with id "+id);
				 * else System.out.println("There is no Doctor available with id "+id);
				 * 
				 * long totalNoOfDoctorAvailable = docService.totalNoOfDoctorAvailable();
				 * System.out.println("Total number of Doctor available in hospital "
				 * +totalNoOfDoctorAvailable);
				 */
			 
				/*
				 * Iterable<Doctor> fetchAllDoctorDeatils = docService.fetchAllDoctorDeatils();
				 * fetchAllDoctorDeatils.forEach(System.out::println);
				 * System.out.println("------------------------------------------");
				 * List<Doctor> listOfAllDoctors= (List<Doctor>) fetchAllDoctorDeatils;
				 * listOfAllDoctors.stream().sorted((v1,v2)->v2.getDocId().compareTo(v1.getDocId
				 * ())) .forEach(System.out::println);
				 */
			
				
				/*
				 * Optional<Doctor> fetchDoctorById = docService.fetchDoctorById(152);
				 * fetchDoctorById.ifPresent(System.out::println);
				 * 
				 * Doctor orElseThrow = docService.fetchDoctorById(100).orElseThrow(()->new
				 * IllegalArgumentException("No Doctor available with this id"));
				 * System.out.println(orElseThrow);
				 */
				/*
				 * docService.fetchAllDoctorById(List.of(1,2,3,4,5,100,152,252,253))
				 * .forEach(System.out::println); System.out.println(
				 * "----------------------------------------------------------");
				 * docService.fetchAllDoctorById(Arrays.asList(254,256,102,300,null)).forEach(
				 * System.out::println);
				 */
				/*String msg = docService.registerdOrUpdateDoctor(new Doctor(201,"Mohan","Medicine",550000.0));
				System.out.println(msg);*/
			
				/*String msg = docService.updateDoctor( new Doctor(900,"Praveen","Pshycologist",900000.0));
				System.out.println(msg);*/
			
				/*String msg = docService.deleteDoctorById(10);
				System.out.println(msg);*/
			
				/*String msg = docService.deleteDoctor(new Doctor(352,"Jaagu","Medicine",	450000.0));
				System.out.println(msg);*/
			
				/*String msg = docService.deleteAllDoctorByIds(Arrays.asList(1,2,400,252,254,202));
				System.out.println(msg);*/
				/*Doctor doc1 = new Doctor(52,"Dipesh","Psychologist",900000.0);
				Doctor doc2 = new Doctor(152,"Dipesh","Psychologist",900000.0);
				Doctor doc3 = new Doctor(520,"Dipesh","Psychologist",900000.0);
				Doctor doc4 = new Doctor(560,"Dipesh","Psychologist",900000.0);
				String msg = docService.deleteAllDoctor(Arrays.asList(doc1,doc2,doc3,doc4));
				System.out.println(msg);*/
			
			String msg = docService.deleteDoctors();
			System.out.println(msg);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
