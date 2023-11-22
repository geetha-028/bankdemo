package com.example.bankdemo.ctrl;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankdemo.entity.Student;

@RestController
public class TestCtrl2 {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public void createStudent(String id, String name, String mobile, String fee, String gender) {
		// 1. getting all strings
		// 2. convert into respective data types
		// 3. create required object using args
		int sId = Integer.parseInt(id);
		double fees = Double.parseDouble(fee);
		char gen = gender.charAt(0);
		
		Student student = new Student(sId, name, mobile, fees, gen);
		System.out.println(student);
	
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public void createStudent2(
			@RequestParam int id, 
			@RequestParam String name, 
			@RequestParam String mobile, 
			@RequestParam double fee, 
			@RequestParam char gender) {
		
		// 3. create required object using args
		Student student = new Student(id, name, mobile, fee, gender);
		System.out.println(student);
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.PUT)
	public void createStudent3(@RequestBody Student student) {
		System.out.println(student);
	}
}
