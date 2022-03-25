package com.br.juannobert.empresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.juannobert.empresa.entities.Employee;
import com.br.juannobert.empresa.repositories.EmployeeRepository;
@Service
public class EmployeeServices {
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
	
	public Employee findById(Long id) {
		Optional<Employee> employee = repository.findById(id);
		return employee.get();
	}
	
	public Employee insert(Employee employee) {
		return repository.save(employee);
	}
}
