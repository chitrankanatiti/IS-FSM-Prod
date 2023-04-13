package com.hdsoft.fsm.calltracker.controller;

import com.hdsoft.fsm.calltracker.dto.CallTrackerDTO;
import com.hdsoft.fsm.calltracker.mapper.CallTrackerMapper;
import com.hdsoft.fsm.calltracker.model.CallTracker;
import com.hdsoft.fsm.calltracker.service.CallTrackerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/api/call-tracker")
@RestController
public class CallTrackerController {
    private final CallTrackerService callTrackerService;
    private final CallTrackerMapper callTrackerMapper;

    public CallTrackerController(CallTrackerService callTrackerService, CallTrackerMapper callTrackerMapper) {
        this.callTrackerService = callTrackerService;
        this.callTrackerMapper = callTrackerMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CallTrackerDTO save(@RequestBody CallTrackerDTO callTrackerDTO) {
        CallTracker callTracker = callTrackerMapper.asEntity(callTrackerDTO);
        return callTrackerMapper.asDTO(callTrackerService.save(callTracker));
    }

    @Override
    @GetMapping("/{id}")
    public CallTrackerDTO findById(@PathVariable("id") long id) {
        CallTracker callTracker = callTrackerService.findById(id).orElse(null);
        return callTrackerMapper.asDTO(callTracker);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id) {
        callTrackerService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<CallTrackerDTO> list() {
        return callTrackerMapper.asDTOList(callTrackerService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<CallTrackerDTO> pageQuery(Pageable pageable) {
        Page<CallTracker> callTrackerPage = callTrackerService.findAll(pageable);
        List<CallTrackerDTO> dtoList = callTrackerPage
                .stream()
                .map(callTrackerMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, callTrackerPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public CallTrackerDTO update(@RequestBody CallTrackerDTO callTrackerDTO, @PathVariable("id") long id) {
        CallTracker callTracker = callTrackerMapper.asEntity(callTrackerDTO);
        return callTrackerMapper.asDTO(callTrackerService.update(callTracker, Id));
    }
}