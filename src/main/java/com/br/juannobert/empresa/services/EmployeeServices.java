package com.br.juannobert.empresa.services;

import java.util.List;

import com.br.juannobert.empresa.entities.Employee;
import com.br.juannobert.empresa.repositories.EmployeeRepository;

public class EmployeeServices {
	
	EmployeeRepository repository;
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
	
	
}
