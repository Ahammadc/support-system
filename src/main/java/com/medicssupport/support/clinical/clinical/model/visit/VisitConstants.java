package com.medicssupport.support.clinical.clinical.model.visit;

public final class VisitConstants {
    private VisitConstants() {}

    // Endpoints
    public static final String PATH_VISIT = "/visit";
    public static final String PATH_SEARCH = "/search";
    public static final String PATH_SEARCH_TYPES = "/search-types";

    // Request Parameters
    public static final String PARAM_SEARCH_TYPE = "searchType";
    public static final String PARAM_SEARCH_VALUES = "searchValues";

    /** Search key constants */
    public static final String KEY_VISIT_RID = "visit_rid";
    public static final String KEY_VISIT_PATIENT_RID = "visit_patient_rid";
    public static final String KEY_VISIT_ENTITY_RID = "visit_entity_rid";

    /** Search strategy constants */
    public static final String STRATEGY_VISIT_RID = "VISIT_RID";
    public static final String STRATEGY_VISIT_PATIENT_RID = "VISIT_PATIENT_RID";
    public static final String STRATEGY_VISIT_ENTITY_RID = "VISIT_ENTITY_RID";

    /** Column name constants*/
    public static final String COLUMN_VISIT_RID = "visitRid";

    // Validation Messages
    public static final String VAL_SEARCH_TYPE_REQ = "Search type is required";
    public static final String VAL_SEARCH_VAL_REQ = "At least one search value is required";
    public static final String VAL_SEARCH_VAL_MAX = "Maximum 100 search values allowed";
    public static final String VAL_SEARCH_VAL_BLANK = "Search value cannot be blank";

    // Log Templates
    public static final String LOG_SEARCH_REQ = "Received visit search request - Type: {}, Values: {}";

    // Search Types
    public static final String SEARCH_TYPE_VISIT_RID = "visit_rid";
    public static final String SEARCH_TYPE_PAT_RID = "pat_rid";
}
