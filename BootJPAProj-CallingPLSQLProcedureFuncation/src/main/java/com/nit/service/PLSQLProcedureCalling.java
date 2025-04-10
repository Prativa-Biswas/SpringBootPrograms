package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service("sevicePLSQL")
public class PLSQLProcedureCalling implements IPLSQLProcedureService {

	@Autowired
	private EntityManager manager;

	@Override
	public List<Doctor> fetchAllDoctorInRange(Double start, Double end) throws Exception {
  //create StoredProcedureQuery object pointing to PLSQLProcedure
//		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_DOCTOR_BY_INCOME_RANGE",Doctor.class); // for oracle
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_DOCTOR_IN_RANGE",Doctor.class); //for mysql
		//register both IN OUT parameter by specifying their mode
		query.registerStoredProcedureParameter(1, Double.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class,ParameterMode.IN);
		//query.registerStoredProcedureParameter(3, Object.class,ParameterMode.REF_CURSOR);// for oracle
  //set parameter
		query.setParameter(1, start);
		query.setParameter(2, end);
 //Call procedure
		List list = query.getResultList();

		return list;
	}
}
