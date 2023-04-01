package com.hdsoft.fsm.purchasereturn.dto;
import com.hdsoft.fsm.purchasereturn.model.PurchaseReturn;

public class PurchaseReturnConverter {

    public static PurchaseReturnDTO convertToDTO (PurchaseReturn pret){
        return new PurchaseReturnDTO(pret.getId(), pret.getVendorName(), pret.getDateOfReturn(), pret.getItemDetails(), pret.getRemarks());
    }

    public static PurchaseReturn convertToPurchaseReturn(PurchaseReturnDTO dto){
        return new PurchaseReturn(dto.getId(), dto.getVendorName(), dto.getDateOfReturn(), dto.getItemDetails(), dto.getRemarks());
    }
}
