package com.br.juannobert.empresa.services;

import java.util.List;

import com.br.juannobert.empresa.entities.Departament;
import com.br.juannobert.empresa.repositories.DepartamentRepository;


public class DepartamentServices {
	
	DepartamentRepository repository;
	
	public List<Departament> findAll(){
		return repository.findAll();
	}
	
	
}
