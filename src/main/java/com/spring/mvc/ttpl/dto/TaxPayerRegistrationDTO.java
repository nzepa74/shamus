package com.spring.mvc.ttpl.dto;

import java.util.Date;

/**
 * Created by nzepa on 2/25/2020.
 */
public class TaxPayerRegistrationDTO {
    private String taxPayerName;
    private String cidNo;
    private Date dob;
    private String mobileNo;
    private String designation;
    private String workingAgency;

    public String getTaxPayerName() {
        return taxPayerName;
    }

    public void setTaxPayerName(String taxPayerName) {
        this.taxPayerName = taxPayerName;
    }

    public String getCidNo() {
        return cidNo;
    }

    public void setCidNo(String cidNo) {
        this.cidNo = cidNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getWorkingAgency() {
        return workingAgency;
    }

    public void setWorkingAgency(String workingAgency) {
        this.workingAgency = workingAgency;
    }
}
