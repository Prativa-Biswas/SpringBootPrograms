package com.nit.Runners;

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
			//empRepo.fetchAllEmployee().forEach(System.out::println);
			//empRepo.fetchEmployeeInSalaryRange(20000.0, 25000.0).forEach(System.out::println);			
			//empRepo.showEmpInSalaryRange(15000.0, 25000.0).forEach(System.out::println);
			//empRepo.findEmpInSalaryRange(15000.0, 25000.0).forEach(System.out::println);
			//empRepo.showEmployeeDesignation("J%").forEach(System.out::println);
			//System.out.println();
			/*empRepo.fetchEmployeeDesignation("ANALYST", "HR", "MANAGER").forEach(row->{
				for(Object obj:row)
					System.out.print(obj+" ");
				System.out.println();
				//System.out.println(Arrays.toString(row));
			});
			System.out.println();
			empRepo.findEmployeeDesignation("ANALYST", "HR", "MANAGER").forEach(System.out::println);
			System.out.println();
			*/
			/*System.out.println(empRepo.findEmployeeByName("JESSIKA"));
			System.out.println();
			Object info[] =(Object[])empRepo.findEmployeeInfo("ALLEN");
						
			System.out.println(Arrays.toString(info));
			System.out.println();
			System.out.println(empRepo.findEmployeeDept("JACOB"));*/
			
			System.out.println(empRepo.distinctEmployeeCount());
			Object values[] = (Object[])empRepo.employeeAggregateValues();
			System.out.println(Arrays.toString(values));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
