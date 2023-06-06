package com.acro.adv.request;

import java.time.LocalDate;

public class AdvRequest {
    Long advId;
    String advName;
    Long companyId;
    Long contentId;
    LocalDate publishedDate;
    LocalDate endDate;
    String contentName;
    String contentFile;
    LocalDate createdDate;
    String contentType;
    double contentDuration;

    public AdvRequest(Long advId, String advName, Long companyId, Long contentId, LocalDate publishedDate, LocalDate endDate,
                      String contentName, String contentFile, LocalDate createdDate, String contentType, double contentDuration) {
        this.advId = advId;
        this.advName = advName;
        this.companyId = companyId;
        this.contentId = contentId;
        this.publishedDate = publishedDate;
        this.endDate = endDate;
        this.contentName = contentName;
        this.contentFile = contentFile;
        this.createdDate = createdDate;
        this.contentType = contentType;
        this.contentDuration = contentDuration;
    }

    public Long getAdvId() {
        return advId;
    }

    public void setAdvId(Long advId) {
        this.advId = advId;
    }

    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
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
}


