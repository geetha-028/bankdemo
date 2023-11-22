package com.example.bankdemo.service;

import java.util.List;

import com.example.bankdemo.entity.Student;

public interface StudentService {

	public void createStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public void updateStudentDetails(int id, Student student);
	public void deleteStudent(int id);
}
