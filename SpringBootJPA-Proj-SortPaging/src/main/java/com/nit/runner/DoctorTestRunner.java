package com.nit.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
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

		/*try {
				
				Iterable<Doctor> allDoctorInOrder = docService.showAllDoctorInOrder(true, "docName");
				allDoctorInOrder.forEach(System.out::println);
				System.out.println("--------------------------");
				Iterable<Doctor> doctorsInOrder = docService.showAllDoctorInOrder(false, "docId","DocName");
				doctorsInOrder.forEach(System.out::println);
		
		   }
			catch(Exception e)
			{
				e.printStackTrace();
			}*/
    System.out.println("-------------------------------------------------------------------------");
    try {
		/*Iterable<Doctor> bypage = docService.showAllDoctorPageBypage(3, 3);
		bypage.forEach(System.out::println);*/
    	
    	//docService.showAllDoctorPageBypageInOrder(2, 2, false, "docName","docId").forEach(System.out::println);
		 
    	Page<Doctor> bypageInOrder = docService.showDoctorBypageInOrder(4, 2, false, "docName","docId");
		  
    	System.out.println("Total Page Count :"+bypageInOrder.getTotalPages());
    	System.out.println("Page Number :"+bypageInOrder.getNumber());
    	System.out.println("Page Element :"+bypageInOrder.getNumberOfElements());
    	System.out.println("Page Size :"+bypageInOrder.getSize());
    	System.out.println("Total Element :"+bypageInOrder.getTotalElements());
    	System.out.println("Page is First Page :"+bypageInOrder.isFirst());
    	System.out.println("Page is Last Page :"+bypageInOrder.isLast());
    	System.out.println("Page is Empty Page :"+bypageInOrder.isEmpty());
    	
    	if(!bypageInOrder.isEmpty())
    	{
    		bypageInOrder.getContent().forEach(System.out::println);;
    	}
    	else 
    	{
    		System.out.println("No Record found ");
    	}
    	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
