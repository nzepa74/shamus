package com.spring.mvc.ttpl.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by nzepa on 2/25/2020.
 */

@Entity
@Table(name = "tpnRegistration")
public class TaxPayerRegistrationEntity {

    @Id
    @Column(name = "tpn")
    private String tpn;

    @Column(name = "taxPayerName")
    private String taxPayerName;

    @Column(name = "cidNo")
    private String cidNo;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "mobileNo")
    private String mobileNo;

    @Column(name = "designation")
    private String designation;

    @Column(name = "workingAgency")
    private String workingAgency;

    @Column(name = "setDate")
    private Date setDate;

    @Column(name = "tpnSecondary")
    private String tpnSecondary;

    public String getTpnSecondary() {
        return tpnSecondary;
    }

    public void setTpnSecondary(String tpnSecondary) {
        this.tpnSecondary = tpnSecondary;
    }

    public String getTpn() {
        return tpn;
    }

    public void setTpn(String tpn) {
        this.tpn = tpn;
    }

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

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }
}
