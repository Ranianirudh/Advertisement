package com.acro.adv.model;

public class Country {
    //country_id` INT NOT NULL,
    //  `country_name` VARCHAR(45) NULL,
    //  `country_code` INT NULL,
    //  `region_id` INT NOT NULL,
    //  PRIMARY KEY (`country_id`),
    //  INDEX `region_id_idx` (`region_id` ASC) VISIBLE,
    //  CONSTRAINT `region_id`
    //    FOREIGN KEY (`region_id`)
    //    REFERENCES `advrtisement`.`region` (`region_id`)
    int countryId;
    String countryName;
    int countryCode;
   Region region;

    public Country(int countryId, String countryName, int countryCode, Region region) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.region = region;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
