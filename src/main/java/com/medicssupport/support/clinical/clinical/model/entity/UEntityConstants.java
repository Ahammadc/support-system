package com.medicssupport.support.clinical.clinical.model.entity;

public class UEntityConstants {

    private UEntityConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PATH_UENTITY = "/entity";

    public static final String KEY_ENT_RID = "ent_rid";
    public static final String KEY_ENT_CODE = "ent_code";
    public static final String KEY_ENT_PARENT_RID = "ent_parent_rid";
    public static final String KEY_ENT_MODEL_RID = "ent_model_rid";
    public static final String KEY_ENT_TYPE = "ent_type";

    public static final String COLUMN_ENT_RID = "entRid";

    public static final String STRATEGY_ENT_RID = "ENT_RID";
    public static final String STRATEGY_ENT_CODE = "ENT_CODE";
    public static final String STRATEGY_ENT_PARENT_RID = "ENT_PARENT_RID";
    public static final String STRATEGY_ENT_MODEL_RID = "ENT_MODEL_RID";
    public static final String STRATEGY_ENT_PARENT_RID_AND_ENT_TYPE = "ENT_PARENT_RID_AND_ENT_TYPE";
}
