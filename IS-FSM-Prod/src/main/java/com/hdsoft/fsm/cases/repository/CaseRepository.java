package com.hdsoft.fsm.cases.repository;

import com.hdsoft.fsm.cases.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Long> {
}
