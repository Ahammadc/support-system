package com.medicssupport.support.application.model;


import com.medicssupport.support.application.constants.CommonConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {
    private boolean success = CommonConstants.FAILURE_RESPONSE;
    private int status;
    private String error;
    private String message;
    private String errorCode;
    private LocalDateTime timestamp;
    private String path;
    private ValidationErrors validationErrors;
    private String details = CommonConstants.NO_DETAILS_STRING;


    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ValidationErrors {
        private int errorCount;
        private List<FieldError> fieldErrors;
        private List<GlobalError> globalErrors;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class FieldError {
        private String field;
        private String message;
        private Object rejectedValue;
        private String objectName;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class GlobalError {
        private String objectName;
        private String message;
        private String code;
    }
}