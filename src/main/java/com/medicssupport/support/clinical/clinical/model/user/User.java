package com.medicssupport.support.clinical.clinical.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "u_user") // Replace with your actual table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_rid")
    private Integer userRid;

    @Column(name = "user_id", length = 100)
    private String userId;

    @Column(name = "user_type", length = 1)
    private String userType;

    @Column(name = "user_password", length = 100)
    private String userPassword;

    @Column(name = "user_full_name", length = 100)
    private String userFullName;

    @Column(name = "user_gender")
    private Integer userGender;

    @Column(name = "user_dob")
    private LocalDate userDob;

    @Column(name = "user_street_addr", length = 255)
    private String userStreetAddr;

    @Column(name = "user_city", length = 35)
    private String userCity;

    @Column(name = "user_country", length = 25)
    private String userCountry;

    @Column(name = "user_pin_code", length = 9)
    private String userPinCode;

    @Column(name = "user_phone", length = 30)
    private String userPhone;

    @Column(name = "user_mobile", length = 30)
    private String userMobile;

    @Column(name = "user_email", length = 75)
    private String userEmail;

    @Column(name = "user_account_rid")
    private Integer userAccountRid;

    @Column(name = "user_entity_rid")
    private Integer userEntityRid;

    @Column(name = "user_valid")
    private Boolean userValid;

    @Column(name = "user_reg_datetime")
    private LocalDateTime userRegDatetime;

    @Column(name = "user_unreg_datetime")
    private LocalDateTime userUnregDatetime;

    @Column(name = "user_mod_user_rid")
    private Integer userModUserRid;

    @Column(name = "user_mod_datetime")
    private LocalDateTime userModDatetime;

    @Column(name = "user_row_invalidated")
    private Boolean userRowInvalidated;

    @Column(name = "user_feature_rid")
    private Integer userFeatureRid;

    @Column(name = "port_id")
    private Integer portId;

    @Column(name = "user_code", length = 100)
    private String userCode;

    @Column(name = "is_common_user")
    private Integer isCommonUser;

    @Column(name = "user_password_expiry_date")
    private LocalDate userPasswordExpiryDate;

    @Column(name = "user_accnt_locked_till_dtime")
    private LocalDateTime userAccntLockedTillDtime;

    @Column(name = "user_accnt_is_locked")
    private Boolean userAccntIsLocked;

    @Column(name = "user_incorrect_password_cntr")
    private Integer userIncorrectPasswordCntr;

    @Column(name = "user_is_system_defined")
    private Integer userIsSystemDefined;

    @Column(name = "user_is_staff")
    private Integer userIsStaff;

    @Column(name = "port_u_staff_rid")
    private Integer portUStaffRid;

    @Column(name = "user_manually_ported")
    private Integer userManuallyPorted;

    @Column(name = "user_old_user_rid")
    private Integer userOldUserRid;

    @Column(name = "user_encrypted_password", length = 100)
    private String userEncryptedPassword;

    @Column(name = "user_external_id", length = 50)
    private String userExternalId;

    @Column(name = "port_user_staff_code", length = 20)
    private String portUserStaffCode;

    @Column(name = "user_last_access_datetime")
    private LocalDateTime userLastAccessDatetime;

    @Column(name = "user_is_online")
    private Integer userIsOnline;

    @Column(name = "user_otp", length = 500)
    private String userOtp;

    @Column(name = "user_otp_expirydatetime")
    private LocalDateTime userOtpExpirydatetime;

    @Column(name = "user_opt_created_datetime")
    private LocalDateTime userOptCreatedDatetime;

    @Column(name = "user_run_level")
    private Integer userRunLevel;

    @Lob
    @Column(name = "user_photo", columnDefinition = "MEDIUMTEXT")
    private String userPhoto;

    @Column(name = "user_profile_last_updated")
    private LocalDate userProfileLastUpdated;

    @Column(name = "user_profile_completed")
    private Boolean userProfileCompleted;

    @Column(name = "user_old_rid")
    private Integer userOldRid;

    @Column(name = "user_preference_link", length = 1000)
    private String userPreferenceLink;

    @Column(name = "user_otp_status")
    private Integer userOtpStatus;
}