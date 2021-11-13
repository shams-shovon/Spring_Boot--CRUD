package com.shovon.Chalk_in_hand;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student GetStudent() {
		return new Student("Shams","Araf");
	}
	
	@GetMapping("/students")
	public List<Student> GetStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Shams","Araf"));
		students.add(new Student("Shams","Shovon"));
		students.add(new Student("Shams","Imran"));
		students.add(new Student("Shams","Sazid"));
		students.add(new Student("Sadman","Sazid"));
		
		return students;

		
	}

}
