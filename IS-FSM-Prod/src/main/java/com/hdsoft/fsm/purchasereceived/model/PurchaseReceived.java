package com.hdsoft.fsm.purchasereceived.model;
import org.hibernate.dialect.MySQL57Dialect;
import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "purchasereceived")
public class PurchaseReceived {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String vendorName;
    private String dateOfPurchase;
    private String itemDetails;
    private String remarks;

    public PurchaseReceived(){

    }

    public PurchaseReceived(long id, String vendorName,String dateOfPurchase, String itemDetails, String remarks){
        this.id = id;
        this.vendorName = vendorName;
        this.dateOfPurchase =dateOfPurchase;
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

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
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
        if (!(o instanceof PurchaseReceived)) return false;
        PurchaseReceived that = (PurchaseReceived) o;
        return id == that.id && vendorName.equals(that.vendorName) && dateOfPurchase.equals(that.dateOfPurchase) && itemDetails.equals(that.itemDetails) && remarks.equals(that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vendorName, dateOfPurchase, itemDetails, remarks);
    }

    @Override
    public String toString() {
        return "PurchaseReceived{" +
                "id=" + id +
                ", vendorName='" + vendorName + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", itemDetails='" + itemDetails + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
