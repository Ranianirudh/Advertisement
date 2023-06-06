package com.acro.adv.request;

import java.time.LocalDate;
import java.util.List;

public class AdvertisementRequest {
    Long advId;
    String advName;
    Long companyId;
    LocalDate publishedDate;
    List<ContentRequest> contentRequests;

    public AdvertisementRequest() {
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

    public List<ContentRequest> getContentRequests() {
        return contentRequests;
    }

    public void setContentRequests(List<ContentRequest> contentRequests) {
        this.contentRequests = contentRequests;
    }

}
