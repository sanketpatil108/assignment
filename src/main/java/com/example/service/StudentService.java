package com.example.service;


import java.util.List;
import java.util.Optional;


import com.example.model.Student;


public interface StudentService {
	
	public Student saveStudent(Student student); 

	public List<Student> getAllStudent();
	
	public Optional<Student> getStudentById(Long Id);
	
	public Optional<Student> deleteById(Long Id);
	
}
