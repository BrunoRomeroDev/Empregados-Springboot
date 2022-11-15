package com.Empregado.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Table(name = "employee")
@Data
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, 
property="id")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private double salary;
	private String deg;
	private Integer department_id;
			
	@OneToOne
	@JoinColumn(name="id",referencedColumnName = "employee_id")
	private Complements complemento;
	


}
