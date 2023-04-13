package com.hdsoft.fsm.engineerprofile.mapper;

import com.hdsoft.fsm.engineerprofile.dto.EngineerDTO;
import com.hdsoft.fsm.engineerprofile.model.Engineer;
import com.hdsoft.fsm.generic.GenericMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EngineerMapper implements GenericMapper<Engineer, EngineerDTO> {

    @Override
    public Engineer asEntity(EngineerDTO dto) {
        return new Engineer(dto.getId(), dto.getName(), dto.getPhoneno(), dto.getAltphoneno(), dto.getEmailid(), dto.getTechid(), dto.getImage(), dto.getDateOfCreation(), dto.getUniqueId());
    }

    @Override
    public EngineerDTO asDTO(Engineer entity) {
        return new EngineerDTO(entity.getId(), entity.getname(), entity.getphoneNo(), entity.getaltPhoneNo(),
                entity.getemailId(), entity.gettechId(), entity.getimage(), entity.getdateOfCreation(), entity.getuniqueId());
    }

    @Override
    public List<Engineer> asEntityList(List<EngineerDTO> dtoList) {
        return dtoList.stream().map(this::asEntity).collect(Collectors.toList());
        //return dtoList.stream().map(m->asEntity(m)).collect(Collectors.toList()); // Stream API
    }

    @Override
    public List<EngineerDTO> asDTOList(List<Engineer> entityList) {
        return entityList.stream().map(this::asDTO).collect(Collectors.toList());
    }

}
