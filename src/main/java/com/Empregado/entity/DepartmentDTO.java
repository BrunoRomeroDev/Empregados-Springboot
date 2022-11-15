package com.Empregado.entity;

import lombok.Data;

@Data
public class DepartmentDTO {


	
	private String name;
	
	
	public DepartmentDTO(Department department) {
		
		
		this.name = department.getName();
	}

}
