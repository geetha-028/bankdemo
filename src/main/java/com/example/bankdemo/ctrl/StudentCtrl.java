package com.example.bankdemo.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankdemo.entity.Student;
import com.example.bankdemo.service.StudentService;

@RestController // @Controller + @ResponseBody
@RequestMapping("/v1")
public class StudentCtrl {

	@Autowired
	@Qualifier("impl_1")
	StudentService service;
	
	@PostMapping("/student")
	public ResponseEntity<Object> createStudent(@RequestBody Student student) {
		service.createStudent(student);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/student")
	public ResponseEntity<List<Student>> getAllStudents() {
		System.out.println("class name : "+service.getClass().getName());
		List<Student> list = service.getAllStudents();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@GetMapping(value = "/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable int id) {
		Student s = service.getStudentById(id);
		if(s != null) {
			return new ResponseEntity<>(s, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping(value = "/student/{id}") 
	public void updateStudentDetails(@PathVariable int id, @RequestBody Student student) {
		service.updateStudentDetails(id, student);
	}
	
	@DeleteMapping(value = "/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}
	
	
}
