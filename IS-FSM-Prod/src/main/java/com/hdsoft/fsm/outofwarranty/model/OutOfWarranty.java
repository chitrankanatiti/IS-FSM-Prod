package com.hdsoft.fsm.outofwarranty.model;

import org.hibernate.dialect.MySQL57Dialect;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "outofwarranty")
public class OutOfWarranty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String caseId; // change case id from long to string.
    private String dateOfPurchase;
    private String purchaseOrderNo;
    private String endUserType;
    private String endUserName;
    private String machineSlNo;
    private String machineDesc;
    private String amount;
    private String remarks;

    private byte[] stockProof;
    private byte[] purchaseOrder;

    public OutOfWarranty(){

    }
    public OutOfWarranty(long id, long caseId, String dateOfPurchase, String purchaseOrderNo, String endUserType, String endUserName, String machineSlNo, String machineDesc, String amount, String remarks){
        this.id = id;
        this.caseId = caseId;
        this.dateOfPurchase = dateOfPurchase;
        this.purchaseOrderNo = purchaseOrderNo;
        this.endUserType = endUserType;
        this.endUserName = endUserName;
        this.machineSlNo = machineSlNo;
        this.machineDesc = machineDesc;
        this.amount = amount;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCaseId() {
        return caseId;
    }

    public void setCaseId(long caseId) {
        this.caseId = caseId;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    public void setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    public String getEndUserType() {
        return endUserType;
    }

    public void setEndUserType(String endUserType) {
        this.endUserType = endUserType;
    }

    public String getEndUserName() {
        return endUserName;
    }

    public void setEndUserName(String endUserName) {
        this.endUserName = endUserName;
    }

    public String getMachineSlNo() {
        return machineSlNo;
    }

    public void setMachineSlNo(String machineSlNo) {
        this.machineSlNo = machineSlNo;
    }

    public String getMachineDesc() {

        return machineDesc;
    }

    public void setMachineDesc(String machineDesc) {

        this.machineDesc = machineDesc;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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
        if (!(o instanceof OutOfWarranty)) return false;
        OutOfWarranty that = (OutOfWarranty) o;
        return id == that.id && caseId == that.caseId && dateOfPurchase.equals(that.dateOfPurchase) && purchaseOrderNo.equals(that.purchaseOrderNo) && endUserType.equals(that.endUserType) && endUserName.equals(that.endUserName) && machineSlNo.equals(that.machineSlNo) && machineDesc.equals(that.machineDesc) && amount.equals(that.amount) && remarks.equals(that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, caseId, dateOfPurchase, purchaseOrderNo, endUserType, endUserName, machineSlNo, machineDesc, amount, remarks);
    }

    @Override
    public String toString() {
        return "OutOfWarranty{" +
                "id=" + id +
                ", caseId=" + caseId +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", purchaseOrderNo='" + purchaseOrderNo + '\'' +
                ", endUserType='" + endUserType + '\'' +
                ", endUserName='" + endUserName + '\'' +
                ", machineSlNo='" + machineSlNo + '\'' +
                ", machineDesc='" + machineDesc + '\'' +
                ", amount='" + amount + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}

