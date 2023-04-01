package com.hdsoft.fsm.calltracker.dto;
import com.hdsoft.fsm.calltracker.model.CallTracker;


import java.util.Objects;

public class CallTrackerDTO {
    private long id;

    private long caseId;
    private long workOrder;
    private long serNumber;

    private String callCompany;
    private String callType;
    private String machineType;
    private String machineSlNo;
    private String customerName;
    private String customerAddress;
    private String customerPincode;
    private String customerState;
    private String serviceEngineer;
    private String dateOfVisit;
    private String statusOfCase;
    private String remarks;

    public CallTrackerDTO(long id, long caseId, long workOrder, long serNumber, String callCompany, String callType, String machineType, String machineSlNo, String customerName, String customerAddress, String customerPincode, String customerState, String serviceEngineer, String dateOfVisit, String statusOfCase){

    }
    public CallTrackerDTO(long id, long caseId, long workOrder, long serNumber, String callCompany,String callType,String machineType,String machineSlNo, String customerName, String customerAddress, String customerPincode, String customerState, String serviceEngineer, String dateOfVisit, String statusOfCase, String remarks) {
        this.id = id;
        this.caseId = caseId;
        this.workOrder = workOrder;
        this.serNumber = serNumber;
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

    public long getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(long workOrder) {
        this.workOrder = workOrder;
    }

    public long getSerNumber() {
        return serNumber;
    }

    public void setSerNumber(long serNumber) {
        this.serNumber = serNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CallTracker)) return false;
        CallTracker that = (CallTracker) o;
        return getId() == that.getId() && getCaseId() == that.getCaseId() && getWorkOrder() == that.getWorkOrder() && getSerNumber() == that.getSerNumber() && getCallCompany().equals(that.getCallCompany()) && getCallType().equals(that.getCallType()) && getMachineType().equals(that.getMachineType()) && getMachineSlNo().equals(that.getMachineSlNo()) && getCustomerName().equals(that.getCustomerName()) && getCustomerAddress().equals(that.getCustomerAddress()) && getCustomerPincode().equals(that.getCustomerPincode()) && getCustomerState().equals(that.getCustomerState()) && getServiceEngineer().equals(that.getServiceEngineer()) && getDateOfVisit().equals(that.getDateOfVisit()) && getStatusOfCase().equals(that.getStatusOfCase()) && getRemarks().equals(that.getRemarks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCaseId(), getWorkOrder(), getSerNumber(), getCallCompany(), getCallType(), getMachineType(), getMachineSlNo(), getCustomerName(), getCustomerAddress(), getCustomerPincode(), getCustomerState(), getServiceEngineer(), getDateOfVisit(), getStatusOfCase(), getRemarks());
    }

    @Override
    public String toString() {
        return "CallTracker{" +
                "id=" + id +
                ", caseId=" + caseId +
                ", workOrder=" + workOrder +
                ", serNumber=" + serNumber +
                ", callCompany='" + callCompany + '\'' +
                ", callType='" + callType + '\'' +
                ", machineType='" + machineType + '\'' +
                ", machineSlNo='" + machineSlNo + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerPincode='" + customerPincode + '\'' +
                ", customerState='" + customerState + '\'' +
                ", serviceEngineer='" + serviceEngineer + '\'' +
                ", dateOfVisit='" + dateOfVisit + '\'' +
                ", statusOfCase='" + statusOfCase + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
