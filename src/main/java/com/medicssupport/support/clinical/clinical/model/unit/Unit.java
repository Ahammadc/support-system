package com.medicssupport.support.clinical.clinical.model.unit;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "u_unit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_rid")
    private Integer unitRid;

    @Column(name = "unit_code", length = 10)
    private String unitCode;

    @Column(name = "unit_prefix", length = 30)
    private String unitPrefix;

    @Column(name = "unit_name", length = 50)
    private String unitName;

    @Column(name = "unit_ent_rid")
    private Integer unitEntRid;

    @Column(name = "unit_parent_rid")
    private Integer unitParentRid;

    @Column(name = "unit_head")
    private Integer unitHead;

    @Column(name = "unit_work_hrs_from")
    private LocalTime unitWorkHrsFrom;

    @Column(name = "unit_work_hrs_to")
    private LocalTime unitWorkHrsTo;

    @Column(name = "unit_has_beds")
    private Integer unitHasBeds;

    @Column(name = "unit_is_substore")
    private Integer unitIsSubstore;

    @Column(name = "unit_is_main_store")
    private Integer unitIsMainStore;

    @Column(name = "unit_valid")
    private Boolean unitValid;

    @Column(name = "unit_mod_user_rid")
    private Integer unitModUserRid;

    @Column(name = "unit_mod_datetime")
    private LocalDateTime unitModDatetime;

    @Column(name = "unit_is_department")
    private Integer unitIsDepartment;

    @Column(name = "unit_is_clinical")
    private Integer unitIsClinical;

    @Column(name = "unit_can_make_grn")
    private Integer unitCanMakeGRN;

    @Column(name = "unit_disp_name", length = 50)
    private String unitDispName;

    @Column(name = "unit_street", length = 255)
    private String unitStreet;

    @Column(name = "unit_city")
    private Integer unitCity;

    @Column(name = "unit_state")
    private Integer unitState;

    @Column(name = "unit_country")
    private Integer unitCountry;

    @Column(name = "unit_pin_code")
    private Integer unitPinCode;

    @Column(name = "unit_phone", length = 100)
    private String unitPhone;

    @Column(name = "unit_tin_no", length = 100)
    private String unitTinNo;

    @Column(name = "unit_dl_no", length = 200)
    private String unitDlNo;

    @Column(name = "unit_dl_valid_upto")
    private LocalDate unitDlValidUpto;

    @Column(name = "unit_is_def_op_pharmacy")
    private Integer unitIsDefOpPharmacy;

    @Column(name = "unit_is_def_ip_pharmacy")
    private Integer unitIsDefIpPharmacy;

    @Column(name = "unit_is_def_op_material")
    private Integer unitIsDefOpMaterial;

    @Column(name = "unit_is_def_ip_material")
    private Integer unitIsDefIpMaterial;

    @Column(name = "unit_is_external")
    private Integer unitIsExternal;

    @Column(name = "unit_is_service_provider")
    private Integer unitIsServiceProvider;

    @Column(name = "unit_is_purchasing")
    private Integer unitIsPurchasing;

    @Column(name = "unit_can_process_indent")
    private Integer unitCanProcessIndent;

    @Column(name = "unit_cst_no", length = 100)
    private String unitCstNo;

    @Column(name = "unit_type_index")
    private Integer unitTypeIndex;

    @Column(name = "unit_category")
    private Integer unitCategory;

    @Column(name = "unit_cost_center_rid")
    private Integer unitCostCenterRid;

    @Column(name = "unit_is_surgical")
    private Integer unitIsSurgical;

    @Column(name = "unit_is_purchase_taxable")
    private Integer unitIsPurchaseTaxable;

    @Column(name = "unit_tracks_patient_delay")
    private Integer unitTracksPatientDelay;

    @Column(name = "unit_is_emergency")
    private Integer unitIsEmergency;

    @Column(name = "unit_stock_keeping_unit_rid")
    private Integer unitStockKeepingUnitRid;

    @Column(name = "unit_is_taxable")
    private Integer unitIsTaxable;

    @Column(name = "unit_is_neonatal")
    private Integer unitIsNeonatal;

    @Column(name = "unit_is_billing")
    private Integer unitIsBilling;

    @Column(name = "unit_require_mrd_request")
    private Integer unitRequireMrdRequest;

    @Column(name = "unit_dummy_1")
    private Integer unitDummy1;

    @Column(name = "unit_record_exist", length = 10)
    private String unitRecordExist;

    @Column(name = "unit_reg_no", length = 50)
    private String unitRegNo;

    @Column(name = "unit_service_tax_number", length = 128)
    private String unitServiceTaxNumber;

    @Column(name = "unit_pan_number", length = 128)
    private String unitPanNumber;

    @Column(name = "record_exist")
    private Integer recordExist;

    @Column(name = "unit_is_sterilization")
    private Integer unitIsSterilization;

    @Column(name = "unit_sample_collecting_unit")
    private Integer unitSampleCollectingUnit;

    @Column(name = "unit_email_id", length = 100)
    private String unitEmailId;

    @Column(name = "unit_speciality_index")
    private Integer unitSpecialityIndex;

    @Column(name = "unit_can_place_hp_orders")
    private Integer unitCanPlaceHpOrders;

    @Column(name = "unit_has_virtual_bed")
    private Integer unitHasVirtualBed;

    @Column(name = "unit_bed_virtual_prefix", length = 10)
    private String unitBedVirtualPrefix;

    @Column(name = "unit_order_default_hp")
    private Integer unitOrderDefaultHp;

    @Column(name = "unit_is_location")
    private Integer unitIsLocation;

    @Column(name = "unit_default_sample_collecting")
    private Short unitDefaultSampleCollecting;

    @Column(name = "unit_color_code", length = 11)
    private String unitColorCode;
}