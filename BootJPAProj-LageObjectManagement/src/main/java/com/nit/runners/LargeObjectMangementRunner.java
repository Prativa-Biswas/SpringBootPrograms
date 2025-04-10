package com.nit.runners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.JobSeekers;
import com.nit.service.IJobSeekersService;

//@Component
public class LargeObjectMangementRunner implements CommandLineRunner {

	@Autowired
	private IJobSeekersService jsService;
	@Override
	public void run(String... args) throws Exception {

		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Your name: ");
			String name=sc.nextLine();
			System.out.println("Enter your Address");
			String address=sc.nextLine();
			System.out.println("Are you Indian ? ");
			Boolean indian=sc.nextBoolean();
			sc.nextLine();
			System.out.println("Enter your Photo Path: ");
			String photoPath=sc.next();
			sc.nextLine();
			System.out.println("Enter your Resume Path: ");
			String resumePath=sc.next();
			
			//Convert photo path to byte array
			FileInputStream fis=new FileInputStream(photoPath);
			byte[] photoData=new byte[fis.available()];
			photoData=fis.readAllBytes();
			
			//Convert resume path to char array
			int length=  (int) new File(resumePath).length();
			FileReader fi= new FileReader(resumePath);
			char[] resumeData=new char[length];
			fi.read(resumeData);
			
			JobSeekers js=new JobSeekers(name,address,indian,photoData,resumeData);
			
			String msg = jsService.registerJobSeekers(js);
			System.out.println(msg);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
