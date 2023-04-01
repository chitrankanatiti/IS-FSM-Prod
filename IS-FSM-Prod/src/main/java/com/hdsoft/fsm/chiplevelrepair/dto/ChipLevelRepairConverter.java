package com.hdsoft.fsm.chiplevelrepair.dto;

import com.hdsoft.fsm.chiplevelrepair.model.ChipLevelRepair;

public class ChipLevelRepairConverter {

    public static ChipLevelRepairDTO convertToDTO(ChipLevelRepair clr){
        return new ChipLevelRepairDTO(clr.getId(), clr.getRepairVoucherNo(), clr.getSubmitted(), clr.getReturned(), clr.getRepairStarters(),clr.getAmount(), clr.getRemarks());
    }
    public static ChipLevelRepair convertToChipLevelRepair(ChipLevelRepairDTO dto){
        return new ChipLevelRepair(dto.getId(), dto.getRepairVoucherNo(), dto.getSubmitted(), dto.getReturned(), dto.getRepairStarters(),dto.getAmount(), dto.getRemarks());
    }
}
