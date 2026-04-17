package com.medicssupport.support.clinical.clinical.model.admission_request;

public class AdmissionRequestConstants {

    private AdmissionRequestConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PATH_ADMISSION_REQUEST = "/admission-request";

    public static final String KEY_REQ_RID = "req_rid";
    public static final String KEY_REQ_PATIENT_RID = "req_patient_rid";

    public static final String COLUMN_REQ_RID = "reqRid";

    public static final String STRATEGY_REQ_RID = "REQ_RID";
    public static final String STRATEGY_REQ_PATIENT_RID = "REQ_PATIENT_RID";
}
