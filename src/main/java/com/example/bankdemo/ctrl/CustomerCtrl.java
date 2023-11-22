package com.example.bankdemo.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankdemo.entity.Customer;

@RestController
public class CustomerCtrl {

	// CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
	
//	@Autowired
//	CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl(); //new 
	
	@Autowired
	CustomerServiceImpl customerServiceImpl ;
	
	@RequestMapping(value = "/v1/customer", method = RequestMethod.POST)
	public void registerCustomer(@RequestBody Customer c) {
		customerServiceImpl.registerCustomer(c);
		
		
	}
	@RequestMapping(value = "/v1/customer", method = RequestMethod.GET)
	public List<Customer> getAllCustomers() {
		return customerServiceImpl.getAllCustomers();
	}
}
