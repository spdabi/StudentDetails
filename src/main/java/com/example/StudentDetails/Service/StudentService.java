package com.example.StudentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDetails.Dao.StudentDao;
import com.example.StudentDetails.Entity.Student;
import com.example.StudentDetails.Exception.MinorException;
@Service
public class StudentService {
	@Autowired
	StudentDao sd;

	
	public String PostStuAge(Student age) throws MinorException{
		if(age.getAge()>18) {
			return sd.PostDao(age);
		}
		else {
			throw new MinorException("Invalidate");
		}
		
		
	}
	
	public String getByRool(int roll) {
		return sd.getByRool(roll);
	}

}
