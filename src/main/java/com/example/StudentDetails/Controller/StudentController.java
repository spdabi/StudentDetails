package com.example.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDetails.Entity.Student;
import com.example.StudentDetails.Exception.MinorException;
import com.example.StudentDetails.Service.StudentService;

@RestController
@RequestMapping(value="/Student")
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping(value="/PostAgeExce")
	public String PostAgeRe(@RequestBody Student age) throws MinorException {
		try {
			return ss.PostStuAge(age);
		}
		catch(MinorException ne) {
			return "age invaludate";
		}
	}
@GetMapping(value="/getByRool/{roll}")
public String getByRool(@PathVariable int roll) {
	return ss.getByRool(roll);
}

}


		