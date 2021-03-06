package com.br.juannobert.empresa.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.br.juannobert.empresa.entities.enums.Position;


@Entity
@Table(name = "tb_employee")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String email;
	
	private Integer position;
	
	@ManyToOne
	@Cascade(CascadeType.ALL)
	private Department departament;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String name, String email, Position position, Department departament) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.position = position.getCode();
		this.departament = departament;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Position getPosition() {
		return Position.value(position);
	}

	public void setPosition(Position position) {
		this.position = position.getCode();
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
