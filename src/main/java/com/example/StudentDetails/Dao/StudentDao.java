package com.example.StudentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentDetails.Entity.Student;
import com.example.StudentDetails.Repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;

//	public String PostDao(Student age) {
//		sr.save(age);
//		return "Post Succesfully";
//	}

	public String PostDao(Student age) {
		sr.save(age);
		return "Save Successfully age";
	}
	public String getByRool(int roll) {
		return sr.getByRool(roll);
	}


}
