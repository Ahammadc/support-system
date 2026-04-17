package com.medicssupport.support.clinical.investigation.transaction.service.worklist;

import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetailConstants;
import com.medicssupport.support.clinical.investigation.transaction.service.worklist.model.ValidationCondition;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.function.Predicate;

@Configuration
public class WorklistStrategyConfig {

    @Bean
    public WorklistStrategy printOpSampleLabelsWorklistStrategy(@Qualifier("printOpSampleLabelsConditions") Map<String, ValidationCondition> printOpSampleLabelsConditions) {
        return new GenericWorklistStrategy(ResultDetailConstants.WL_PRINT_OP_SAMPLE_LABELS, printOpSampleLabelsConditions);
    }

    @Bean
    public WorklistStrategy acceptSampleWorklistStrategy(@Qualifier("acceptSampleConditions") Map<String, ValidationCondition> acceptSampleConditions) {
        return new GenericWorklistStrategy(ResultDetailConstants.WL_ACCEPT_SAMPLES, acceptSampleConditions);
    }

    @Bean
    public WorklistStrategy recordLabResultsWorklistStrategy(@Qualifier("recordLabResultsConditions") Map<String, ValidationCondition> recordLabResultsConditions) {
        return new GenericWorklistStrategy(ResultDetailConstants.WL_RECORD_LAB_RESULTS, recordLabResultsConditions);
    }

    @Bean
    public WorklistStrategy signLabResultsWorklistStrategy(@Qualifier("signLabResultsConditions") Map<String, ValidationCondition> signLabResultsConditions) {
        return new GenericWorklistStrategy(ResultDetailConstants.WL_SIGN_LAB_RESULTS, signLabResultsConditions);
    }
}
