package com.example.bankdemo.ctrl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtrl {

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public void get() {
		System.out.println("in get method");
	}
	
	@GetMapping(value = "/get2")
	public void getExample() {
		System.out.println("in get method");
	}
	
	// http://localhost:8080/create?id=1&name=abcxyz
	@PostMapping(value = "/create")
	//public ResponseEntity<String> create(@RequestParam(name = "id", required = true) int sId, @RequestParam(defaultValue = "Geetha") String name) {

	public ResponseEntity<String> create(@RequestParam int sId, @RequestParam(defaultValue = "Geetha") String name) {
		System.out.println("id : "+sId);
		System.out.println("name : "+name);
		String body = sId + "-" + name;
		return new ResponseEntity<>(body, HttpStatus.CREATED) ;
	}
}
