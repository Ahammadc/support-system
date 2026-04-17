package com.medicssupport.support.clinical.clinical.model.patient;

import javax.swing.plaf.PanelUI;

public final class PatientConstants {
    private PatientConstants() {}

    // Endpoints
    public static final String PATH_PATIENT = "/patient";
    public static final String PATH_MRN = "/mrn";
    public static final String PATH_HEALTH = "/health";

    /** Search key constants */
    public static final String KEY_PAT_RID = "pat_rid";
    public static final String KEY_PAT_MRN = "pat_mrn";
    public static final String KEY_PAT_PHONE = "pat_phone";

    /** Search strategy constants */
    public static final String STRATEGY_PAT_RID = "PAT_RID";
    public static final String STRATEGY_PAT_MRN = "PAT_MRN";
    public static final String STRATEGY_PAT_PHONE = "PAT_PHONE";

    /** Column name constants*/
    public static final String COLUMN_PAT_RID = "patRid";

    // Request Parameters
    public static final String PARAM_MRN = "patientMRN";
    public static final String PARAM_MRN_LIST = "patientMrnList";
    public static final String PARAM_SEARCH_TYPE = "searchType";
    public static final String PARAM_SEARCH_VALUES = "searchValues";

    // Validation Messages
    public static final String VAL_SEARCH_TYPE_REQ = "Search type is required";
    public static final String VAL_SEARCH_VAL_REQ = "At least one search value is required";
    public static final String VAL_SEARCH_VAL_MAX = "Maximum 100 search values allowed";
    public static final String VAL_SEARCH_VAL_BLANK = "Search value cannot be blank";

    // Log Templates
    public static final String LOG_SEARCH_REQ = "Received patient search request - Type: {}, Values: {}";
    public static final String LOG_GET_SEARCH_REQ = "Received GET patient search request - Type: {}, Values: {}";

    // Static Responses
    public static final String MSG_HEALTH_CHECK = "Hello!!.. medics support";
}
