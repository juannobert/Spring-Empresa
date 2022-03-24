package com.br.juannobert.empresa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.juannobert.empresa.entities.Departament;

@Repository
public interface DepartmentRepository extends JpaRepository<Departament, Long> {

}
