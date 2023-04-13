package com.hdsoft.fsm.engineerprofile.service.impl;

import com.hdsoft.fsm.engineerprofile.model.Engineer;
import com.hdsoft.fsm.engineerprofile.repository.EngineerRepository;
import com.hdsoft.fsm.engineerprofile.service.EngineerService;
import com.hdsoft.fsm.utils.DateUtils;
import com.hdsoft.fsm.utils.SortingOrder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
public class EngineerServiceImpl implements EngineerService {
    private final EngineerRepository repository;

    public EngineerServiceImpl(EngineerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Engineer save(Engineer entity) {
        return repository.save(entity);
    }

    @Override
    public List<Engineer> save(List<Engineer> entities) {
        return (List<Engineer>) repository.saveAll(entities);
    }

    public boolean update(Engineer entity) {
        repository.save(entity);
        return true;
    }

    @Override
    public boolean delete(Engineer entity) {
        repository.delete(entity);
        return true;
    }

    @Override
    public boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public Optional<Engineer> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Engineer> findAll() {
        return repository.findAll();
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
    public List<Engineer> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Engineer> findByPhoneNo(String PhoneNo) {
        return repository.findByPhoneNo(PhoneNo);
    }



    @Override
    public List<Engineer> findByEmailId(String emailId) {
        return null;
    }


    @Override
    public List<Engineer> findByAltPhoneNo(String altPhoneNo) {
        return repository.findByAltPhoneNo(altPhoneNo);
    }



    @Override
    public Optional<Engineer> findByTechId(String techId) {
        return repository.findByTechId(techId);
    }

    @Override
    public List<Engineer> findByDateOfCreation(String dateOfCreation) {
        return repository.findByDateOfCreation(dateOfCreation);
    }

    @Override
    public Optional<Engineer> findByUniqueId(String uniqueId) {
        return repository.findByUniqueId(uniqueId);
    }

    @Override
    public List<Engineer> findByDate(String startDate, String endDate) {
        LocalDate start = DateUtils.parse(startDate,DateUtils.EEEE_DD_MMMM_YYYY);
        LocalDate end = DateUtils.parse(endDate,DateUtils.EEEE_DD_MMMM_YYYY);

        return repository.findAll().stream()
                .filter(f->{
                    LocalDate date = DateUtils.parse(f.getdateOfCreation(), DateUtils.EEEE_DD_MMMM_YYYY);
                    return !date.isBefore(start) && !date.isAfter(end);
                }).collect(Collectors.toList());
    }

    @Override
    public long countByDate(String startDate, String endDate) {
        return findByDate(startDate, endDate).size();
    }

    @Override
    public List<Engineer> findAllSorted(SortingOrder order) {
        switch (order){
            case ASCENDING:
                return findAll().stream()
                        .sorted(Comparator.comparing(Engineer::getname)).collect(Collectors.toList());
            case DESCENDING:
                return findAll().stream()
                        .sorted(Comparator.comparing(Engineer::getname).reversed()).collect(Collectors.toList());
            default:
                return findAll();
        }
    }

}
