package com.nit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.Entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("from Employee")
	//@Query("from Employee emp")
	//@Query("from com.nit.Entity.Employee emp")
	//@Query(" select emp from com.nit.Entity.Employee emp")
	public List<Employee> fetchAllEmployee();
	
	//@Query("from Employee where sal in(?1,?2)")
	//@Query("from Employee where sal>=?1 and  sal<=?2")
	@Query("from Employee where sal between ?1 and ?2")
	public List<Employee>  fetchEmployeeInSalaryRange(Double strat,Double end);
	
	@Query("from Employee where sal between :min and :max")
	public List<Employee>  showEmpInSalaryRange(@Param("min")Double start,@Param("max")Double end);

	@Query("from Employee where sal between :min and :max")
	public List<Employee>  findEmpInSalaryRange(Double min,Double max);
	
	@Query("from Employee where job in(:desg1,:desg2,:desg3)") ///Select-Entity Query
	public List<Employee>  findEmployeeDesignation(String desg1,String desg2,String desg3);
	
	@Query("select ename,job,sal from Employee where job in(:desg1,:desg2,:desg3)") ///Select-Scalar Query with multiple columns
	public List<Object[]>  fetchEmployeeDesignation(String desg1,String desg2,String desg3);
	
	@Query(" select ename from Employee where ename like :initChars") ///Select-Scalar Query with single columns
	public List<String>  showEmployeeDesignation(String initChars);
	
	@Query("from Employee where ename=:name") // Single Entity-Query
	public Employee findEmployeeByName(String name);
		
	@Query("select ename,hire_date,job from Employee where ename=:name") // Single record with multiple columns
	public Object findEmployeeInfo(String name);
		
	@Query("select deptno from Employee where ename=:name") // Single Entity-Query
	public Integer findEmployeeDept(String name);
	
	@Query("select count(distinct ename) from Employee")
	public Integer distinctEmployeeCount();
	
	@Query("select count(*),min(sal),max(sal),sum(sal) from Employee ")
	public Object employeeAggregateValues(); 
}
