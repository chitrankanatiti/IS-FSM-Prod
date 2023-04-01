package com.hdsoft.fsm.calltracker.dto;
import com.hdsoft.fsm.calltracker.model.CallTracker;

public class CallTrackerConverter {
    
    public static CallTrackerDTO convertToDTO(CallTracker ct) {
        return new CallTrackerDTO(ct.getId(), ct.getCaseId(), ct.getWorkOrder(), ct.getSerNumber(), ct.getCallCompany(), ct.getCallType(), ct.getMachineType(), ct.getMachineSlNo(), ct.getCustomerName(), ct.getCustomerAddress(), ct.getCustomerPincode(), ct.getCustomerState(), ct.getServiceEngineer(), ct.getDateOfVisit(), ct.getStatusOfCase());
    }
    public static CallTracker convertToCallTracker(CallTrackerDTO dto){
        return new CallTracker(dto.getId(), dto.getCaseId(), dto.getWorkOrder(),
                dto.getSerNumber(), dto.getCallCompany(), dto.getCallType(), dto.getMachineType(), dto.getMachineSlNo(), dto.getCustomerName(), dto.getCustomerAddress(), dto.getCustomerPincode(), dto.getCustomerState(), dto.getServiceEngineer(), dto.getDateOfVisit(), dto.getStatusOfCase(), dto.getRemarks());
    }
    
}
