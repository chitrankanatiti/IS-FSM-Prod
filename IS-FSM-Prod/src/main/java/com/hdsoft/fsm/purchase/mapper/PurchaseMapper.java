package com.hdsoft.fsm.purchase.mapper;


import com.hdsoft.fsm.purchase.dto.PurchaseDTO;
import com.hdsoft.fsm.purchase.model.Purchase;

public class PurchaseMapper {

    public static PurchaseDTO convertToDTO(Purchase pr) {
        return new PurchaseDTO(pr.getId(), pr.getVendorName(), pr.getDateOfPurchase(), pr.getItemDetails(), pr.getRemarks());
    }
    public static Purchase convertTOPurchase(PurchaseDTO dto){
        return new Purchase(dto.getId(), dto.getVendorName(), dto.getDateOfPurchase(), dto.getItemDetails(), dto.getRemarks());
    }


}
