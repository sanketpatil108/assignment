package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.excp.ResourceNotFoundException;
import com.example.model.Student;
import com.example.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
		
	}	

	@Override
	public Optional<Student> getStudentById(Long Id) {
		
		return studentRepository.findById(Id);
	}

	@Override
	public Optional<Student> deleteById(Long Id) {
		
		return studentRepository.findById(Id);
	}

}
