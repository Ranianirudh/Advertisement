package com.acro.adv.model;

public class Staff {
    Long staffId;
    String staffName;
    String staffMail;

    public Staff(Long staffId, String staffName, String staffMail) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffMail = staffMail;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffMail() {
        return staffMail;
    }

    public void setStaffMail(String staffMail) {
        this.staffMail = staffMail;
    }
}
