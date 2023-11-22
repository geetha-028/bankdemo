package com.example.bankdemo.ctrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bankdemo.entity.Customer;

@Service
public class CustomerServiceImpl {
	
	List<Customer> customers = new ArrayList<>();
	
	public void registerCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public List<Customer> getAllCustomers() {
		return customers;
	}
}
