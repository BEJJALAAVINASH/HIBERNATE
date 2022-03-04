package com.assignment.emp.empassignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.emp.empassignment.entity.Employee;
import com.assignment.emp.empassignment.repository.EmployeeRepository;


@SpringBootApplication
public class EmpassignmentApp   implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeRepository  repository;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpassignmentApp.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Employee employee = repository.findById(1000L);
		logger.info("employee 1000 = {}",employee);
	repository.deleteById(1001L);
		repository.save(new Employee("GOUTHAM","BEJJALA"));
	}

}
