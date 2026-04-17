package com.medicssupport.support.application.constants;

public final class CommonConstants {

    private CommonConstants() {
        throw new UnsupportedOperationException("This is a constant class and cannot be instantiated");
    }

    /* Booleans values*/
    public static final Boolean SUCCESS_RESPONSE = true;
    public static final Boolean FAILURE_RESPONSE = false;

    // Validation Messages
    public static final String VAL_SEARCH_TYPE_REQ = "Search type is required";
    public static final String VAL_SEARCH_VAL_REQ = "At least one search value is required";
    public static final String VAL_SEARCH_VAL_MAX = "Maximum 100 search values allowed";
    public static final String VAL_SEARCH_VAL_BLANK = "Search value cannot be blank";

    // Static Responses
    public static final String MSG_HEALTH_CHECK = "Hello!!.. medics support";

    /* Strings */
    public static final String NO_DETAILS_STRING = "No details";

    /** Regular expressions */
    public static final String NUMERIC_REGEX = "\\d+";
    public static final String NON_NUMERIC_REGEX = "[^0-9]";
    public static final String PHONE_NUMBER_REGEX = "^[0-9]{10,15}$";
}
