package com.hdsoft.fsm.engineerprofile.dto;

import com.hdsoft.fsm.engineerprofile.model.EngineerModel;

public class EngineerConverter {

    public static EngineerDTO convertToDTO(EngineerModel engineerProfile){
        return new EngineerDTO(engineerProfile.getId(), engineerProfile.getname(), engineerProfile.getphoneNo(), engineerProfile.getaltPhoneNo(), engineerProfile.getemailId(), engineerProfile.gettechId());

    }

    public static EngineerModel convertToEngineerModel(EngineerDTO dto)
    {
        return new EngineerModel(dto.getId(), dto.getName(), dto.getPhoneno(), dto.getAltphoneno(), dto.getEmailid(), dto.getTechid());

    }


}
