package com.hdsoft.fsm.purchasereturn.model;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "purchasereturn")
public class PurchaseReturn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String vendorName;
    private String dateOfReturn;
    @OneToMany(fetch = FetchType.EAGER)
    private List<ItemDetails> itemDetails;
    private String remarks;

    public PurchaseReturn(){

    }

    public PurchaseReturn(long id, String vendorName, String dateOfReturn, String remarks, String itemDetails){
        this.id = id;
        this.vendorName = vendorName;
        this.dateOfReturn = dateOfReturn;
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
        if (!(o instanceof PurchaseReturn)) return false;
        PurchaseReturn that = (PurchaseReturn) o;
        return id == that.id && vendorName.equals(that.vendorName) && dateOfReturn.equals(that.dateOfReturn) && itemDetails.equals(that.itemDetails) && remarks.equals(that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vendorName, dateOfReturn, itemDetails, remarks);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", vendorName='" + vendorName + '\'' +
                ", dateOfPurchase='" + dateOfReturn + '\'' +
                ", itemDetails='" + itemDetails + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
