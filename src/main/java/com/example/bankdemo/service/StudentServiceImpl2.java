package com.example.bankdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.bankdemo.entity.Student;

@Service
@Primary
public class StudentServiceImpl2 implements StudentService {

	@Override
	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudentDetails(int id, Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

}
