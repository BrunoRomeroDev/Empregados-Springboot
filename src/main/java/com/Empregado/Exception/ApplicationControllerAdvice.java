package com.Empregado.Exception;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException.NotFound;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationControllerAdvice extends ResponseEntityExceptionHandler {

	   	@ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
	    public ResponseEntity<ExceptionRequest> erroTypeFormat() {
	    	ExceptionRequest er = new ExceptionRequest("Valor errado",OffsetDateTime.now(),HttpStatus.BAD_REQUEST);
	    	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
	    }
	   	
	   	@ResponseStatus(HttpStatus.NOT_FOUND)
	   	@ExceptionHandler(NotFound.class)
	   	public ResponseEntity<ExceptionRequest> NotFound(){
	   		ExceptionRequest er = new ExceptionRequest("Valor não encontrado",OffsetDateTime.now(),HttpStatus.BAD_REQUEST);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
	   		
	   	}
	   	
	   	
	
	   	
}
