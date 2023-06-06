package com.acro.adv.response;

import java.time.LocalDate;
import java.util.List;

public class AdvertisementResponse {

    Long advId;
    String advName;
    Long companyId;
    LocalDate publishedDate;
    List<ContentResponse> contentResponses;

    public AdvertisementResponse() {
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

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public List<ContentResponse> getContentResponses() {
        return contentResponses;
    }

    public void setContentResponses(List<ContentResponse> contentResponses) {
        this.contentResponses = contentResponses;
    }

    @Override
    public String toString() {
        return "AdvertisementResponse{" +
                "advId=" + advId +
                ", advName='" + advName + '\'' +
                ", companyId=" + companyId +
                ", publishedDate=" + publishedDate +
                ", contentResponses=" + contentResponses +
                '}';
    }
}
