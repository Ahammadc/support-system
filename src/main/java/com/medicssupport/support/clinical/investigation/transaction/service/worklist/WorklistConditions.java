package com.medicssupport.support.clinical.investigation.transaction.service.worklist;

import com.medicssupport.support.clinical.clinical.model.unit.Unit;
import com.medicssupport.support.clinical.clinical.model.visit.Visit;
import com.medicssupport.support.clinical.clinical.repository.UnitRepository;
import com.medicssupport.support.clinical.clinical.repository.VisitRepository;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMaster;
import com.medicssupport.support.clinical.investigation.master.repository.ServiceMasterRepository;
import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSample;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrder;
import com.medicssupport.support.clinical.investigation.transaction.service.worklist.model.ValidationCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

import static com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrderConstants.STATE_INACTIVE_FUTURE_ORDERS;

@Configuration
public class WorklistConditions {

    private final UnitRepository unitRepository;
    private final VisitRepository visitRepository;
    private final ServiceMasterRepository serviceMasterRepository;
    private final int ENTITY_RID = 1; // Assuming entity RID is 1

    public WorklistConditions(UnitRepository unitRepository, VisitRepository visitRepository, ServiceMasterRepository serviceMasterRepository) {
        this.unitRepository = unitRepository;
        this.visitRepository = visitRepository;
        this.serviceMasterRepository = serviceMasterRepository;
    }

