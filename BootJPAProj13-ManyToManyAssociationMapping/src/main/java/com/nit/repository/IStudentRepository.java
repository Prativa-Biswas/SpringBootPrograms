package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nit.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

	@Query(value="select SID,SNAME,SADDRESS,COLLEGE,FID,FNAME,FADDRESS from jpa_faculty f,jpa_student s,jpa_faculty_student fs "
			+ "where f.fid=fs.faculty_id and s.sid=fs.student_id and sid=:id",nativeQuery = true)
	public List<Object[]> findFacultyPerStudentUsingJoin(Integer id);
}
