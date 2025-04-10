package com.nit.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.Entity.Employee;

import jakarta.transaction.Transactional;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Transactional
	@Modifying
	@Query("update Employee set sal=sal+(sal*:percentage/100) where job=:degs")
	public int hikeEmployeeSalary(String degs,Double percentage);
	
	@Transactional
	@Modifying
	@Query("delete from Employee where sal between :sal1 and :sal2")
	public int deleteEmployeeSalaryInrange(Double sal1,Double sal2);
	
	
	@Query(value="SELECT SYSDATE FROM DUAL", nativeQuery=true)
	public LocalDateTime fetchCurrentDate();
	

	/*@Transactional
	@Modifying
	@Query(value="insert into emp values(EMP_SEQ.NEXTVAL,:name,:job,:date,:sal,:dept)",nativeQuery=true)
	public int insertEmployee(String name,String job,LocalDateTime Date,Double sal,Integer dept);
	*/
	
	@Transactional
	@Modifying
	@Query(value="CREATE TABLE EMPLOYEE AS SELECT * FROM EMP WHERE 1=2", nativeQuery=true)
	public void ceateTable();
	
}
