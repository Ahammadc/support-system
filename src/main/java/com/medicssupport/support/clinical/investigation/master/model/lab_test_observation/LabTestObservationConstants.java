package com.medicssupport.support.clinical.investigation.master.model.lab_test_observation;

public class LabTestObservationConstants {

    private LabTestObservationConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PATH_LAB_TEST_OBSERVATION = "/lab-test-observation";
    public static final String KEY_LTO_RID = "lto_rid";
    public static final String KEY_LTO_SER_RID = "lto_ser_rid";
    public static final String KEY_LTO_OBSERVATION_NAME = "lto_observation_name";
    public static final String COLUMN_RID = "rid";

    public static final String STRATEGY_LTO_RID = "LTO_RID";
    public static final String STRATEGY_LTO_SER_RID = "LTO_SER_RID";
    public static final String STRATEGY_LTO_OBSERVATION_NAME = "LTO_OBSERVATION_NAME";
}
