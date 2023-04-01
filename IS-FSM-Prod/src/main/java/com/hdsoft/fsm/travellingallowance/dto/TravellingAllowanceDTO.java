package com.hdsoft.fsm.travellingallowance.dto;

import com.hdsoft.fsm.travellingallowance.model.TravellingAllowance;

import java.util.Objects;

public class TravellingAllowanceDTO {

    private long id;

    private String dateOfData;
    private String startLocation;
    private String  locationCovered;
    private String startTripCount;
    private String endTripCount;
    private String allowanceReceived;
    private String callBrands;
    private String typeOfMachine;
    private String modeOfConveyance;

    public TravellingAllowanceDTO(){

    }

    public TravellingAllowanceDTO(long id, String dateOfData,String startLocation,String locationCovered,String startTripCount, String endTripCount, String allowanceReceived, String callBrands, String typeOfMachine, String modeOfConveyance){
        this.id = id;
        this.dateOfData = dateOfData;
        this.startLocation = startLocation;
        this.locationCovered = locationCovered;
        this.startTripCount = startTripCount;
        this.endTripCount = endTripCount;
        this.allowanceReceived = allowanceReceived;
        this.callBrands = callBrands;
        this.typeOfMachine = typeOfMachine;
        this.modeOfConveyance = modeOfConveyance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDateOfData() {
        return dateOfData;
    }

    public void setDateOfData(String dateOfData) {
        this.dateOfData = dateOfData;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getLocationCovered() {
        return locationCovered;
    }

    public void setLocationCovered(String locationCovered) {
        this.locationCovered = locationCovered;
    }

    public String getStartTripCount() {
        return startTripCount;
    }

    public void setStartTripCount(String startTripCount) {
        this.startTripCount = startTripCount;
    }

    public String getEndTripCount() {
        return endTripCount;
    }

    public void setEndTripCount(String endTripCount) {
        this.endTripCount = endTripCount;
    }

    public String getAllowanceReceived() {
        return allowanceReceived;
    }

    public void setAllowanceReceived(String allowanceReceived) {
        this.allowanceReceived = allowanceReceived;
    }

    public String getCallBrands() {
        return callBrands;
    }

    public void setCallBrands(String callBrands) {
        this.callBrands = callBrands;
    }

    public String getTypeOfMachine() {
        return typeOfMachine;
    }

    public void setTypeOfMachine(String typeOfMachine) {
        this.typeOfMachine = typeOfMachine;
    }

    public String getModeOfConveyance() {
        return modeOfConveyance;
    }

    public void setModeOfConveyance(String modeOfConveyance) {
        this.modeOfConveyance = modeOfConveyance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TravellingAllowanceDTO)) return false;
        TravellingAllowanceDTO that = (TravellingAllowanceDTO) o;
        return id == that.id && dateOfData.equals(that.dateOfData) && startLocation.equals(that.startLocation) && locationCovered.equals(that.locationCovered) && startTripCount.equals(that.startTripCount) && endTripCount.equals(that.endTripCount) && allowanceReceived.equals(that.allowanceReceived) && callBrands.equals(that.callBrands) && typeOfMachine.equals(that.typeOfMachine) && modeOfConveyance.equals(that.modeOfConveyance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateOfData, startLocation, locationCovered, startTripCount, endTripCount, allowanceReceived, callBrands, typeOfMachine, modeOfConveyance);
    }

    @Override
    public String toString() {
        return "TravellingAllowance{" +
                "id=" + id +
                ", dateOfData='" + dateOfData + '\'' +
                ", startLocation='" + startLocation + '\'' +
                ", locationCovered='" + locationCovered + '\'' +
                ", startTripCount='" + startTripCount + '\'' +
                ", endTripCount='" + endTripCount + '\'' +
                ", allowanceReceived='" + allowanceReceived + '\'' +
                ", callBrands='" + callBrands + '\'' +
                ", typeOfMachine='" + typeOfMachine + '\'' +
                ", modeOfConveyance='" + modeOfConveyance + '\'' +
                '}';
    }
}
