package com.nit.Runners;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.Repository.IEmployeeRepository;

@Component
public class EmployeeRunnerImpl implements CommandLineRunner {
	
	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public void run(String... args) throws Exception {
		
		try {
			/*int noOfEmp = empRepo.hikeEmployeeSalary("ANALYST", 45.0);
			System.out.println("Total "+noOfEmp+" number of employee salary got hiked ");*/
			
			int noOfEmpDeleted = empRepo.deleteEmployeeSalaryInrange(35000.0, 45000.0);
			if(noOfEmpDeleted>0)
			System.out.println("Total "+noOfEmpDeleted+" number of employee are removed");
			else
				System.out.println("No Employee found in that salaray range ");
			
			 LocalDateTime currentDate = empRepo.fetchCurrentDate();
			 System.out.println("Todays Date: "+currentDate);

				/*LocalDateTime currentDate = LocalDateTime.now();
				Timestamp sqlDate = Timestamp.valueOf(currentDate);*/
				/*int insertEmployee = empRepo.insertEmployee( "Prativa", "DEVELOPER", currentDate, 56000.0, 40);
				 System.out.println(insertEmployee+" Employee got registerd");
				*/
			 
			  empRepo.ceateTable();
		     System.out.println("Another table created with same structure as EMP");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
