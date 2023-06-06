package com.acro.adv.model;

public class Platform {
   Long platformId;
   String platformName;
   String platformType;

    public Platform(Long platformId, String platformName, String platformType) {
        this.platformId = platformId;
        this.platformName = platformName;
        this.platformType = platformType;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }
}
