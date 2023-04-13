package com.hdsoft.fsm.calltracker.model;

import com.hdsoft.fsm.engineerprofile.model.Engineer;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="calltracker")
public class CallTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String caseNumber;

    private String callCompany;
    private String callType;
    private String machineType;
    private String machineSlNo;
    private String customerName;
    private String customerAddress;
    private String customerPincode;
    private String customerState;
    @ManyToOne(fetch = FetchType.EAGER)
    private Engineer serviceEngineer;
    private String dateOfVisit;
    private String statusOfCase;
    private String remarks;

    private String dateOfEntry;
    private String uniqueId;
    private Engineer createdBy;
    private String createdAtDate;
    private String createdAtTime;
    private String lastUpdatedDate;
    private String lastUpdatedTime;

    public CallTracker(){

    }
    public CallTracker(long id, String caseNumber, String callCompany, String callType, String machineType, String machineSlNo, String customerName, String customerAddress, String customerPincode, String customerState, String serviceEngineer, String dateOfVisit, String statusOfCase, String remarks, String dateOfEntry, String uniqueId, Engineer createdBy, String createdAtDate, String createdAtTime, String lastUpdatedDate, String lastUpdatedTime) {
        this.id = id;
        this.caseNumber = caseNumber;
        this.callCompany = callCompany;
        this.callType = callType;
        this.machineType = machineType;
        this.machineSlNo = machineSlNo;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPincode = customerPincode;
        this.customerState = customerState;
        this.serviceEngineer = serviceEngineer;;
        this.dateOfVisit = dateOfVisit;
        this.statusOfCase = statusOfCase;
        this.remarks = remarks;
        this.dateOfEntry = dateOfEntry;
        this.uniqueId = uniqueId;
        this.createdBy = createdBy;
        this.createdAtDate = createdAtDate;
        this.createdAtTime = createdAtTime;
        this.lastUpdatedDate = lastUpdatedDate;
        this.lastUpdatedTime = lastUpdatedTime;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }
    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }
    public String getCallCompany() {
        return callCompany;
    }

    public void setCallCompany(String callCompany) {
        this.callCompany = callCompany;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getMachineSlNo() {
        return machineSlNo;
    }

    public void setMachineSlNo(String machineSlNo) {
        this.machineSlNo = machineSlNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPincode() {
        return customerPincode;
    }

    public void setCustomerPincode(String customerPincode) {
        this.customerPincode = customerPincode;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getServiceEngineer() {
        return serviceEngineer;
    }

    public void setServiceEngineer(String serviceEngineer) {
        this.serviceEngineer = serviceEngineer;
    }

    public String getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(String dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getStatusOfCase() {
        return statusOfCase;
    }

    public void setStatusOfCase(String statusOfCase) {
        this.statusOfCase = statusOfCase;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }
    public void setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }
    public String getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
    public Engineer getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(Engineer createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedAtDate() {
        return createdAtDate;
    }
    public void setCreatedAtDate(String createdAtDate) {
        this.createdAtDate = createdAtDate;
    }
    public String getCreatedAtTime() {
        return createdAtTime;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }
    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
    public String getLastUpdatedTime() {
        return lastUpdatedTime;
    }
    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CallTracker)) return false;
        CallTracker that = (CallTracker) o;
        return id == that.id && caseNumber.equals(that.caseNumber) && callCompany.equals(that.callCompany) && callType.equals(that.callType) && machineType.equals(that.machineType) && machineSlNo.equals(that.machineSlNo) && customerName.equals(that.customerName) && customerAddress.equals(that.customerAddress) && customerPincode.equals(that.customerPincode) && customerState.equals(that.customerState) && serviceEngineer.equals(that.serviceEngineer) && dateOfVisit.equals(that.dateOfVisit) && statusOfCase.equals(that.statusOfCase) && remarks.equals(that.remarks) && dateOfEntry.equals(that.dateOfEntry) && uniqueId.equals(that.uniqueId) && createdBy.equals(that.createdBy) && createdAtDate.equals(that.createdAtDate) && createdAtTime.equals(that.createdAtTime) && lastUpdatedDate.equals(that.lastUpdatedDate) && lastUpdatedTime.equals(that.lastUpdatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, caseNumber, callCompany, callType, machineType, machineSlNo, customerName, customerAddress, customerPincode, customerState, serviceEngineer, dateOfVisit, statusOfCase, remarks, dateOfEntry, uniqueId, createdBy, createdAtDate, createdAtTime, lastUpdatedDate, lastUpdatedTime);
    }

    @Override
    public String toString() {
        return "CallTracker{" +
                "id=" + id +
                ", caseNumber='" + caseNumber + '\'' +
                ", callCompany='" + callCompany + '\'' +
                ", callType='" + callType + '\'' +
                ", machineType='" + machineType + '\'' +
                ", machineSlNo='" + machineSlNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerPincode='" + customerPincode + '\'' +
                ", customerState='" + customerState + '\'' +
                ", serviceEngineer=" + serviceEngineer +
                ", dateOfVisit='" + dateOfVisit + '\'' +
                ", statusOfCase='" + statusOfCase + '\'' +
                ", remarks='" + remarks + '\'' +
                ", dateOfEntry='" + dateOfEntry + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                ", createdBy=" + createdBy +
                ", createdAtDate='" + createdAtDate + '\'' +
                ", createdAtTime='" + createdAtTime + '\'' +
                ", lastUpdatedDate='" + lastUpdatedDate + '\'' +
                ", lastUpdatedTime='" + lastUpdatedTime + '\'' +
                '}';
    }
}


