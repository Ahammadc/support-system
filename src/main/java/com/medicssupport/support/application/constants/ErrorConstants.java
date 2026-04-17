package com.medicssupport.support.application.constants;

public class ErrorConstants {
    // Private constructor to prevent instantiation
    private ErrorConstants() {
        throw new UnsupportedOperationException("This is a constant class and cannot be instantiated");
    }

    // Error Codes
    public static final String ERR_CODE_RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND";
    public static final String ERR_CODE_BAD_REQUEST = "BAD_REQUEST";
    public static final String ERR_CODE_UNAUTHORIZED = "UNAUTHORIZED";
    public static final String ERR_CODE_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";

    // Generic Messages
    public static final String MSG_UNEXPECTED_ERROR = "An unexpected error occurred";

    // Path Utility
    public static final String URI_PREFIX = "uri=";

    // Utility & Path Extraction
    public static final String EMPTY = "";

    // Error Messages & Templates
    public static final String MSG_VALIDATION_FAILED = "Validation failed for object='%s'";
    public static final String MSG_CONSTRAINT_VIOLATION = "Constraint violation";

}
