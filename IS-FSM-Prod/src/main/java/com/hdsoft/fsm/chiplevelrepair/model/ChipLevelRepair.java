package com.hdsoft.fsm.chiplevelrepair.model;
import org.hibernate.dialect.MySQL57Dialect;
import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "chiplevelrepair")
public class ChipLevelRepair {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long repairVoucherNo;
    private String submitted;
    private String returned;
    private String repairStarters;
    private String amount;
    private String remarks;

    public ChipLevelRepair(){

    }

    public ChipLevelRepair(long id, long repairVoucherNo, String submitted,String returned, String repairStarters, String amount, String remarks){
        this.id = id;
        this.repairVoucherNo = repairVoucherNo;
        this.submitted = submitted;
        this.returned = returned;
        this.repairStarters = repairStarters;
        this.amount = amount;
        this.remarks = remarks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRepairVoucherNo() {
        return repairVoucherNo;
    }

    public void setRepairVoucherNo(long repairVoucherNo) {
        this.repairVoucherNo = repairVoucherNo;
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public String getRepairStarters() {
        return repairStarters;
    }

    public void setRepairStarters(String repairStarters) {
        this.repairStarters = repairStarters;
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
        if (!(o instanceof ChipLevelRepair)) return false;
        ChipLevelRepair that = (ChipLevelRepair) o;
        return id == that.id && repairVoucherNo == that.repairVoucherNo && submitted.equals(that.submitted) && returned.equals(that.returned) && repairStarters.equals(that.repairStarters) && amount.equals(that.amount) && remarks.equals(that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repairVoucherNo, submitted, returned, repairStarters, amount, remarks);
    }

    @Override
    public String toString() {
        return "ChipLevelRepair{" +
                "id=" + id +
                ", repairVoucherNo=" + repairVoucherNo +
                ", submitted='" + submitted + '\'' +
                ", returned='" + returned + '\'' +
                ", repairStarters='" + repairStarters + '\'' +
                ", amount='" + amount + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }

}
