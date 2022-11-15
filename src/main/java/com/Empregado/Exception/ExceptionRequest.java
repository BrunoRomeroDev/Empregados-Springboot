package com.Empregado.Exception;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ExceptionRequest extends ResponseEntityExceptionHandler {
	
	private String message;
	private OffsetDateTime timestamp;
	private HttpStatus status;
	public ExceptionRequest(String message,OffsetDateTime timestamp, HttpStatus badRequest) {
		super();
		this.message = message;
		this.timestamp = OffsetDateTime.now();
		this.status = badRequest;
	}
	
	
	public ExceptionRequest() {
		 this.message = "Valor não encontrado";
		 timestamp = OffsetDateTime.now();
		 status = HttpStatus.NOT_FOUND;
		
	}
	
	
}
