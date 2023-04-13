package com.hdsoft.fsm.calltracker.service.impl;

import com.hdsoft.fsm.calltracker.repository.CallTrackerRepository;
import com.hdsoft.fsm.calltracker.model.CallTracker;
import com.hdsoft.fsm.calltracker.service.CallTrackerService;
import com.hdsoft.fsm.utils.DateUtils;
import com.hdsoft.fsm.utils.SortingOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class CallTrackerServiceImpl implements CallTrackerService {
    private final CallTrackerRepository repository;

    public CallTrackerServiceImpl(CallTrackerRepository repository) {
        this.repository = repository;
    }

    @Override
    public CallTracker save(CallTracker entity) {
        return repository.save(entity);
    }

    @Override
    public List<CallTracker> save(List<CallTracker> entities) {
        return (List<CallTracker>) repository.saveAll(entities);
    }

    @Override
    public boolean update(CallTracker entity){
        repository.save(entity);
        return true;
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public boolean delete(CallTracker entity) {
        repository.delete(entity);
        return true;
    }

    @Override
    public Optional<CallTracker> findById(long id) {
        return repository.findById(id);
    }

    @Override
    public List<CallTracker> findAll() {
        return (List<CallTracker>) repository.findAll();
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public List<CallTracker> findByCaseNumber(String caseNumber){ return repository.findByCaseNumber(caseNumber);}

    @Override
    public List<CallTracker> findByCallCompany(String callCompany){ return repository.findByCallCompany(callCompany);}

    @Override
    public List<CallTracker> findByMachineType(String machineType){ return repository.findByMachineType(machineType);}

    @Override
    public List<CallTracker> findByCallType(String callType){ return repository.findByCallType(callType);}

    @Override
    public List<CallTracker> findByMachineSlNo(String machineSlNo){ return repository.findByMachineSlNo(machineSlNo);}

    @Override
    public List<CallTracker> findByDateOfVisit(String dateOfVisit){ return repository.findByDateOfVisit(dateOfVisit);}
    @Override
    public List<CallTracker> findByStatusOfCase(String statusOfCase){ return repository.findByStatusOfCase(statusOfCase);}

    @Override
    public List<CallTracker> findByRemarks(String remarks){ return repository.findByRemarks(remarks);}

    @Override
    public List<CallTracker> findByDateOfEntry(String dateOfEntry){ return repository.findByDateOfEntry(dateOfEntry);}

    @Override
    public List<CallTracker> findByUniqueId(String uniqueId){ return repository.findByUniqueId(uniqueId);}

    @Override
    public List<CallTracker> findByCreatedBy(String createdBy){ return repository.findByCreatedBy(createdBy));}

    @Override
    public List<CallTracker> findByCreatedAtDate(String createdAtDate){ return repository.findByCreatedAtDate(createdAtDate);}

    @Override
    public List<CallTracker> findByCreatedAtTime(String createdAtTime){ return repository.findByCreatedAtTime(createdAtTime);}

    @Override
    public List<CallTracker> findByLastUpdatedDate(String lastUpdatedDate){ return repository.findByLastUpdatedDate(lastUpdatedDate);}

    @Override
    public List<CallTracker> findByLastUpdatedTime(String lastUpdatedTime){ return repository.findByLastUpdatedTime(lastUpdatedTime);}


    @Override
    public List<CallTracker> findByDate(String startDate, String endDate) {
        LocalDate start = DateUtils.parse(startDate,DateUtils.EEEE_DD_MMMM_YYYY);
        LocalDate end = DateUtils.parse(endDate,DateUtils.EEEE_DD_MMMM_YYYY);

        return repository.findAll().stream()
                .filter(f->{
                    LocalDate date = DateUtils.parse(f.getDateOfVisit(), DateUtils.EEEE_DD_MMMM_YYYY);
                    return !date.isBefore(start) && !date.isAfter(end);
                }).collect(Collectors.toList());
    }

    @Override
    public long countByDate(String startDate, String endDate) {
        return findByDate(startDate, endDate).size();
    }

    @Override
    public List<CallTracker> findAllSorted(SortingOrder order) {
        switch (order){
            case ASCENDING:
                return findAll().stream()
                        .sorted(Comparator.comparing(CallTracker::getCallCompany)).collect(Collectors.toList());
            case DESCENDING:
                return findAll().stream()
                        .sorted(Comparator.comparing(CallTracker::getCallCompany).reversed()).collect(Collectors.toList());
            default:
                return findAll();
        }
    }
}