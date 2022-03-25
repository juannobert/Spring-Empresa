package com.br.juannobert.empresa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.juannobert.empresa.entities.Department;
import com.br.juannobert.empresa.services.DepartmentServices;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentResource {
	
	@Autowired
	DepartmentServices service;
	
	@GetMapping
	public ResponseEntity<List<Department>> findAll(){
		List<Department> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Department> findById(@PathVariable Long id){
		Department department = service.findById(id);
		return ResponseEntity.ok(department);
	}
}
