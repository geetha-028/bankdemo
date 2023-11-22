package com.example.bankdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bankdemo.ctrl.StudentCtrl;
import com.example.bankdemo.service.StudentServiceImpl;

@SpringBootApplication
public class BankdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BankdemoApplication.class, args);
		
//		StudentServiceImpl impl = context.getBean(StudentServiceImpl.class);
//		System.out.println("impl name : "+impl.name);
//		System.out.println("impl portNumber : "+impl.portNumber);
	}

}
