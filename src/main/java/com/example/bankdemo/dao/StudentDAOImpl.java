package com.example.bankdemo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Repository;

import com.example.bankdemo.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	List<Student> studentList = new ArrayList<>();
	
	@Override
	public void createStudent(Student student) {
		studentList.add(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentList;
	}

	@Override
	public Student getStudentById(int id) {
		return getStudent(id);
	}

	@Override
	public void updateStudentDetails(int id, Student student) {
		updateOrDeleteStudent(id, student);
		
	}

	@Override
	public void deleteStudent(int id, Student student) {
		updateOrDeleteStudent(id, student);
		
	}
	
	private Student getStudent(int id) {
		for(Student student : studentList) {
			if(student.getId() == id) {
				return student;
			}
		}
		return null;
	}
	
	private void updateOrDeleteStudent(int id, Student student) {
		ListIterator<Student> iterator = studentList.listIterator();
		while(iterator.hasNext()) {
			Student s = iterator.next();
			if(s.getId() == id) {
				iterator.remove();
				if(student != null) {
					iterator.add(student);
				}
			}
		}
	}

}
