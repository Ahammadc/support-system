package com.medicssupport.support.clinical.investigation.transaction.model.service_report;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "uh_service_reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sr_rd_id")
    private Integer srRdId;

    @Column(name = "sr_rd_rid")
    private Integer srRdRid;

    @Lob
    @Column(name = "sr_rd_report", columnDefinition = "TEXT")
    private String srRdReport;

    @Column(name = "sr_tmpl_rid")
    private Integer srTmplRid;

    @Column(name = "sr_parent_rid")
    private Integer srParentRid;

    @Column(name = "sr_page_no")
    private Integer srPageNo;

    @Column(name = "sr_page_name", length = 50)
    private String srPageName;

    @Column(name = "sr_form_based")
    private Integer srFormBased;
}