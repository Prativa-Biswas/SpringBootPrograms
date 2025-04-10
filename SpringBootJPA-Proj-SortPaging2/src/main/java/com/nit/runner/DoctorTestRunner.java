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

	@Autowired
	private IDoctorService docService;

	@Override
	public void run(String... args) throws Exception {

		try {
			docService.showDoctorByPagination(3);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
