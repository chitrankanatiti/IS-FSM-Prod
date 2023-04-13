package com.hdsoft.fsm.engineerprofile.service;

import com.hdsoft.fsm.engineerprofile.model.Engineer;
import com.hdsoft.fsm.generic.GenericService;

import java.util.List;
import java.util.Optional;

public interface EngineerService extends GenericService<Engineer, Long> {

    List<Engineer> findByName(String name);

    List<Engineer> findByPhoneNo(String PhoneNo);

    List<Engineer> findByAltPhoneNo(String altPhoneNo);

    List<Engineer> findByEmailId(String emailId);

    Optional<Engineer> findByTechId(String techId);

    List<Engineer> findByDateOfCreation(String dateOfCreation);

    Optional<Engineer> findByUniqueId(String uniqueId);

    List<Engineer> findByDate(String startDate, String endDate);

    long countByDate(String startDate, String endDate);
}
