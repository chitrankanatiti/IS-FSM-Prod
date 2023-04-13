package com.hdsoft.fsm.calltracker.service;

import com.hdsoft.fsm.calltracker.model.CallTracker;
import com.hdsoft.fsm.generic.GenericService;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.List;

public interface CallTrackerService extends GenericService<CallTracker, Long> {


    List<CallTracker> findByCaseNumber(String caseNumber);
    List<CallTracker> findByCallCompany(String callCompany);
    List<CallTracker> findByCallType(String callType);
    List<CallTracker> findByMachineType(String machineType);
    List<CallTracker> findByMachineSlNo(String machineSlNo);
    List<CallTracker> findByCustomerName(String customerName);
    List<CallTracker> findByCustomerAddress(String customerAddress);
    List<CallTracker> findByCustomerPincode(String customerPincode);
    List<CallTracker> findByCustomerState(String customerState);
    List<CallTracker> findByServiceEngineer(String serviceEngineer);
    List<CallTracker> findByDateOfVisit(String dateOfVisit);
    List<CallTracker> findByStatusOfCase(String statusOfCase);
    List<CallTracker> findByRemarks(String remarks);
    List<CallTracker> findByDateOfEntry(String dateOfEntry);
    List<CallTracker> findByUniqueId(String uniqueId);
    List<CallTracker> findByCreatedBy(String createdBy);
    List<CallTracker> findByCreatedAtDate(String createdAtDate);
    List<CallTracker> findByCreatedAtTime(String createdAtTime);
    List<CallTracker> findByLastUpdatedDate(String lastUpdatedDate);
    List<CallTracker> findByLastUpdatedTime(String lastUpdatedTime);
    List<CallTracker> findByDate(String startDate, String endDate);
    long countByDate(String startDate, String endDate);



}
