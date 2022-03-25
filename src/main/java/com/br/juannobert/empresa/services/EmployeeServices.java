package com.br.juannobert.empresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.br.juannobert.empresa.entities.Employee;
import com.br.juannobert.empresa.repositories.EmployeeRepository;
import com.br.juannobert.empresa.services.execptions.DataBaseException;
import com.br.juannobert.empresa.services.execptions.ResourceNotFoundException;
@Service
public class EmployeeServices {
	@Autowired
	EmployeeRepository repository;
	
	public List<Employee> findAll(){
		return repository.findAll();
	}
	
	public Employee findById(Long id) {
		Optional<Employee> employee = repository.findById(id);
		return employee.orElseThrow(() ->  new ResourceNotFoundException(id));
		
	}
	
	public Employee insert(Employee employee) {
		return repository.save(employee);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DataBaseException();
		}
	}
}
