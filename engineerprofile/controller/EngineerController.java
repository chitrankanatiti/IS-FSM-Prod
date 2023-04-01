package com.hdsoft.fsm.engineerprofile.controller;

import com.hdsoft.fsm.engineerprofile.dto.EngineerConverter;
import com.hdsoft.fsm.engineerprofile.dto.EngineerDTO;
import com.hdsoft.fsm.engineerprofile.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/engineerprofile")
public class EngineerController { //calltracker

    @Autowired
    private EngineerService service;

    @PostMapping("/new")
    public long saveEngineerProfile(@RequestBody EngineerDTO data) {return service.save(EngineerConverter.convertToEngineerModel(data));}


    @GetMapping("/{id}")
    /*public EngineerDTO getEngineerProfile(@PathVariable("id") Long id){
        return EngineerConverter.convertToDTO(service.findAll().stream().filter(f->f.getid()==id).findFirst().get());
    }*/

    ///api/**/new

    public ResponseEntity<?> saveEngineer(@RequestBody EngineerDTO dto){
       long id;
       try {
           id = service.save(EngineerConverter.convertToEngineerModel(dto));
           return ResponseEntity.status(HttpStatus.ACCEPTED).body(id);
       }catch(Exception e){
          return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
       }
    }
}
