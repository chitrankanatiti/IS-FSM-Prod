package com.hdsoft.fsm.purchase.model;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String vendorName;
    private String dateOfPurchase;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Item> itemDetails;
    private String remarks;

    public Purchase(){

    }

    public Purchase(long id, String vendorName, String dateOfPurchase, String itemDetails, String remarks){
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

    public List<Item> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(List<Item> itemDetails) {
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
        if (!(o instanceof Purchase)) return false;
        Purchase that = (Purchase) o;
        return id == that.id && vendorName.equals(that.vendorName) && dateOfPurchase.equals(that.dateOfPurchase) && itemDetails.equals(that.itemDetails) && remarks.equals(that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vendorName, dateOfPurchase, itemDetails, remarks);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", vendorName='" + vendorName + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", itemDetails=" + itemDetails +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
