package com.simplejava.csvexample.csvexapmple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.simplejava.csvexample.csvexapmple.entity.Employee;
import com.simplejava.csvexample.csvexapmple.repo.EmployeeRepository;

@SpringBootApplication
public class CsvexapmpleApplication {
	
	@Autowired
	private EmployeeRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(CsvexapmpleApplication.class, args);
	}

}
