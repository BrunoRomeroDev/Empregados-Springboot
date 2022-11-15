package com.Empregado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Empregado.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
	
		Department findByName(String nome);

}
