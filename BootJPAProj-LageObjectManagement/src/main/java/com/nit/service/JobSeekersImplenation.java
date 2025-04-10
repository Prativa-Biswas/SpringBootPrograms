package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.JobSeekers;
import com.nit.repository.IJobSeekersManagement;

@Service
public class JobSeekersImplenation implements IJobSeekersService {

	@Autowired
	private IJobSeekersManagement jsSeekerRepo;
	
	@Override
	public String registerJobSeekers(JobSeekers jsSeeker) {
		Integer id = jsSeekerRepo.save(jsSeeker).getJsId();
		return "Candidate Registered with id "+id;
	}

	@Override
	public Optional<JobSeekers> fetchJobSeekersDetails(Integer id) {
		return jsSeekerRepo.findById(id);
	}
}
