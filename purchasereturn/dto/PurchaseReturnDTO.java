package com.hdsoft.fsm.purchasereturn.dto;
import com.hdsoft.fsm.purchasereturn.model.PurchaseReturn;

import java.util.Objects;

public class PurchaseReturnDTO {

    private long id;
    private String vendorName;
    private String dateOfReturn;
    private String itemDetails;
    private String remarks;

    public PurchaseReturnDTO(){

    }

    public PurchaseReturnDTO(long id, String vendorName,String dateOfReturn, String itemDetails, String remarks){
        this.id = id;
        this.vendorName = vendorName;
        this.dateOfReturn =dateOfReturn;
        this.itemDetails = itemDetails;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseReturnDTO)) return false;
        PurchaseReturnDTO that = (PurchaseReturnDTO) o;
        return id == that.id && vendorName.equals(that.vendorName) && dateOfReturn.equals(that.dateOfReturn) && itemDetails.equals(that.itemDetails) && remarks.equals(that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vendorName, dateOfReturn, itemDetails, remarks);
    }

    @Override
    public String toString() {
        return "PurchaseReceived{" +
                "id=" + id +
                ", vendorName='" + vendorName + '\'' +
                ", dateOfPurchase='" + dateOfReturn + '\'' +
                ", itemDetails='" + itemDetails + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
