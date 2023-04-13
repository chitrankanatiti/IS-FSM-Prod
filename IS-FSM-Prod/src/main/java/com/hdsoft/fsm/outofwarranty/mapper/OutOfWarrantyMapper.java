package com.hdsoft.fsm.outofwarranty.mapper;

import com.hdsoft.fsm.outofwarranty.dto.OutOfWarrantyDTO;
import com.hdsoft.fsm.outofwarranty.model.OutOfWarranty;

public class OutOfWarrantyMapper {

    public static OutOfWarrantyDTO convertToDTO (OutOfWarranty oow){
        return new OutOfWarrantyDTO(oow.getId(), oow.getCaseId(), oow.getDateOfPurchase(), oow.getPurchaseOrderNo(), oow.getEndUserType(), oow.getEndUserName(), oow.getMachineSlNo(), oow.getMachineDesc(), oow.getAmount(), oow.getRemarks());
    }
    public static OutOfWarranty convertToOutOfWarranty(OutOfWarrantyDTO dto){
        return new OutOfWarranty(dto.getId(), dto.getCaseId(), dto.getDateOfPurchase(), dto.getPurchaseOrderNo(), dto.getEndUserType(), dto.getEndUserName(), dto.getMachineSlNo(), dto.getMachineDesc(), dto.getAmount(), dto.getRemarks());
    }
}
