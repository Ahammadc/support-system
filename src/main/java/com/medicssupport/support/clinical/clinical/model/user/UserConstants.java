package com.medicssupport.support.clinical.clinical.model.user;

public class UserConstants {

    private UserConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final String PATH_USER = "/user";

    public static final String KEY_USER_RID = "user_rid";
    public static final String KEY_USER_ID = "user_id";
    public static final String KEY_USER_ENTITY_RID = "user_entity_rid";
    public static final String KEY_USER_FULL_NAME = "user_full_name";

    public static final String COLUMN_USER_RID = "userRid";

    public static final String STRATEGY_USER_RID = "USER_RID";
    public static final String STRATEGY_USER_ID_AND_ENTITY_RID = "USER_ID_AND_ENTITY_RID";
    public static final String STRATEGY_USER_ENTITY_RID = "USER_ENTITY_RID";
    public static final String STRATEGY_USER_FULL_NAME_AND_ENTITY_RID = "USER_FULL_NAME_AND_ENTITY_RID";
}
