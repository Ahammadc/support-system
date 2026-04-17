package com.medicssupport.support.clinical.investigation.transaction.model.result_detail;

import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSampleDTO;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservationDTO;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeaderDTO;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrderDTO;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReportDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDetailDTO {

    private Integer rdRid;
    private Integer rdAgainstUnitRid;
    private Integer rdPatientRid;
    private Integer rdVisitRid;
    private Integer rdUserRid;
    private Integer rdServiceRid;
    private String rdServiceName;
    private Integer rdSerType;
    private LocalDate rdTestDate;
    private Integer rdSerCenterRid;
    private Integer rdEntityRid;
    private String rdTestTime;
    private Integer rdTestParamRid;
    private String rdTestParamValue;
    private LocalDateTime rdOrderDate;
    private LocalDateTime rdModDate;
    private Integer rdModUserRid;
    private Integer rdOrderId;
    private Integer rdStatus;
    private String rdSampleId;
    private Integer rdSmRid;
    private Integer rdReportId;
    private Integer rdParentRid;
    private Integer rdRootParentRid;
    private Integer rdResultType;
    private Integer rdSequenceNo;
    private String rdParamUnit;
    private String rdParamRangeDescription;
    private Integer rdResultAbnormal;
    private String rdGroupName;
    private String rdRemarks;
    private String rdTechnologyUsed;
    private Integer rdAttachmentRid;
    private Integer rdState;
    private Integer rdCreatedUserRid;
    private LocalDateTime rdCreatedDatetime;
    private Integer rdInvalidated;
    private Integer rdHistoryRefRid;
    private Boolean rdIsManualTest;
    private Integer rdOldRefRdRid;
    private Integer rdDummyInt1;
    private String rdDummyVarchar1;
    private Integer rdReportPrintStatus;
    private Short rdUsedExistingSample;
    private Integer rdOldSmRid;
    private String rdDummyVarchar2;
    private String rdDummyVarchar3;
    private Integer rdReportDispatched;
    private String rdResultTechnicalNote;
    private Integer rdIsOldReport;
    private Integer rdWorksheetRid;
    private Integer rdIsOrganismIsolated;
    private String rdSampleCancellationReason;
    private String rdResultCancellationReason;
    private Short rdDeclarationRequired;
    private Integer rdTemplateRid;
    private Integer rdEquipmentRid;
    private String rdComputedNormalRange;
    private LocalDateTime rdModifiedDatetime;
    private String rdPatPhone;
    private Integer rdConsultingDocRid;
    private String rdConsultingDocName;
    private String rdVisitId;
    private Integer rdPatAge;
    private String rdPatAgeUnit;
    private Integer rdVisitTypeIndex;
    private String rdVisitTypeDesc;
    private String rdSourceId;
    private String rdSourceName;
    private Short rdSourceType;
    private String rdGenderName;
    private Integer rdSourceRid;
    private Integer rdIsActive;
    private String rdSourceEmail;
    private LocalDateTime rdSourceArrivalDatetime;

    private ServiceOrderDTO serviceOrder;
    private List<ResultObservationDTO> resultObservation;
    private OrderSampleDTO orderSample;
    private ResultReportHeaderDTO resultReportHeader;
    private ServiceReportDTO serviceReport;
}

