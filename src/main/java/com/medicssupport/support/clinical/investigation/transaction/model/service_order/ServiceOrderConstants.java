package com.medicssupport.support.clinical.investigation.transaction.model.service_order;

public class ServiceOrderConstants {
    public static final String PATH_SERVICE_ORDER = "/service-order";

    /** Search key constants */
    public static final String KEY_SO_RID = "so_rid";
    public static final String KEY_SO_PATIENT_RID = "so_patient_rid";
    public static final String KEY_SO_VISIT_RID = "so_visit_rid";

    /** Search strategy constants */
    public static final String STRATEGY_SO_RID = "SO_RID";
    public static final String STRATEGY_SO_PATIENT_RID = "SO_PATIENT_RID";
    public static final String STRATEGY_SO_VISIT_RID = "SO_VISIT_RID";

    /** Column name constants */
    public static final String COLUMN_SO_RID = "soRid";



    /** medics constants for service orders */
    /* Business Object: ORDER - STATUSES */
    public static final int STATUS_INACTIVE_FUTURE_ORDERS = -1;
    public static final int ADVISED = 1;
    public static final int UNSIGNED = 2;
    public static final int PENDING = 4;
    public static final int SO_STATUS_PENDING = 4;
    public static final int CLEARED_FOR_PROCESSING = 8;
    public static final int IN_PROGRESS = 16;
    public static final int PROCESSED = 32;
    public static final int CANCELLED = 64;
    public static final int DISCONTINUED = 128;
    public static final int MARKED_FOR_REFUND = 256;
    public static final int MARKED_FOR_REDO = 512;
    public static final int MARKED_SAMPLE_FOR_REDO = 1024;
    public static final int PENDING_CLEARED_PROCESSING = 13;
    public static final int STATUS_SAMPLES_TO_TEST = 12; // THIS STATUS HAS TO BE CHECKED!! - 11-JULY-2011

    /* Business Object: ORDER - STATES [START] */
    public static final int STATE_PATIENT_REFUSED = 4;
    public static final int STATE_INACTIVE_FUTURE_ORDERS = -1;
    public static final int STATE_DRAFT = 0;
    public static final int STATE_POST_REVIEW_DONE = 15;
    public static final int STATE_MARK_HEALTH_CHECK_DONE = 16;
    /* Business Object: ORDER - STATES [END] */
}
