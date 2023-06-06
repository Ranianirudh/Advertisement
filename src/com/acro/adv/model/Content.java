package com.acro.adv.model;

import java.time.LocalDate;

public class Content {
    Long contentId;
    String contentName;
    String contentFile;
    LocalDate createdDate;
    String contentType;
    double contentDuration;
    Long companyId;
    Long staffId;
    boolean isInternal;
    Long advId;

    public Content() {
    }

    public Content(Long contentId, String contentName, String contentFile, LocalDate createdDate,
                   String contentType, double contentDuration, Long companyId, Long staffId, boolean isInternal) {
        this.contentId = contentId;
        this.contentName = contentName;
        this.contentFile = contentFile;
        this.createdDate = createdDate;
        this.contentType = contentType;
        this.contentDuration = contentDuration;
        this.companyId = companyId;
        this.staffId = staffId;
        this.isInternal = isInternal;
    }

    public Content(String contentName, String contentFile, LocalDate createdDate,
                   String contentType,double contentDuration, Long companyId, Long staffId, boolean isInternal) {
        this.contentName = contentName;
        this.contentFile = contentFile;
        this.createdDate = createdDate;
        this.contentType = contentType;
        this.contentDuration = contentDuration;
        this.companyId = companyId;
        this.staffId = staffId;
        this.isInternal = isInternal;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getContentFile() {
        return contentFile;
    }

    public void setContentFile(String contentFile) {
        this.contentFile = contentFile;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public double getContentDuration() {
        return contentDuration;
    }

    public void setContentDuration(double contentDuration) {
        this.contentDuration = contentDuration;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public boolean isInternal() {
        return isInternal;
    }

    public void setInternal(boolean internal) {
        isInternal = internal;
    }

    public Long getAdvId() {
        return advId;
    }

    public void setAdvId(Long advId) {
        this.advId = advId;
    }
}
