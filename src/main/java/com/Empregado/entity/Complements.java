package com.Empregado.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Complements {
	
	@Id
	private Integer id;
	private String descric;
	private Integer employee_id;
	
	
}
