package com.nit.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="EMP")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO)
	private Integer empno;
	//@Column(length=20)
	@NonNull
	private String ename;
	//@Column(length=20)
	@NonNull
	private String job;
	@NonNull
	private LocalDate hire_date;
	@NonNull
	private Double sal;
	@NonNull
	private Integer deptno;

}
