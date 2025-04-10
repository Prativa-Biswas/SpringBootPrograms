package com.nit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Doctor;
import com.nit.service.IDoctorService;

@Component
public class DoctorImplemetionRunner implements CommandLineRunner {
	
	@Autowired
	private IDoctorService docService;

	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			Iterable<Doctor> allDoctorInOrder = docService.showAllDoctorInOrder(true, "docName");
			allDoctorInOrder.forEach(System.out::println);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
