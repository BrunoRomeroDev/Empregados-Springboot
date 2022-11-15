package com.Empregado.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Empregado.Repository.EmployeeRepository;
import com.Empregado.entity.DepartmentDTO;
import com.Empregado.entity.Employee;
import com.Empregado.entity.EmployeeDTO;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	public EmployeeDTO findById(Integer id) {
		Employee employee =  employeerepository.findById(id).get();
		EmployeeDTO dto = new EmployeeDTO(employee);
		return dto;
		
	}

	public EmployeeDTO findByIdD(Integer id, DepartmentDTO ds) {
		Employee employee =  employeerepository.findById(id).get();
		EmployeeDTO dto = new EmployeeDTO(employee,ds);
		return dto;
	}

}
