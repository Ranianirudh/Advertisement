package com.acro.adv.model;

public enum Region {
    //CREATE TABLE `advrtisement`.`region` (
    //  `region_id` INT NOT NULL,
    //  `region_name` VARCHAR(45) NULL,
    //  `region_code` VARCHAR(45) NULL,
    //  PRIMARY KEY (`region_id`));

    APAC(1, "Asia Pacific"),           //Asia pacific
    EMEA(2, "Europe/Middle East/Africa"),
    LAD(3, "Latin America"),            //
    NA(4, "North America")            //Americas
    ;

    final int id;
    final String regionName;
    Region(int id, String regionName) {
        this.id = id;
        this.regionName = regionName;
    }
    public String getRegionCode() {
        return this.name();
    }

    public int getId() {
        return id;
    }

    public String getRegionName() {
        return regionName;
    }
}
