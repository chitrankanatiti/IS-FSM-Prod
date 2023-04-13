package com.hdsoft.fsm.calltracker.mapper;
import com.hdsoft.fsm.calltracker.dto.CallTrackerDTO;
import com.hdsoft.fsm.calltracker.model.CallTracker;
import com.hdsoft.fsm.generic.GenericMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
public class CallTrackerMapper implements GenericMapper<CallTracker, CallTrackerDTO>{

    @Override
    public CallTracker asEntity(CallTrackerDTO dto) {
        return new CallTracker(dto.getId(), dto.getCaseNumber(), dto.getCallCompany(), dto.getCallType(), dto.getMachineType(), dto.getMachineSlNo(), dto.getCustomerName(), dto.getCustomerAddress(), dto.getCustomerPincode(), dto.getCustomerState(), dto.getServiceEngineer(), dto.getDateOfVisit(), dto.getStatusOfCase(), dto.getRemarks(), dto.getDateOfEntry(), dto.getUniqueId(), dto.getCreatedBy(), dto.getCreatedAtDate(), dto.getCreatedAtTime(), dto.getLastUpdatedDate(), dto.getLastUpdatedTime());
    }

    public CallTrackerDTO asDTO(CallTracker ct) {
        return new CallTrackerDTO(ct.getId(), ct.getCaseNumber(), ct.getCallCompany(), ct.getCallType(), ct.getMachineType(), ct.getMachineSlNo(), ct.getCustomerName(), ct.getCustomerAddress(), ct.getCustomerPincode(), ct.getCustomerState(), ct.getServiceEngineer(), ct.getDateOfVisit(), ct.getStatusOfCase(), ct.getRemarks(), ct.getDateOfEntry(), ct.getUniqueId(), ct.getCreatedBy(), ct.getCreatedAtDate(), ct.getCreatedAtTime(), ct.getLastUpdatedDate(), ct.getLastUpdatedTime());
            }

    @Override
    public List<CallTracker> asEntityList(List<CallTrackerDTO> dtoList) {
        return dtoList.stream().map(this::asEntity).collect(Collectors.toList());

    }

    @Override
    public List<CallTrackerDTO> asDTOList(List<CallTracker> entityList) {
        return entityList.stream().map(this::asDTO).collect(Collectors.toList());
    }
}
    
}
