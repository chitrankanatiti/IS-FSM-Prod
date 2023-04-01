package com.hdsoft.fsm.engineerprofile.repository;

import com.hdsoft.fsm.engineerprofile.model.EngineerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineerRepository extends JpaRepository<EngineerModel, Long>{
}
