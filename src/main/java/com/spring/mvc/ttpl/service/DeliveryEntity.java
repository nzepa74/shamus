package com.spring.mvc.ttpl.service;

import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by nzepa on 2/25/2020.
 */
@Entity
@Table(name = "delivery")
public class DeliveryEntity {

    @Id
    @Column(name = "cidNumber")
    private String cidNumber;

    @Column(name = "senderName")
    private String senderName;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "itemName")
    private String itemName;

    @Column(name = "placeFrom")
    private String placeFrom;

    @Column(name = "placeTo")
    private String placeTo;

    @Column(name = "distance")
    private BigDecimal distance;

    @Column(name = "itemWeight")
    private BigDecimal itemWeight;

    @Column(name = "receiverName")
    private String receiverName;

    @Column(name = "mobileNumber1")
    private String mobileNumber1;

    @Column(name = "location")
    private String location;

    @Column(name = "driverName")
    private String driverName;

    @Column(name = "vechileNumber")
    private String vechileNumber;

    @Column(name = "deliveryStatus")
    private Character deliveryStatus;

    @Column(name = "setDate")
    private Date setDate;

    public String getCidNumber() {
        return cidNumber;
    }

    public void setCidNumber(String cidNumber) {
        this.cidNumber = cidNumber;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPlaceFrom() {
        return placeFrom;
    }

    public void setPlaceFrom(String placeFrom) {
        this.placeFrom = placeFrom;
    }

    public String getPlaceTo() {
        return placeTo;
    }

    public void setPlaceTo(String placeTo) {
        this.placeTo = placeTo;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public BigDecimal getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(BigDecimal itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getMobileNumber1() {
        return mobileNumber1;
    }

    public void setMobileNumber1(String mobileNumber1) {
        this.mobileNumber1 = mobileNumber1;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVechileNumber() {
        return vechileNumber;
    }

    public void setVechileNumber(String vechileNumber) {
        this.vechileNumber = vechileNumber;
    }

    public Character getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Character deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }
}
