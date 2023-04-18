package com.vinicius.workshop_mongodb.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vinicius.workshop_mongodb.resources.exception.StandartError;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExcepitionHandler {
	
	@ExceptionHandler(ObjectNotFound.class)
	public ResponseEntity<StandartError> objNotFound (ObjectNotFound e, HttpServletRequest request){
		
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandartError err = new StandartError(System.currentTimeMillis(), status.value(), "Não encontrado", e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
