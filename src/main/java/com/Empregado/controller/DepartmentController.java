package com.Empregado.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Empregado.Repository.DepartmentRepository;
import com.Empregado.entity.Department;
import com.Empregado.entity.DepartmentDTO;
import com.Empregado.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentRepository departmentrepository;
	@Autowired
	private DepartmentService departmentsevice;
	
	@GetMapping("/department")
	public List<Department> listar(){
		return departmentrepository.findAll();
		
	}
	
	@GetMapping("/department/service/{id}")
	public ResponseEntity<Optional<Department>> listarServicos(@PathVariable @Valid Integer id)  {
		Optional<Department> dep = departmentrepository.findById(id);
		
		if(dep != null) {
			ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dep);
		}
		 return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dep); 
	}

	@GetMapping("/department/lista")
	public List<DepartmentDTO> listaAllService(){
		return departmentsevice.todosdepartamentos();
	}

	@GetMapping("/department/lista/nome/{nome}")
	public Department listardepartamentopornome(@PathVariable String nome){
		return  departmentrepository.findByName(nome);
				
	}
}
