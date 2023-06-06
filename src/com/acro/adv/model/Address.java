package com.acro.adv.model;

public class Address {
    Long addressId;
    String streetName;
    String city;
    String primaryAddress;
    String secondaryAddress;
    Long companyId;

    public Address(Long addressId, String streetName, String city, String primaryAddress, String secondaryAddress, Long companyId) {
        this.addressId = addressId;
        this.streetName = streetName;
        this.city = city;
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
        this.companyId = companyId;
    }


    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(String primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(String secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
