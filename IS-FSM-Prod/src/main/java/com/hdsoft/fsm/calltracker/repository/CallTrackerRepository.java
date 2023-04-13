package com.hdsoft.fsm.calltracker.repository;

import com.hdsoft.fsm.calltracker.model.CallTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CallTrackerRepository extends JpaRepository<CallTracker, Long>{
    @Query("SELECT e FROM CallTracker e WHERE e.caseNumber = :caseNumber")
    List<CallTracker> findByCaseNumber(@Param("caseNumber") String caseNumber);

    @Query("SELECT e FROM CallTracker e WHERE e.callCompany = :callCompany")
    List<CallTracker> findByCallCompany(@Param("callCompany") String callCompany);

    @Query("SELECT e FROM CallTracker e WHERE e.machineType = :machineType")
    List<CallTracker> findByMachineType(@Param("machineType") String machineType);

    @Query("SELECT e FROM CallTracker e WHERE e.callType = :callType")
    List<CallTracker> findByCallType(@Param("callType") String callType);

    @Query("SELECT e FROM CallTracker e WHERE e.machineSlNo = :machineSlNo")
    List<CallTracker> findByMachineSlNo(@Param("machineSlNo") String machineSlNo);

    @Query("SELECT e FROM CallTracker e WHERE e.dateOfVisit = :dateOfVisit")
    List<CallTracker> findByDateOfVisit(@Param("dateOfVisit") String dateOfVisit);

    @Query("SELECT e FROM CallTracker e WHERE e.statusOfCase = :statusOfCase")
    List<CallTracker> findByStatusOfCase(@Param("statusOfCase") String statusOfCase);

    @Query("SELECT e FROM CallTracker e WHERE e.remarks = :remarks")
    List<CallTracker> findByRemarks(@Param("remarks") String remarks);

    @Query("SELECT e FROM CallTracker e WHERE e.dateOfEntry = :dateOfEntry")
    List<CallTracker> findByDateOfEntry(@Param("dateOfEntry") String dateOfEntry);

    @Query("SELECT e FROM CallTracker e WHERE e.uniqueId = :uniqueId")
    List<CallTracker> findByUniqueId(@Param("uniqueId") String uniqueId);
    @Query("SELECT e FROM CallTracker e WHERE e.createdBy = :createdBy")
    List<CallTracker> findByCreatedBy(@Param("createdBy") String createdBy);
    @Query("SELECT e FROM CallTracker e WHERE e.createdAtDate = :createdAtDate")
    List<CallTracker> findByCreatedAtDate(@Param("createdAtDate") String createdAtDate);

    @Query("SELECT e FROM CallTracker e WHERE e.createdAtTime = :createdAtTime")
    List<CallTracker> findByCreatedAtTime(@Param("createdAtTime") String createdAtTime);

    @Query("SELECT e FROM CallTracker e WHERE e.lastUpdatedDate = :lastUpdatedDate")
    List<CallTracker> findByLastUpdatedDate(@Param("lastUpdatedDate") String lastUpdatedDate);

    @Query("SELECT e FROM CallTracker e WHERE e.lastUpdatedTime = :lastUpdatedTime")
    List<CallTracker> findByLastUpdatedTime(@Param("lastUpdatedTime") String lastUpdatedTime);
}
