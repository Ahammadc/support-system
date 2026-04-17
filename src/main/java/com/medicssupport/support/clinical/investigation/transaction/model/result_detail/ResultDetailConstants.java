package com.medicssupport.support.clinical.investigation.transaction.model.result_detail;

public class ResultDetailConstants {
    public static final String PATH_RESULT_DETAIL = "/result-detail";

    /** List of Work lists */
    public static final String WL_PRINT_OP_SAMPLE_LABELS = "Print OP Sample Labels";
    public static final String WL_COLLECT_IP_OR_ER_SAMPLES = "Collect IP/ER Samples";
    public static final String WL_ACCEPT_SAMPLES = "Accept Samples";
    public static final String WL_RECORD_LAB_RESULTS = "Record Lab Results";
    public static final String WL_SIGN_LAB_RESULTS = "Sign Lab Results";

    // Radiology work list
    public static final String RADIOLOGY_TESTS_TO_EXECUTE = "TESTS_TO_EXECUTE";
    public static final String RADIOLOGY_IMAGES_TO_ATTACH = "IMAGES_TO_ATTACH";
    public static final String RADIOLOGY_REPORTS_TO_PREPARE = "REPORTS_TO_PREPARE";
    public static final String RADIOLOGY_FINALIZE_REPORTS = "RADIOLOGY_FINALIZE_REPORTS";
    public static final String RADIOLOGY_IMAGES_TO_REVIEW = "RADIOLOGY_IMAGES_TO_REVIEW";
    public static final String NON_IMAGING_SERVICE_REPORTS_TO_PREPARE = "NON_IMAGING_SERVICE_REPORTS_TO_PREPARE";
    public static final String IMAGING_REPORTS_TO_PREPARE = "IMAGING_REPORTS_TO_PREPARE";

    /** List of Features */
    public static final String FTR_VIEW_LAB_REPORTS = "View Lab Reports";

    /** Search key */
    public static final String KEY_RD_RID = "rd_rid";
    public static final String KEY_RD_SOURCE_ID = "rd_source_id";
    public static final String KEY_RD_SOURCE_RID = "rd_source_rid";
    public static final String KEY_RD_VISIT_RID = "rd_visit_rid";

    /** Search strategy */
    public static final String STRATEGY_RD_RID = "RD_RID";
    public static final String STRATEGY_RD_SOURCE_ID = "RD_SOURCE_ID";
    public static final String STRATEGY_RD_SOURCE_RID = "RD_SOURCE_RID";
    public static final String STRATEGY_RD_VISIT_RID = "RD_VISIT_RID";

    /** Column name constants*/
    public static final String COLUMN_RD_RID = "rdRid";
    public static final String COLUMN_RD_STATUS = "rdStatus";
    public static final String COLUMN_RD_STATE = "rdState";


/** medics constants for result details */
    /** Lab Result Status */
    public static final int STATUS_PENDING = 2;
    public static final int STATUS_SAMPLE_ACCEPTED = 4;
    public static final int STATUS_DRAFT = 8;
    public static final int STATUS_TO_BE_SIGNED = 16;
    public static final int STATUS_PROCESSED = 32;
    public static final int STATUS_CANCELLED = 64;

    /** Lab Result State */
    public static final int STATE_READY_FOR_RESULT_ENTRY = 0;
    public static final int STATE_TEST_WAITING_FOR_MACHINE_TO_PROCESS = 2;
    public static final int STATE_TEST_SENT_TO_MACHINE = 3;
    public static final int STATE_EXTERNAL_LAB_TESTS = 4;
    public static final int STATE_RESULT_ENTERED = 5;
    public static final int STATE_RESULT_TO_TRANSCRIBE = 6;
    public static final int STATE_RESULT_TO_SIGN = 8;
    public static final int STATE_TEST_TO_SEND_TO_EXTERNAL_LAB = 10;
    public static final int STATE_RESULT_TO_RECEIVE_FROM_EXTERNAL_LAB = 11;
    public static final int STATE_ABNORMAL_RESULT_TO_REVIEW = 12;
    public static final int STATE_SAMPLES_FOR_BRANCH_PROCESSING = 19;
    public static final int STATE_RESULT_TO_REVIEW = 9;


    /** Radiology result Status */
    public static final int PENDING = 2;
    public static final int DRAFT = 8;
    public static final int PROCESSED = 32;

    /** Radiology result State */
    public static final int STATE_READY_FOR_EXECUTION = 13;
    public static final int STATE_READY_FOR_ATTACHING_IMAGES = 14;
    public static final int STATE_RAD_REPORTS_TO_REVIEW_FOR_SIGN = 15;
    public static final int STATE_RAD_READY_FOR_RESULT_ENTRY = 0;
    public static final int STATE_FOR_PENDING_ORDER_DETAILS = 15;
    public static final int STATE_READY_TO_SIGN = 20;
}
