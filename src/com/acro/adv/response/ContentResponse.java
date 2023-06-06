package com.acro.adv.response;

import java.time.LocalDate;

public class ContentResponse {
    Long contentId;
    String contentName;
    String contentFile;
    LocalDate createdDate;
    String contentType;
    double contentDuration;
    Long companyId;
    Long staffId;
    Long advId;

    public ContentResponse() {
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

    public Long getAdvId() {
        return advId;
    }

    public void setAdvId(Long advId) {
        this.advId = advId;
    }

    @Override
    public String toString() {
        return "ContentResponse{" +
                "contentId=" + contentId +
                ", contentName='" + contentName + '\'' +
                ", contentFile='" + contentFile + '\'' +
                ", createdDate=" + createdDate +
                ", contentType='" + contentType + '\'' +
                ", contentDuration=" + contentDuration +
                ", companyId=" + companyId +
                ", staffId=" + staffId +
                ", advId=" + advId +
                '}';
    }
}
