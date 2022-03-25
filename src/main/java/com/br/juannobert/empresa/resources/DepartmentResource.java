package com.br.juannobert.empresa.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.juannobert.empresa.entities.Department;
import com.br.juannobert.empresa.entities.Employee;
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
	
	@PostMapping
	public ResponseEntity<Department> insert (@RequestBody Department department){
		department = service.insert(department);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{id}").buildAndExpand(department.getId()).toUri();
		return ResponseEntity.created(uri).body(department);
	}
	
}
