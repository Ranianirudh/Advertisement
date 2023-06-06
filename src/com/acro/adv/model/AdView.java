package com.acro.adv.model;

import java.time.LocalDate;

public class AdView {
    Long advId;
    Long platformId;
    Long regionId;
    Long countryId;
    LocalDate adViewDate;
    Double viewDuration;

    public AdView(Long advId, Long platformId,
                  Long regionId, Long countryId, LocalDate adViewDate, Double viewDuration) {
        this.advId = advId;
        this.platformId = platformId;
        this.regionId = regionId;
        this.countryId = countryId;
        this.adViewDate = adViewDate;
        this.viewDuration = viewDuration;
    }

    public Long getAdvId() {
        return advId;
    }

    public void setAdvId(Long advId) {
        this.advId = advId;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public LocalDate getAdViewDate() {
        return adViewDate;
    }

    public void setAdViewDate(LocalDate adViewDate) {
        this.adViewDate = adViewDate;
    }

    public Double getViewDuration() {
        return viewDuration;
    }

    public void setViewDuration(Double viewDuration) {
        this.viewDuration = viewDuration;
    }
}
