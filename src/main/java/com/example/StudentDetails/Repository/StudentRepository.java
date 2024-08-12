package com.example.StudentDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.StudentDetails.Entity.Student;


public interface StudentRepository extends JpaRepository<Student,Integer>{
	@Query(value="select name from student_db.student where roll_number like ?",nativeQuery=true)
	public String getByRool(int roll);
	
	
	

}
