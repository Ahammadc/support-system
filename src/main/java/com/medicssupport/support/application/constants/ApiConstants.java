package com.medicssupport.support.application.constants;

public class ApiConstants {

    private ApiConstants() {
        throw new UnsupportedOperationException("This is a constant class and cannot be instantiated");
    }

    // Pattern for matching all paths
    public static final String ANY_PATH = "/**";

    // Super class APIs
    public static final String PATH_SEARCH = "/search";
    public static final String PATH_SEARCH_TYPES = "/search-types";

    // Versioning
    public static final String VERSION_V1 = "/v1";
    public static final String VERSION_V2 = "/v2";

    // Base Paths
    public static final String API_ROOT = "/api" + VERSION_V1;

    // Common Path Variables
    public static final String RID_PATH_VAR = "/{rid}";
    public static final String ID_PATH_VAR = "/{id}";
    public static final String UUID_PATH_VAR = "/{uuid}";

    // Sort & Pagination Params (Useful for @RequestParam defaults)
    public static final String SORT_ASC = "asc";
    public static final String SORT_DESC = "desc";
    public static final String PAGE_DEFAULT = "0";
    public static final String SIZE_DEFAULT = "20";
}
