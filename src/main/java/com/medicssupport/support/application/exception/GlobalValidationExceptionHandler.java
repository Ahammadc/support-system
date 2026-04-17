package com.medicssupport.support.application.exception;

import com.medicssupport.support.application.constants.ErrorConstants;
import com.medicssupport.support.application.model.ErrorResponse;
import jakarta.validation.ConstraintViolationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalValidationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(
            MethodArgumentNotValidException ex,
            WebRequest request) {

        // Build field errors
        List<ErrorResponse.FieldError> fieldErrors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> ErrorResponse.FieldError.builder()
                        .field(error.getField())
                        .message(error.getDefaultMessage())
                        .rejectedValue(error.getRejectedValue())
                        .objectName(error.getObjectName())
                        .build())
                .collect(Collectors.toList());

        // Build global errors
        List<ErrorResponse.GlobalError> globalErrors = ex.getBindingResult()
                .getGlobalErrors()
                .stream()
                .map(error -> ErrorResponse.GlobalError.builder()
                        .objectName(error.getObjectName())
                        .message(error.getDefaultMessage())
                        .code(error.getCode())
                        .build())
                .collect(Collectors.toList());

        // Build validation errors object
        ErrorResponse.ValidationErrors validationErrors = ErrorResponse.ValidationErrors.builder()
                .errorCount(fieldErrors.size() + globalErrors.size())
                .fieldErrors(fieldErrors)
                .globalErrors(globalErrors)
                .build();

        // Build complete error response
        ErrorResponse errorResponse = ErrorResponse.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .error(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .message(String.format(ErrorConstants.MSG_VALIDATION_FAILED, ex.getBindingResult().getObjectName()))
                .path(extractPath(request))
                .timestamp(LocalDateTime.now())
                .validationErrors(validationErrors)
                .build();

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ErrorResponse> handleConstraintViolation(
            ConstraintViolationException ex,
            WebRequest request) {

        List<ErrorResponse.FieldError> fieldErrors = ex.getConstraintViolations()
                .stream()
                .map(violation -> ErrorResponse.FieldError.builder()
                        .field(violation.getPropertyPath().toString())
                        .message(violation.getMessage())
                        .rejectedValue(violation.getInvalidValue())
                        .objectName(violation.getRootBeanClass().getSimpleName())
                        .build())
                .collect(Collectors.toList());

        ErrorResponse.ValidationErrors validationErrors = ErrorResponse.ValidationErrors.builder()
                .errorCount(fieldErrors.size())
                .fieldErrors(fieldErrors)
                .globalErrors(new ArrayList<>())
                .build();

        ErrorResponse errorResponse = ErrorResponse.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .error(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .message(ErrorConstants.MSG_CONSTRAINT_VIOLATION)
                .path(extractPath(request))
                .timestamp(LocalDateTime.now())
                .validationErrors(validationErrors)
                .build();

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    private String extractPath(WebRequest request) {
        return request.getDescription(false).replace(ErrorConstants.URI_PREFIX, "");
    }
}
