package com.br.juannobert.empresa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
