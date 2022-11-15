package com.Empregado.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Empregado.Repository.DepartmentRepository;
import com.Empregado.entity.Department;
import com.Empregado.entity.DepartmentDTO;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentrepository;
	
	public DepartmentDTO findById(Integer id) {
		Department department =  departmentrepository.findById(id).get();
		DepartmentDTO dto = new DepartmentDTO(department);
		return dto;
		
	}
	
	public List<DepartmentDTO> todosdepartamentos(){
		List<Department> departamentos = departmentrepository.findAll();
		List<DepartmentDTO> departamentosdto = new ArrayList<>();
		for (Department department : departamentos) {
			departamentosdto.add(new DepartmentDTO(department));
		}
		return departamentosdto;
	}
	
	

}
