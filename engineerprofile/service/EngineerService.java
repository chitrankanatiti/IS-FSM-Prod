package com.hdsoft.fsm.engineerprofile.service;

import com.hdsoft.fsm.engineerprofile.model.EngineerModel;
import java.util.List;

public interface EngineerService {

    public long save(EngineerModel EngineeringProfile);
    public boolean update(EngineerModel EngineerProfile);
    public boolean delete(EngineerModel EngineerProfile);

    public List<EngineerModel> findAll();

    //findById
    //count
}
