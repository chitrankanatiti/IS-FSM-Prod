package com.hdsoft.fsm.engineerprofile.service.impl;

import com.hdsoft.fsm.engineerprofile.model.EngineerModel;
import com.hdsoft.fsm.engineerprofile.repository.EngineerRepository;
import com.hdsoft.fsm.engineerprofile.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EngineerServiceImpl implements EngineerService {


    @Autowired
    private EngineerRepository repository;

    @Override
    @Transactional
    public long save(EngineerModel EngineerProfile){
        return(long) repository.save(EngineerProfile).getId();
    };

    @Override
    @Transactional
    public boolean update(EngineerModel EngineerProfile){
        repository.save(EngineerProfile);
        return true;
    };

    @Override
    @Transactional
    public boolean delete(EngineerModel EngineerProfile){
        repository.delete(EngineerProfile);
        return true;
    };

    @Override
    @Transactional
    public List<EngineerModel> findAll(){return repository.findAll();}
}
