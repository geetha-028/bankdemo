package com.example.bankdemo.dao;

import java.util.List;

import com.example.bankdemo.entity.Student;

public interface StudentDAO {

	public void createStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public void updateStudentDetails(int id, Student student);
	public void deleteStudent(int id, Student student);
}
