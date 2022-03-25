package com.br.juannobert.empresa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.br.juannobert.empresa.entities.Department;
import com.br.juannobert.empresa.repositories.DepartamentRepository;
import com.br.juannobert.empresa.services.execptions.DataBaseException;
import com.br.juannobert.empresa.services.execptions.ResourceNotFoundException;

@Service
public class DepartmentServices {
	
	@Autowired
	DepartamentRepository repository;
	
	public List<Department> findAll(){
		return repository.findAll();
	}
	
	public Department findById(Long id) {
		Optional<Department> department = repository.findById(id);
		return department. orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Department insert(Department department) {
		return repository.save(department);
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
