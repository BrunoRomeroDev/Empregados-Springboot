package com.Empregado.Exception;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class ApiErros {
	
	private List<String> errors;
	
	public void ApiErrors(String mensagem) {
		this.errors = Arrays.asList(mensagem);
	}
}
