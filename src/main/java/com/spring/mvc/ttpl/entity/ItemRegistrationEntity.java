package com.spring.mvc.ttpl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by nzepa on 2/17/2020.
 */
@Entity
@Table(name = "item")
public class ItemRegistrationEntity {

    @Id
    @Column(name = "itemCode")
    private String itemCode;

    @Column(name = "itemName")
    private String itemName;

    @Column(name = "itemBrand")
    private String itemBrand;

    @Column(name = "itemModel")
    private String itemModel;

    @Column(name = "mfgDate")
    private Date mfgDate;

    @Column(name = "expiryDate")
    private Date expiryDate;

    @Column(name = "itemStatus")
    private Character itemStatus;

    @Column(name = "registrationDate")
    private Date registrationDate;

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String itemModel) {
        this.itemModel = itemModel;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Character getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Character itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
