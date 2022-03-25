package com.br.juannobert.empresa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.juannobert.empresa.entities.Department;
import com.br.juannobert.empresa.entities.Employee;
import com.br.juannobert.empresa.entities.enums.Position;
import com.br.juannobert.empresa.repositories.EmployeeRepository;

@Configuration
@Profile("test")
public class TestConfig  implements CommandLineRunner{
	
	@Autowired
	EmployeeRepository repository;
	
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		Department d1 = new Department(null, "Eletronics");
		Department d2 = new Department(null, "Desing");
		
		Employee e1 = new Employee(null,"Bob Watson","Bob@Gmail.com",Position.Employee,d1);
		Employee e2 = new Employee(null,"Tom Martin","Tom@Gmail.com",Position.Manager,d1);
		Employee e3 = new Employee(null,"Daniel Roberts","Daniel@Gmail.com",Position.Owner,d2);
		
		repository.saveAll(Arrays.asList(e1,e2,e3));
	}

}
