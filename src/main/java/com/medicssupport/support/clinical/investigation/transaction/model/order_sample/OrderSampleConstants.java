package com.medicssupport.support.clinical.investigation.transaction.model.order_sample;

public class OrderSampleConstants {
    public static final String PATH_ORDER_SAMPLE = "/order-sample";

    /** Search key constants */
    public static final String KEY_SM_RID = "sm_rid";
    public static final String KEY_SM_PT_RID = "sm_pt_rid";
    public static final String KEY_SM_ID = "sm_id";
    public static final String KEY_SM_ENTITY_RID = "sm_entity_rid";

    /** Search strategy constants */
    public static final String STRATEGY_SM_RID = "SM_RID";
    public static final String STRATEGY_SM_PT_RID = "SM_PT_RID";
    public static final String STRATEGY_SM_ID_AND_ENTITY_RID = "SM_ID_AND_ENTITY_RID";

    /** Column name constants*/
    public static final String COLUMN_SM_RID = "smRid";

    /** medics constants for order sample */
    public static final int SM_STATUS_PENDING = 1;
    public static final int SM_STATUS_ACCEPTED = 2;
}
