package com.hdsoft.fsm.calltracker.repository;

import com.hdsoft.fsm.calltracker.model.CallTracker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallTrackerRepository extends JpaRepository<CallTracker, Long>{
}
