package com.medicssupport.support.clinical.investigation.master.model.service_master;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "u_service_m")
public class ServiceMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ser_rid")
    private Integer rid;

    @Column(name = "ser_code")
    private String code;

    @Column(name = "ser_name")
    private String name;

    @Column(name = "ser_standard_name")
    private String standardName;

    @Column(name = "ser_category")
    private Short category;

    @Column(name = "ser_is_chargeable")
    private Boolean isChargeable;

    @Column(name = "ser_is_schedulable")
    private Boolean isSchedulable;

    @Column(name = "ser_is_orderable")
    private Integer isOrderable;

    @Column(name = "ser_signing_required")
    private Short signingRequired;

    @Column(name = "ser_co_signing_required")
    private Short coSigningRequired;

    @Column(name = "ser_result_expected")
    private Short resultExpected;

    @Column(name = "ser_duration")
    private Integer duration;

    @Column(name = "ser_vat_per")
    private Float vatPer;

    @Column(name = "ser_grp_rid")
    private Integer grpRid;

    @Column(name = "ser_entity_rid")
    private Integer entityRid;

    @Column(name = "ser_is_active")
    private Boolean isActive;

    @Column(name = "ser_user_rid")
    private Integer userRid;

    @Column(name = "ser_modified_user_rid")
    private Integer modifiedUserRid;

    @Column(name = "ser_modified_datetime")
    private Date modifiedDatetime;

    @Column(name = "ser_row_invalidated")
    private Boolean rowInvalidated;

    @Column(name = "ser_row_history_rid")
    private Integer rowHistoryRid;

    @Column(name = "ser_result_template_id")
    private Integer resultTemplateId;

    @Column(name = "ser_order_template_id")
    private Short orderTemplateId;

    @Column(name = "ser_result_valid")
    private Integer resultValid;

    @Column(name = "ser_is_doctor_specific")
    private Boolean isDoctorSpecific;

    @Column(name = "ser_doctor_share")
    private Float doctorShare;

    @Column(name = "ser_type_index")
    private Integer typeIndex;

    @Column(name = "ser_is_major_proc")
    private Boolean isMajorProc;

    @Column(name = "ser_preop_checkup_order")
    private Integer preopCheckupOrder;

    @Column(name = "ser_days_before_procedure")
    private Integer daysBeforeProcedure;

    @Column(name = "ser_preop_admission_order")
    private Integer preopAdmissionOrder;

    @Column(name = "ser_postop_checkup_order")
    private Integer postopCheckupOrder;

    @Column(name = "ser_can_be_emergency")
    private Boolean canBeEmergency;

    @Column(name = "ser_is_price_editable")
    private Boolean isPriceEditable;

    @Column(name = "ser_booking_advance")
    private Double bookingAdvance;

    @Column(name = "ser_admit_advance")
    private Double admitAdvance;

    @Column(name = "ser_is_bed_type_pricing")
    private Boolean isBedTypePricing;

    @Column(name = "ser_res_rid")
    private Integer resRid;

    @Column(name = "ser_capacity")
    private Float capacity;

    @Column(name = "ser_working_hrs")
    private Integer workingHrs;

    @Column(name = "ser_is_qty_editable")
    private Boolean isQtyEditable;

    @Column(name = "ser_mark_as_processed")
    private Short markAsProcessed;

    @Column(name = "ser_can_edit_price_in_ord")
    private Integer canEditPriceInOrd;

    @Column(name = "ser_is_daycare_procedure")
    private Short isDaycareProcedure;

    @Column(name = "ser_cost_price")
    private Double costPrice;

    @Column(name = "ser_avail_across_all_entities")
    private Boolean availAcrossAllEntities;

    @Column(name = "ser_is_perc_on_package_price")
    private Short isPercOnPackagePrice;

    @Column(name = "ser_package_price_perc")
    private Short packagePricePerc;

    @Column(name = "ser_sub_type_index")
    private Integer subTypeIndex;

    @Column(name = "ser_is_external_provider")
    private Boolean isExternalProvider;

    @Column(name = "ser_parent_rid")
    private Integer parentRid;

    @Column(name = "ser_config_parent_rid")
    private Integer configParentRid;

    @Column(name = "record_exist")
    private Integer recordExist;

    @Column(name = "temp_trgt_ser_rid")
    private Integer tempTrgtSerRid;

    @Column(name = "temp_src_ser_rid")
    private Integer tempSrcSerRid;

    @Column(name = "temp_trgt_grp_rid")
    private Integer tempTrgtGrpRid;

    @Column(name = "temp_trgt_grp_name")
    private String tempTrgtGrpName;

    @Column(name = "temp_trgt_speciality_index")
    private Integer tempTrgtSpecialityIndex;

    @Column(name = "ser_is_manual_test")
    private Boolean isManualTest;

    @Column(name = "ser_result_expected_time")
    private Integer resultExpectedTime;

    @Column(name = "ser_explicit_conversion_req")
    private Integer explicitConversionReq;

    @Column(name = "port_id")
    private Integer portId;

    @Column(name = "old_ser_rid")
    private Integer oldSerRid;

    @Column(name = "ser_allow_zero_price_in_bill")
    private Boolean allowZeroPriceInBill;

    @Column(name = "ser_can_append_desc")
    private Integer canAppendDesc;

    @Column(name = "ser_cust_classification_index")
    private Integer custClassificationIndex;

    @Column(name = "ser_grp_parent_rid")
    private Integer grpParentRid;

    @Column(name = "ser_nursing_station_task")
    private Integer nursingStationTask;

    @Column(name = "ser_is_STI_based")
    private Boolean isSTIBased;

    @Column(name = "ser_is_available_across_all_entitys")
    private Boolean isAvailableAcrossAllEntitys;

    @Column(name = "temp_new_ser_rid")
    private Integer tempNewSerRid;

    @Column(name = "ser_staff_specific")
    private Integer staffSpecific;

    @Column(name = "ser_billing_clearance_required")
    private Integer billingClearanceRequired;

    @Column(name = "ser_price_editable_processing")
    private Integer priceEditableProcessing;

    @Column(name = "ser_staff_sub_category")
    private Integer staffSubCategory;

    @Column(name = "ser_dummy_1")
    private Integer dummy1;

    @Column(name = "ser_speciality_index")
    private Integer specialityIndex;

    @Column(name = "ser_is_gender_specific")
    private Integer isGenderSpecific;

    @Column(name = "ser_gender_index")
    private Integer genderIndex;

    @Column(name = "ser_is_pregnancy_closing")
    private Integer isPregnancyClosing;

    @Column(name = "ser_custom_rid")
    private Integer customRid;

    @Column(name = "ser_is_externally_processed")
    private Integer isExternallyProcessed;

    @Column(name = "ser_ref_doctor_share")
    private Float refDoctorShare;

    @Column(name = "ser_ord_doctor_share")
    private Float ordDoctorShare;

    @Column(name = "ser_proc_doc_share_is_percentage")
    private Boolean procDocShareIsPercentage;

    @Column(name = "ser_ref_doc_share_is_percentage")
    private Boolean refDocShareIsPercentage;

    @Column(name = "ser_ord_doc_share_is_percentage")
    private Boolean ordDocShareIsPercentage;

    @Column(name = "ser_is_revenue_sharing_applicable")
    private Boolean isRevenueSharingApplicable;

    @Column(name = "ser_staff_category")
    private Integer staffCategory;

    @Column(name = "ser_est_len_of_stay_in_hospital")
    private Integer estLenOfStayInHospital;

    @Column(name = "ser_created_datetime")
    private Date createdDatetime;

    @Column(name = "ser_template_rid")
    private Integer templateRid;

    @Column(name = "ser_declaration_required")
    private Short declarationRequired;

    @Column(name = "ser_admit_before_proc_hrs")
    private Integer admitBeforeProcHrs;

    @Column(name = "ser_modality_index")
    private Integer modalityIndex;

    @Column(name = "ser_modality_code")
    private String modalityCode;

    @Column(name = "temp_trgt_grp_parent_rid")
    private Integer tempTrgtGrpParentRid;

    @Column(name = "ser_is_form_based")
    private Short isFormBased;

    @Column(name = "ser_accounting_Code")
    private String accountingCode;

    @Column(name = "ser_ts_rid")
    private Integer tsRid;

    @Column(name = "temp_old_ser_parent_grp_rid")
    private Integer tempOldSerParentGrpRid;

    @Column(name = "temp_ser_parent_grp_name")
    private String tempSerParentGrpName;

    @Column(name = "temp_old_ser_sub_grp_rid")
    private Integer tempOldSerSubGrpRid;

    @Column(name = "temp_ser_sup_grp_name")
    private String tempSerSupGrpName;

    @Column(name = "ser_grid_code")
    private String gridCode;

    @Column(name = "ser_grid_name")
    private String gridName;

    @Column(name = "ser_hcpcs_code")
    private String hcpcsCode;

    @Column(name = "ser_add_charges_to_post")
    private String addChargesToPost;

    @Column(name = "ser_grade")
    private Integer grade;

    @Column(name = "temp_group_code")
    private String tempGroupCode;

    @Column(name = "temp_parent_group_code")
    private String tempParentGroupCode;

    @Column(name = "ser_sum_of_prices_of_linked_services")
    private Short sumOfPricesOfLinkedServices;

    @Column(name = "ser_is_care_package")
    private Integer isCarePackage;

    @Column(name = "ser_charge_type")
    private Integer chargeType;

    @Column(name = "ser_document_map")
    private String documentMap;

    @Column(name = "ser_is_system_charge")
    private Boolean isSystemCharge;

    @Column(name = "ser_doctor_can_perform")
    private Boolean doctorCanPerform;

    @Column(name = "ser_cpt_code")
    private String cptCode;

    @Column(name = "ser_proc_type_index")
    private Integer procTypeIndex;

    @Column(name = "ser_is_consent_required")
    private Integer isConsentRequired;
}
