package com.medicssupport.support.clinical.investigation.transaction.model.order_sample;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "uh_ord_sample")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSample {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sm_rid")
    private Integer smRid;

    @Column(name = "sm_id", length = 20)
    private String smId;

    @Column(name = "sm_type")
    private Integer smType;

    @Column(name = "sm_name", length = 50)
    private String smName;

    @Column(name = "sm_pt_rid")
    private Integer smPtRid;

    @Column(name = "sm_container_rid")
    private Integer smContainerRid;

    @Column(name = "sm_result_rid")
    private Integer smResultRid;

    @Column(name = "sm_ser_center_rid")
    private Integer smSerCenterRid;

    @Column(name = "sm_device_rid")
    private Integer smDeviceRid;

    @Column(name = "sm_priority")
    private Integer smPriority;

    @Column(name = "sm_status")
    private Integer smStatus;

    @Column(name = "sm_remarks", length = 500)
    private String smRemarks;

    @Column(name = "sm_unit_rid")
    private Integer smUnitRid;

    @Column(name = "sm_datetime")
    private LocalDateTime smDatetime;

    @Column(name = "sm_mod_user")
    private Integer smModUser;

    @Column(name = "sm_mod_datetime")
    private LocalDateTime smModDatetime;

    @Column(name = "sm_acceptance_status")
    private Integer smAcceptanceStatus;

    @Column(name = "sm_state")
    private Integer smState;

    @Lob
    @Column(name = "sm_image_bytes")
    private byte[] smImageBytes;

    @Column(name = "sm_created_user_rid")
    private Integer smCreatedUserRid;

    @Column(name = "sm_created_datetime")
    private LocalDateTime smCreatedDatetime;

    @Column(name = "sm_mod_user_rid")
    private Integer smModUserRid;

    @Column(name = "sm_invalidated")
    private Integer smInvalidated;

    @Column(name = "sm_history_ref_rid")
    private Integer smHistoryRefRid;

    @Column(name = "sm_collection_date")
    private LocalDate smCollectionDate;

    @Column(name = "sm_rejection_reason", length = 50)
    private String smRejectionReason;

    @Column(name = "sm_rejected_by")
    private Integer smRejectedBy;

    @Column(name = "sm_container_color", length = 35)
    private String smContainerColor;

    @Column(name = "sm_send_date_for_ext_tests")
    private LocalDate smSendDateForExtTests;

    @Column(name = "sm_collection_staff_rid")
    private Integer smCollectionStaffRid;

    @Column(name = "sm_visit_rid")
    private Integer smVisitRid;

    @Column(name = "sm_acceptance_date")
    private LocalDate smAcceptanceDate;

    @Column(name = "sm_acceptance_time")
    private LocalTime smAcceptanceTime;

    @Column(name = "sm_acceptance_user_rid")
    private Integer smAcceptanceUserRid;

    @Column(name = "sm_collection_datetime")
    private LocalDateTime smCollectionDatetime;

    @Column(name = "sm_collection_time")
    private LocalTime smCollectionTime;

    @Column(name = "sm_is_fasting_collection")
    private Integer smIsFastingCollection;

    @Column(name = "sm_entity_rid")
    private Integer smEntityRid;

    @Column(name = "sm_grid_id", length = 50)
    private String smGridId;

    @Column(name = "sm_ext_lab_id", length = 50)
    private String smExtLabId;

    @Column(name = "sm_is_ext_accepted")
    private Integer smIsExtAccepted;

    @Column(name = "sm_body_location_index")
    private Integer smBodyLocationIndex;

    @Column(name = "sm_body_location", length = 50)
    private String smBodyLocation;
}