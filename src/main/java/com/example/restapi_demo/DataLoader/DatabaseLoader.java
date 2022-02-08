package com.example.restapi_demo.DataLoader;

import com.example.restapi_demo.Model.Employee;
import com.example.restapi_demo.Repository.EmployeeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseLoader implements CommandLineRunner{
    private final EmployeeRepository repository;
    private DatabaseLoader(EmployeeRepository repository){

        this.repository = repository;
    }

    @Override
	public void run(String... strings) throws Exception { 
		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
	}
}