    @Bean("printOpSampleLabelsConditions")
    public Map<String, ValidationCondition> printOpSampleLabelsConditions() {
        Map<String, ValidationCondition> conditions = new LinkedHashMap<>();

        conditions.put("rdSerTypeEquals21977", new ValidationCondition(
                "Service type",
                rd -> Objects.equals(rd.getRdSerType(), 21977),
                rd -> rd.getRdSerType().toString(),
                "This is not Lab service",
                "Wrong configuration",
                "",
                false,
                ""
        ));

        conditions.put("entityRidMatches", new ValidationCondition(
                "Entity",
                rd -> {
                    ServiceOrder so = rd.getServiceOrder();
                    if (so == null) return false;
                    Integer sampleCollectingUnitRid = so.getSoSampleCollectingUnit();
                    if (sampleCollectingUnitRid == null || sampleCollectingUnitRid == 0) {
                        return rd.getRdEntityRid() != 0;
                    } else {
                        Optional<Unit> unitOptional = unitRepository.findById(sampleCollectingUnitRid);
                        return unitOptional.map(unit -> unit.getUnitEntRid() != 0).orElse(false);
                    }
                },
                rd -> {
                    ServiceOrder so = rd.getServiceOrder();
                    if (so == null) return "Unknown";
                    Integer sampleCollectingUnitRid = so.getSoSampleCollectingUnit();
                    if (sampleCollectingUnitRid == null || sampleCollectingUnitRid == 0) {
                        return rd.getRdEntityRid().toString();
                    } else {
                        Optional<Unit> unitOptional = unitRepository.findById(sampleCollectingUnitRid);
                        return unitOptional.map(unit -> unit.getUnitEntRid().toString()).orElse("Unknown");
                    }
                },
                "Entity rid missing",
                "System issue",
                "Inform this issue to technical team",
                true,
                "Check in the %s entity"
        ));

        conditions.put("sampleCollectingUnitNotZero", new ValidationCondition(
                "Sample collecting unit",
                rd -> rd.getServiceOrder() != null && !Objects.equals(rd.getServiceOrder().getSoSampleCollectingUnit(), 0),
                rd -> {
                    Optional<Unit> unitOptional = unitRepository.findById(rd.getServiceOrder().getSoSampleCollectingUnit());
                    return unitOptional.isPresent() ? unitOptional.get().getUnitName() : "Unknown";
                },
                "Sample collection unit is missing",
                "System issue",
                "Inform this issue to technical team",
                true,
                "Check the %s unit is assigned to the login staff"
        ));

        conditions.put("rdStatusIs2", new ValidationCondition(
                "Lab status",
                rd -> rd.getRdStatus() != null && (rd.getRdStatus() & 2) == 2,
                rd -> rd.getRdStatus() != null ? rd.getRdStatus().toString() : "Unknown",
                "Wrong Lab status updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStatusIs8Or32", new ValidationCondition(
                "Order status",
                rd -> {
                    ServiceOrder so = rd.getServiceOrder();
                    if (so == null || so.getSoStatus() == null) return false;
                    int status = so.getSoStatus();
                    return (status & 8) == 8 || (status & 32) == 32;
                },
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStatus() != null ? rd.getServiceOrder().getSoStatus().toString() : "Unknown",
                "Wrong order status updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStateNotInactive", new ValidationCondition(
                "Order state",
                rd -> rd.getServiceOrder() != null && !Objects.equals(rd.getServiceOrder().getSoState(), STATE_INACTIVE_FUTURE_ORDERS),
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoState() != null ? rd.getServiceOrder().getSoState().toString() : "Unknown",
                "Wrong order state updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStartDateNotNull", new ValidationCondition(
                "Order date",
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStartDate() != null,
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStartDate() != null ? rd.getServiceOrder().getSoStartDate().toString() : "Missing",
                "Order date is missing",
                "System issue",
                "Inform this issue to technical team",
                true,
                "Work list date is %s"
        ));

        conditions.put("visitTypeIs19602", new ValidationCondition(
                "Visit type",
                rd -> {
                    if (rd.getRdVisitRid() == null) return false;
                    Integer visitType = visitRepository.findVisitTypeIndexByVisitRid(rd.getRdVisitRid());
                    return Objects.equals(visitType, 19602);
                },
                rd -> {
                    if (rd.getRdVisitRid() == null) return "Unknown";
                    Integer visitType = visitRepository.findVisitTypeIndexByVisitRid(rd.getRdVisitRid());
                    return visitType.toString();
                },
                "This is not OP visit type",
                "Wrong configuration",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("smStateIsNullor3", new ValidationCondition(
                "Sample state",
                rd -> {
                    OrderSample os = rd.getOrderSample();
                    return os == null || os.getSmState() == null || Objects.equals(os.getSmState(), 3);
                },
                rd -> {
                    OrderSample os = rd.getOrderSample();
                    return os != null && os.getSmState() != null ? os.getSmState().toString() : "Blank";
                },
                "Wrong sample state updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soTokenNumberNotReassigned", new ValidationCondition(
                "Order token number",
                rd -> rd.getServiceOrder() != null && Objects.equals(rd.getServiceOrder().getSoIsTokenNumberReassigned(), 0),
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoIsTokenNumberReassigned() != null ? rd.getServiceOrder().getSoIsTokenNumberReassigned().toString() : "Unknown",
                "Wrong token number updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        return conditions;
    }

    @Bean("acceptSampleConditions")
    public Map<String, ValidationCondition> acceptSampleConditions() {
        Map<String, ValidationCondition> conditions = new LinkedHashMap<>();

        conditions.put("rdSerTypeEquals21977", new ValidationCondition(
                "Service type",
                rd -> Objects.equals(rd.getRdSerType(), 21977),
                rd -> rd.getRdSerType() != null ? rd.getRdSerType().toString() : "Missing",
                "This is not Lab service",
                "Wrong configuration",
                "",
                false,
                ""
        ));

        conditions.put("rdStatusIs2", new ValidationCondition(
                "Lab status",
                rd -> rd.getRdStatus() != null && (rd.getRdStatus() & 2) == 2,
                rd -> rd.getRdStatus() != null ? rd.getRdStatus().toString() : "Unknown",
                "Wrong Lab status updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStatusIs8Or32", new ValidationCondition(
                "Order status",
                rd -> {
                    ServiceOrder so = rd.getServiceOrder();
                    if (so == null || so.getSoStatus() == null) return false;
                    int status = so.getSoStatus();
                    return (status & 8) == 8 || (status & 32) == 32;
                },
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStatus() != null ? rd.getServiceOrder().getSoStatus().toString() : "Unknown",
                "Wrong order status updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStateNotInactive", new ValidationCondition(
                "Order state",
                rd -> rd.getServiceOrder() != null && !Objects.equals(rd.getServiceOrder().getSoState(), STATE_INACTIVE_FUTURE_ORDERS),
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoState() != null ? rd.getServiceOrder().getSoState().toString() : "Unknown",
                "Wrong order state updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStartDateNotNull", new ValidationCondition(
                "Order date",
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStartDate() != null,
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStartDate() != null ? rd.getServiceOrder().getSoStartDate().toString() : "Missing",
                "Order date is missing",
                "System issue",
                "Inform this issue to technical team",
                true,
                "Work list date is %s"
        ));

        conditions.put("rdProcessingEntityRidIs359", new ValidationCondition(
                "Processing entity",
                rd -> Objects.equals(rd.getRdProcessingEntityRid(), 359),
                rd -> rd.getRdProcessingEntityRid() != null ? rd.getRdProcessingEntityRid().toString() : "Missing",
                "Processing entity rid is incorrect",
                "Wrong configuration",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("smStateIs6", new ValidationCondition(
                "Sample state",
                rd -> {
                    OrderSample os = rd.getOrderSample();
                    return os != null && Objects.equals(os.getSmState(), 6);
                },
                rd -> {
                    OrderSample os = rd.getOrderSample();
                    return os != null && os.getSmState() != null ? os.getSmState().toString() : "Blank";
                },
                "Wrong sample state updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        return conditions;
    }

    @Bean("recordLabResultsConditions")
    public Map<String, ValidationCondition> recordLabResultsConditions() {
        Map<String, ValidationCondition> conditions = new LinkedHashMap<>();

        conditions.put("rdSerTypeEquals21977", new ValidationCondition(
                "Service type",
                rd -> Objects.equals(rd.getRdSerType(), 21977),
                rd -> rd.getRdSerType() != null ? rd.getRdSerType().toString() : "Missing",
                "This is not Lab service",
                "Wrong configuration",
                "",
                false,
                ""
        ));

        conditions.put("rdSerCenterRidNotNullAndNotZero", new ValidationCondition(
                "Service center",
                rd -> rd.getRdSerCenterRid() != null && rd.getRdSerCenterRid() != 0,
                rd -> {
                    if (rd.getRdSerCenterRid() == null) return "Missing";
                    Optional<Unit> unitOptional = unitRepository.findById(rd.getRdSerCenterRid());
                    return unitOptional.map(Unit::getUnitName).orElse(rd.getRdSerCenterRid().toString());
                },
                "Service center is missing",
                "System issue",
                "Inform this issue to technical team",
                true,
                "Check the %s unit is assigned to the login staff"
        ));

        conditions.put("rdStatusIs4Or8", new ValidationCondition(
                "Lab status",
                rd -> rd.getRdStatus() != null && ((rd.getRdStatus() & 4) == 4 || (rd.getRdStatus() & 8) == 8),
                rd -> rd.getRdStatus() != null ? rd.getRdStatus().toString() : "Unknown",
                "Wrong Lab status updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStatusIs8Or32", new ValidationCondition(
                "Order status",
                rd -> {
                    ServiceOrder so = rd.getServiceOrder();
                    if (so == null || so.getSoStatus() == null) return false;
                    int status = so.getSoStatus();
                    return (status & 8) == 8 || (status & 32) == 32;
                },
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStatus() != null ? rd.getServiceOrder().getSoStatus().toString() : "Unknown",
                "Wrong order status updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStateNotInactive", new ValidationCondition(
                "Order state",
                rd -> rd.getServiceOrder() != null && !Objects.equals(rd.getServiceOrder().getSoState(), STATE_INACTIVE_FUTURE_ORDERS),
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoState() != null ? rd.getServiceOrder().getSoState().toString() : "Unknown",
                "Wrong order state updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("rdStateIs0Or2", new ValidationCondition(
                "Lab state",
                rd -> rd.getRdState() != null && (Objects.equals(rd.getRdState(), 0) || Objects.equals(rd.getRdState(), 2)),
                rd -> rd.getRdState() != null ? rd.getRdState().toString() : "Unknown",
                "Wrong Lab state updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStartDateNotNull", new ValidationCondition(
                "Order date",
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStartDate() != null,
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStartDate() != null ? rd.getServiceOrder().getSoStartDate().toString() : "Missing",
                "Order date is missing",
                "System issue",
                "Inform this issue to technical team",
                true,
                "Work list date is %s"
        ));

        conditions.put("serSubTypeIndexIs0", new ValidationCondition(
                "Service sub type",
                rd -> {
                    if (rd.getRdServiceRid() == null) return false;
                    Optional<ServiceMaster> serviceOptional = serviceMasterRepository.findById(rd.getRdServiceRid());
                    return serviceOptional.map(service -> Objects.equals(service.getSubTypeIndex(), 0)).orElse(false);
                },
                rd -> {
                    if (rd.getRdServiceRid() == null) return "Missing";
                    Optional<ServiceMaster> serviceOptional = serviceMasterRepository.findById(rd.getRdServiceRid());
                    return serviceOptional.map(service -> service.getSubTypeIndex() != null ? service.getSubTypeIndex().toString() : "Blank").orElse("Unknown");
                },
                "Wrong service sub type",
                "Wrong configuration",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("rdProcessingEntityRidIs359", new ValidationCondition(
                "Processing entity",
                rd -> Objects.equals(rd.getRdProcessingEntityRid(), 359),
                rd -> rd.getRdProcessingEntityRid() != null ? rd.getRdProcessingEntityRid().toString() : "Missing",
                "Processing entity rid is incorrect",
                "Wrong configuration",
                "Inform this issue to technical team",
                false,
                ""
        ));

        return conditions;
    }

    @Bean("signLabResultsConditions")
    public Map<String, ValidationCondition> signLabResultsConditions() {
        Map<String, ValidationCondition> conditions = new LinkedHashMap<>();

        conditions.put("rdSerTypeEquals21977", new ValidationCondition(
                "Service type",
                rd -> Objects.equals(rd.getRdSerType(), 21977),
                rd -> rd.getRdSerType() != null ? rd.getRdSerType().toString() : "Missing",
                "This is not Lab service",
                "Wrong configuration",
                "",
                false,
                ""
        ));

        conditions.put("rdSerCenterRidNotNullAndNotZero", new ValidationCondition(
                "Service center",
                rd -> rd.getRdSerCenterRid() != null && rd.getRdSerCenterRid() != 0,
                rd -> {
                    if (rd.getRdSerCenterRid() == null) return "Missing";
                    Optional<Unit> unitOptional = unitRepository.findById(rd.getRdSerCenterRid());
                    return unitOptional.map(Unit::getUnitName).orElse(rd.getRdSerCenterRid().toString());
                },
                "Service center is missing",
                "System issue",
                "Inform this issue to technical team",
                true,
                "Check the %s unit is assigned to the login staff"
        ));

        conditions.put("rdStatusIs4Or8", new ValidationCondition(
                "Lab status",
                rd -> rd.getRdStatus() != null && ((rd.getRdStatus() & 4) == 4 || (rd.getRdStatus() & 8) == 8),
                rd -> rd.getRdStatus() != null ? rd.getRdStatus().toString() : "Unknown",
                "Wrong Lab status updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStatusIs8Or32", new ValidationCondition(
                "Order status",
                rd -> {
                    ServiceOrder so = rd.getServiceOrder();
                    if (so == null || so.getSoStatus() == null) return false;
                    int status = so.getSoStatus();
                    return (status & 8) == 8 || (status & 32) == 32;
                },
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStatus() != null ? rd.getServiceOrder().getSoStatus().toString() : "Unknown",
                "Wrong order status updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStateNotInactive", new ValidationCondition(
                "Order state",
                rd -> rd.getServiceOrder() != null && !Objects.equals(rd.getServiceOrder().getSoState(), STATE_INACTIVE_FUTURE_ORDERS),
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoState() != null ? rd.getServiceOrder().getSoState().toString() : "Unknown",
                "Wrong order state updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("rdStateIs8", new ValidationCondition(
                "Lab state",
                rd -> Objects.equals(rd.getRdState(), 8),
                rd -> rd.getRdState() != null ? rd.getRdState().toString() : "Unknown",
                "Wrong Lab state updated",
                "System issue",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("soStartDateNotNull", new ValidationCondition(
                "Order date",
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStartDate() != null,
                rd -> rd.getServiceOrder() != null && rd.getServiceOrder().getSoStartDate() != null ? rd.getServiceOrder().getSoStartDate().toString() : "Missing",
                "Order date is missing",
                "System issue",
                "Inform this issue to technical team",
                true,
                "Work list date is %s"
        ));

        conditions.put("serSubTypeIndexIs0", new ValidationCondition(
                "Service sub type",
                rd -> {
                    if (rd.getRdServiceRid() == null) return false;
                    Optional<ServiceMaster> serviceOptional = serviceMasterRepository.findById(rd.getRdServiceRid());
                    return serviceOptional.map(service -> Objects.equals(service.getSubTypeIndex(), 0)).orElse(false);
                },
                rd -> {
                    if (rd.getRdServiceRid() == null) return "Missing";
                    Optional<ServiceMaster> serviceOptional = serviceMasterRepository.findById(rd.getRdServiceRid());
                    return serviceOptional.map(service -> service.getSubTypeIndex() != null ? service.getSubTypeIndex().toString() : "Blank").orElse("Unknown");
                },
                "Wrong service sub type",
                "Wrong configuration",
                "Inform this issue to technical team",
                false,
                ""
        ));

        conditions.put("rdProcessingEntityRidIs359", new ValidationCondition(
                "Processing entity",
                rd -> Objects.equals(rd.getRdProcessingEntityRid(), 359),
                rd -> rd.getRdProcessingEntityRid() != null ? rd.getRdProcessingEntityRid().toString() : "Missing",
                "Processing entity rid is incorrect",
                "Wrong configuration",
                "Inform this issue to technical team",
                false,
                ""
        ));

        return conditions;
    }
}
