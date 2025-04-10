package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.JobSeekers;

public interface IJobSeekersManagement extends JpaRepository<JobSeekers, Integer> {

}
