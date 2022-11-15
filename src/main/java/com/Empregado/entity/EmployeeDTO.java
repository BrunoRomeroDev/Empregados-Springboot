package com.Empregado.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.Empregado.service.DepartmentService;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class EmployeeDTO {
		
	private Integer id;
	private String nome;
	private DepartmentDTO departmentdto;
	private String department;
	
	@JsonIgnore
	@Autowired
	private DepartmentService departmentservice;
	
	public EmployeeDTO(Employee employee,DepartmentDTO department) {
		super();
		this.id = employee.getId();
		this.nome = employee.getNome();
		this.departmentdto = department;
		this.department = department.getName();  
	}
	
	public EmployeeDTO(Employee employee) {
		super();
		this.id = employee.getId();
		this.nome = employee.getNome();
		 
	}
	
	

}
