package com.medicssupport.support.clinical.clinical.model.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Integer userRid;
    private String userId;
    private String userType;
    private String userPassword;
    private String userFullName;
    private Integer userGender;
    private LocalDate userDob;
    private String userStreetAddr;
    private String userCity;
    private String userCountry;
    private String userPinCode;
    private String userPhone;
    private String userMobile;
    private String userEmail;
    private Integer userAccountRid;
    private Integer userEntityRid;
    private Boolean userValid;
    private LocalDateTime userRegDatetime;
    private LocalDateTime userUnregDatetime;
    private Integer userModUserRid;
    private LocalDateTime userModDatetime;
    private Boolean userRowInvalidated;
    private Integer userFeatureRid;
    private Integer portId;
    private String userCode;
    private Integer isCommonUser;
    private LocalDate userPasswordExpiryDate;
    private LocalDateTime userAccntLockedTillDtime;
    private Boolean userAccntIsLocked;
    private Integer userIncorrectPasswordCntr;
    private Integer userIsSystemDefined;
    private Integer userIsStaff;
    private Integer portUStaffRid;
    private Integer userManuallyPorted;
    private Integer userOldUserRid;
    private String userEncryptedPassword;
    private String userExternalId;
    private String portUserStaffCode;
    private LocalDateTime userLastAccessDatetime;
    private Integer userIsOnline;
    private String userOtp;
    private LocalDateTime userOtpExpirydatetime;
    private LocalDateTime userOptCreatedDatetime;
    private Integer userRunLevel;
    private String userPhoto;
    private LocalDate userProfileLastUpdated;
    private Boolean userProfileCompleted;
    private Integer userOldRid;
    private String userPreferenceLink;
    private Integer userOtpStatus;
}
