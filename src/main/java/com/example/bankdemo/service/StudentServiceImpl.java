package com.example.bankdemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.bankdemo.dao.StudentDAO;
import com.example.bankdemo.entity.Student;

@Service
@Qualifier("impl_1")
public class StudentServiceImpl implements StudentService {
	
	@Value("${name}")
	public String name;
	
	@Value("${server.port}")
	public String portNumber;

	@Autowired
	StudentDAO studentDAO;
	
	public void createStudent(Student student) {
		studentDAO.createStudent(student);
		
	}
	
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
		
	}
	
	public Student getStudentById(int id) {
		return studentDAO.getStudentById(id);
	}
	
	public void updateStudentDetails(int id, Student student) {
		studentDAO.updateStudentDetails(id, student);
		
	}
	
	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id, null);
	}
	
	
}
