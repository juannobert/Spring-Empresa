package com.br.juannobert.empresa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.juannobert.empresa.entities.Department;
import com.br.juannobert.empresa.repositories.DepartamentRepository;

@Service
public class DepartmentServices {
	
	@Autowired
	DepartamentRepository repository;
	
	public List<Department> findAll(){
		return repository.findAll();
	}
	
	
}
