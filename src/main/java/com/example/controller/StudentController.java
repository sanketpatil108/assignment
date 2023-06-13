package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.excp.ResourceNotFoundException;
import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		
		Student students = studentService.saveStudent(student);
		
		return ResponseEntity.created(null).body(students);
	
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		
		return studentService.getAllStudent();
		
	}
	
	@GetMapping("/{Id}")
   public ResponseEntity<Student> getStudentById(@PathVariable("Id") Long Id) throws ResourceNotFoundException{
		
		Optional<Student> student = studentService.getStudentById(Id);
	   
	   if(student.isPresent()) {
		   return new ResponseEntity<>(student.get(),HttpStatus.OK);
	   }else {
		//   return new ResponseEntity<>(null,HttpStatus.NOT_FOUND );
		   throw new ResourceNotFoundException();
	   }	   
   }
	@DeleteMapping("/{Id}")
	public ResponseEntity<Student> getDeleteById(@PathVariable("Id") Long Id) throws ResourceNotFoundException
	{
		Optional<Student> student = studentService.deleteById(Id);
		if(student.isPresent()) {
			return new ResponseEntity<>(student.get(),HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException();
		}
		
	}
}
