package com.Empregado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Empregado.Repository.EmployeeRepository;
import com.Empregado.entity.DepartmentDTO;
import com.Empregado.entity.Employee;
import com.Empregado.entity.EmployeeDTO;
import com.Empregado.service.DepartmentService;
import com.Empregado.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository empregadosrepository;
	@Autowired
	private EmployeeService employeeservice;
	@Autowired
	private DepartmentService departmentService;
	
	
	@GetMapping("/empregados")
	public List<Employee> listar() {
		return empregadosrepository.findAll();

	}

	@GetMapping("/empregados/pornome/{nome}")
	public List<Employee> encontrarNome(String nome) {
		return empregadosrepository.findByNomeContaining(nome);

	}
	
	@GetMapping("/empregados/service/{id}")
	public EmployeeDTO listarService(@PathVariable Integer id) {
		Employee es = empregadosrepository.findById(id).get();
		DepartmentDTO ds = departmentService.findById(es.getDepartment_id());
		
		return employeeservice.findByIdD(id,ds);

	}
}
