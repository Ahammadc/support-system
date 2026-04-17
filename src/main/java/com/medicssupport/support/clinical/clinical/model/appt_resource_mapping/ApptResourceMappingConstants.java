package com.medicssupport.support.clinical.clinical.model.appt_resource_mapping;

public class ApptResourceMappingConstants {

    private ApptResourceMappingConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PATH_APPOINTMENT_RESOURCE_MAPPING = "/appt-resource-mapping";

    public static final String KEY_ARM_RID = "arm_rid";
    public static final String KEY_ARM_RESOURCE_RID = "arm_resource_rid";

    public static final String COLUMN_APPOINTMENT_RESOURCE_ID = "apptResourceId";

    public static final String STRATEGY_ARM_RID = "ARM_RID";
    public static final String STRATEGY_ARM_RESOURCE_RID = "ARM_RESOURCE_RID";
}
