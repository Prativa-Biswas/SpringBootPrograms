package com.nit.service;

import java.util.Optional;

import com.nit.entity.JobSeekers;

public interface IJobSeekersService {
	
	public String registerJobSeekers(JobSeekers jsSeeker);
	public Optional<JobSeekers> fetchJobSeekersDetails(Integer id);

}
