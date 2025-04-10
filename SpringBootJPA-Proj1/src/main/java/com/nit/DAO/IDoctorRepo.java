package com.nit.DAO;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Doctor;

public interface IDoctorRepo extends CrudRepository<Doctor, Integer> {

}
