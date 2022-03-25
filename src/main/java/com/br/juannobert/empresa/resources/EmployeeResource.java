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

import com.br.juannobert.empresa.entities.Employee;
import com.br.juannobert.empresa.services.EmployeeServices;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeResource {
	@Autowired
	EmployeeServices service;
	
	@GetMapping
	public ResponseEntity<List<Employee>> findAll(){
		List<Employee> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Employee> findById(@PathVariable Long id){
		Employee employee = service.findById(id);
		return ResponseEntity.ok(employee);
	}
	@PostMapping
	public ResponseEntity<Employee> insert (@RequestBody Employee employee){
		employee = service.insert(employee);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("{id}").buildAndExpand(employee.getId()).toUri();
		return ResponseEntity.created(uri).body(employee);
	}
	
	
}
