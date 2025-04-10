package com.nit.service;

import java.util.List;

import com.nit.entity.Doctor;

public interface IPLSQLProcedureService {

	public List<Doctor> fetchAllDoctorInRange(Double start,Double end) throws Exception;
}
