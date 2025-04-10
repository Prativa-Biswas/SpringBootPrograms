package com.nit.DAO;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.entity.Doctor;

public interface IDoctorRepo extends PagingAndSortingRepository<Doctor, Integer> {

}
