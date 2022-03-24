package com.br.juannobert.empresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.juannobert.empresa.entities.Employee;
import com.br.juannobert.empresa.repositories.EmployeeRepository;

public class EmployeeServices {
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
	
	
}
