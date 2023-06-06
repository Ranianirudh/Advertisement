package com.acro.adv.model;

import java.util.Date;

public class AdvPlatformRegion {
    Long advId;
    Date advDate;
    Long platformId;
    Long regionId;

    public AdvPlatformRegion(Long advId, Date advDate, Long platformId, Long regionId) {
        this.advId = advId;
        this.advDate = advDate;
        this.platformId = platformId;
        this.regionId = regionId;
    }

    public Long getAdvId() {
        return advId;
    }

    public void setAdvId(Long advId) {
        this.advId = advId;
    }

    public Date getAdvDate() {
        return advDate;
    }

    public void setAdvDate(Date advDate) {
        this.advDate = advDate;
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
}
