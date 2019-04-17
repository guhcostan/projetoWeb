package com.web.project;

import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(NotFoundException.class)
	public final ResponseEntity<Object> handleNotFoundException(NotFoundException ex, WebRequest request) {

		return handleExceptionInternal(ex, null, null, HttpStatus.NOT_FOUND, request);

	}

	@ExceptionHandler(RestClientException.class)
	public final ResponseEntity<Object> handleRestClientException(RestClientException ex, WebRequest request) {

		return handleExceptionInternal(ex, null, null, HttpStatus.INTERNAL_SERVER_ERROR, request);

	}

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleNotThreatedException(Exception ex, WebRequest request) {

		return handleExceptionInternal(ex, null, null, HttpStatus.INTERNAL_SERVER_ERROR, request);

	}

	@Override
	protected ResponseEntity<Object> handleExceptionInternal(Exception ex,
															 Object body, HttpHeaders headers, HttpStatus status,
															 WebRequest request) {

		logger.error(ex.getLocalizedMessage(), ex);

		return super.handleExceptionInternal(ex, body, headers, status, request);

	}

}
