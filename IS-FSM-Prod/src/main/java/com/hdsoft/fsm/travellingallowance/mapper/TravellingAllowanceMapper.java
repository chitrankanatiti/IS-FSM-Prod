package com.hdsoft.fsm.travellingallowance.mapper;
import com.hdsoft.fsm.travellingallowance.dto.TravellingAllowanceDTO;
import com.hdsoft.fsm.travellingallowance.model.TravellingAllowance;

public class TravellingAllowanceMapper {

    public static TravellingAllowanceDTO convertToDTO(TravellingAllowance ta){
        return new TravellingAllowanceDTO(ta.getId(), ta.getDateOfData(), ta.getStartLocation(), ta.getLocationCovered(), ta.getStartTripCount(), ta.getEndTripCount(), ta.getAllowanceReceived(), ta.getCallBrands(), ta.getTypeOfMachine(), ta.getModeOfConveyance());
    }
    public static TravellingAllowance convertToTravellingAllowance(TravellingAllowanceDTO dto){
        return new TravellingAllowance(dto.getId(), dto.getDateOfData(), dto.getStartLocation(), dto.getLocationCovered(), dto.getStartTripCount(), dto.getEndTripCount(), dto.getAllowanceReceived(), dto.getCallBrands(), dto.getTypeOfMachine(), dto.getModeOfConveyance());
    }
}
