package com.example.restapi_demo.Repository;

import com.example.restapi_demo.Model.Employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{}