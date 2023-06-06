package com.acro.adv.model;

import java.sql.Date;

public class Company {
    Long companyId;
    String companyName;
    String companyCode;
    int establishedYear;
    boolean isActive;
    Long addressId;

    public Company(Long companyId, String companyName, String companyCode, int establishedYear, boolean isActive, Long addressId) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyCode = companyCode;
        this.establishedYear = establishedYear;
        this.isActive = isActive;
        this.addressId = addressId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }


}
