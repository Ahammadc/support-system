package com.medicssupport.support.application.exception;


import com.medicssupport.support.application.constants.ErrorConstants;
import com.medicssupport.support.application.model.ApiResponse;
import com.medicssupport.support.application.model.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFound(
            ResourceNotFoundException ex, WebRequest request) {
        ErrorResponse error = new ErrorResponse();
        error.setMessage(ex.getMessage());
        error.setErrorCode(ErrorConstants.ERR_CODE_RESOURCE_NOT_FOUND);
        error.setTimestamp(LocalDateTime.now());
        error.setPath(request.getDescription(false).replace(ErrorConstants.URI_PREFIX, ""));

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handleBadRequest(
            BadRequestException ex, WebRequest request) {
        ErrorResponse error = new ErrorResponse();
        error.setMessage(ex.getMessage());
        error.setErrorCode(ErrorConstants.ERR_CODE_BAD_REQUEST);
        error.setTimestamp(LocalDateTime.now());
        error.setPath(request.getDescription(false).replace(ErrorConstants.URI_PREFIX, ""));

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ErrorResponse> handleUnauthorized(
            UnauthorizedException ex, WebRequest request) {
        ErrorResponse error = new ErrorResponse();
        error.setMessage(ex.getMessage());
        error.setErrorCode(ErrorConstants.ERR_CODE_UNAUTHORIZED);
        error.setTimestamp(LocalDateTime.now());
        error.setPath(request.getDescription(false).replace(ErrorConstants.URI_PREFIX, ""));

        return new ResponseEntity<>(error, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(InvalidSearchTypeException.class)
    public ResponseEntity<ErrorResponse> handleInvalidSearchType(InvalidSearchTypeException ex) {
        log.error("Invalid search type: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse();
        error.setMessage(ex.getMessage());
        error.setErrorCode(ErrorConstants.ERR_CODE_BAD_REQUEST);
        error.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidSearchValueException.class)
    public ResponseEntity<ErrorResponse> handleInvalidSearchValue(InvalidSearchValueException ex) {
        log.error("Invalid search value: {}", ex.getMessage());
        ErrorResponse error = new ErrorResponse();
        error.setMessage(ex.getMessage());
        error.setErrorCode(ErrorConstants.ERR_CODE_BAD_REQUEST);
        error.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGlobalException(
            Exception ex, WebRequest request) {
        ErrorResponse error = new ErrorResponse();
        error.setMessage(ErrorConstants.MSG_UNEXPECTED_ERROR);
        error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setErrorCode(ErrorConstants.ERR_CODE_INTERNAL_SERVER_ERROR);
        error.setTimestamp(LocalDateTime.now());
        error.setPath(request.getDescription(false).replace(ErrorConstants.URI_PREFIX, ""));
        error.setDetails(ex.getMessage());

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}