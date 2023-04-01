package com.hdsoft.fsm.purchasereceived.dto;
import com.hdsoft.fsm.purchasereceived.model.PurchaseReceived;

public class PurchaseReceivedConverter {

    public static PurchaseReceivedDTO convertToDTO(PurchaseReceived pr) {
        return new PurchaseReceivedDTO(pr.getId(), pr.getVendorName(), pr.getDateOfPurchase(), pr.getItemDetails(), pr.getRemarks());
    }
    public static PurchaseReceived convertTOPurchaseReceived(PurchaseReceivedDTO dto){
        return new PurchaseReceived(dto.getId(), dto.getVendorName(), dto.getDateOfPurchase(), dto.getItemDetails(), dto.getRemarks());
    }


}
