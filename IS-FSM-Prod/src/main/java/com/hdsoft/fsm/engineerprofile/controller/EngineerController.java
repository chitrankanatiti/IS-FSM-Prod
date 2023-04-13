package com.hdsoft.fsm.engineerprofile.controller;

import com.hdsoft.fsm.engineerprofile.mapper.EngineerMapper;
import com.hdsoft.fsm.engineerprofile.dto.EngineerDTO;
import com.hdsoft.fsm.engineerprofile.model.Engineer;
import com.hdsoft.fsm.engineerprofile.service.EngineerService;
import com.hdsoft.fsm.utils.ExceptionHandler;
import com.hdsoft.fsm.utils.Message;
import com.hdsoft.fsm.utils.SortingOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/engineerprofile")
public class EngineerController {


    @Autowired
    private EngineerService engineerService;

    @Autowired
    private EngineerMapper mapper;

    public EngineerController(EngineerService engineerService, EngineerMapper mapper) {
        this.engineerService = engineerService;
        this.mapper = mapper;
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveEngineer(@RequestBody EngineerDTO dto) {
        try {
            Engineer entity = mapper.asEntity(dto);
            Engineer saved = engineerService.save(entity);

            return ResponseEntity.ok(mapper.asDTO(saved));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @PostMapping("/save/list")
    public ResponseEntity<?> saveEngineerList(@RequestBody List<EngineerDTO> dtos) {
        try {
            List<Engineer> entities = mapper.asEntityList(dtos);
            List<Engineer> saved = engineerService.save(entities);

            return ResponseEntity.ok(mapper.asDTOList(saved));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateEngineer(@RequestBody EngineerDTO dto) {
        try {
            Engineer entity = mapper.asEntity(dto);

            if (engineerService.update(entity)) {
                return ResponseEntity.ok(new Message("Data updated successfully", HttpStatus.OK));
            } else {
                return ResponseEntity.badRequest().body(new Message("Data update failed", HttpStatus.BAD_REQUEST));
            }
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteEngineer(@RequestBody EngineerDTO dto) {
        try {
            Engineer entity = mapper.asEntity(dto);

            if (engineerService.delete(entity)) {
                return ResponseEntity.ok(new Message("Data deleted successfully", HttpStatus.OK));
            } else {
                return ResponseEntity.badRequest().body(new Message("Data deletion failed", HttpStatus.BAD_REQUEST));
            }
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEngineerById(@PathVariable("id") Long id) {
        try {
            if (engineerService.deleteById(id)) {
                return ResponseEntity.ok(new Message("Data deleted successfully", HttpStatus.OK));
            } else {
                return ResponseEntity.badRequest().body(new Message("Data deletion failed", HttpStatus.BAD_REQUEST));
            }
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findEngineerById(@PathVariable("id") Long id) {
        try {
            Optional<Engineer> engineer = engineerService.findById(id);

            if (engineer.isPresent()) {
                return ResponseEntity.ok(mapper.asDTO(engineer.get()));
            } else {
                return ResponseEntity.badRequest().body(new Message("Engineer Not Found", HttpStatus.BAD_REQUEST));
            }
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/list")
    public ResponseEntity<?> findAllEngineers() {
        try {
            List<Engineer> engineers = engineerService.findAll();

            List<EngineerDTO> engineerDTOList = mapper.asDTOList(engineers);
            return ResponseEntity.ok(engineerDTOList);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/count")
    public ResponseEntity<?> countEngineers() {
        try {
            return ResponseEntity.ok(engineerService.count());
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/exists/{id}")
    public ResponseEntity<?> existsEngineerById(@PathVariable("id") Long id) {
        try {
            boolean exists = engineerService.existsById(id);
            if (exists) {
                return ResponseEntity.ok(new Message("Engineer Found", HttpStatus.OK));
            } else {
                return ResponseEntity.badRequest().body(new Message("Engineer Not Found", HttpStatus.BAD_REQUEST));
            }
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<?> findEngineersByName(@PathVariable("name") String name) {
        try {
            List<Engineer> engineers = engineerService.findByName(name);

            List<EngineerDTO> engineerDTOList = mapper.asDTOList(engineers);
            return ResponseEntity.ok(engineerDTOList);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/search/phoneno/{phoneno}")
    public ResponseEntity<?> findEngineersByContact(@PathVariable("phoneno") String phoneNo) {
        try {
            List<Engineer> engineers = engineerService.findByPhoneNo(phoneNo);

            List<EngineerDTO> engineerDTOList = mapper.asDTOList(engineers);
            return ResponseEntity.ok(engineerDTOList);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/search/alternate-phoneno/{altphoneno}")
    public ResponseEntity<?> findEngineersByAltPhoneNo(@PathVariable("altphoneno") String altPhoneNo) {
        try {
            List<Engineer> engineers = engineerService.findByAltPhoneNo(altPhoneNo);

            List<EngineerDTO> engineerDTOList = mapper.asDTOList(engineers);
            return ResponseEntity.ok(engineerDTOList);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/search/email/{emailId}")
    public ResponseEntity<?> findEngineersByEmailId(@PathVariable("emailId") String emailId) {
        try {
            List<Engineer> engineers = engineerService.findByEmailId(emailId);

            List<EngineerDTO> engineerDTOList = mapper.asDTOList(engineers);
            return ResponseEntity.ok(engineerDTOList);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/tech-id/{techId}")
    public ResponseEntity<?> findEngineerByTechId(@PathVariable("techId") String techId) {
        try {
            Optional<Engineer> engineer = engineerService.findByTechId(techId);

            if (engineer.isPresent()) {
                return ResponseEntity.ok(mapper.asDTO(engineer.get()));
            } else {
                return ResponseEntity.badRequest().body(new Message("Engineer Not Found", HttpStatus.BAD_REQUEST));
            }
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/search/date-creation/{date}")
    public ResponseEntity<?> findEngineersByDateOfCreation(@PathVariable("date") String dateOfCreation) {
        try {
            List<Engineer> engineers = engineerService.findByDateOfCreation(dateOfCreation);

            List<EngineerDTO> engineerDTOList = mapper.asDTOList(engineers);
            return ResponseEntity.ok(engineerDTOList);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/unique-id/{id}")
    public ResponseEntity<?> findEngineerByUniqueId(@PathVariable("id") String uniqueId) {
        try {
            Optional<Engineer> engineer = engineerService.findByUniqueId(uniqueId);

            if (engineer.isPresent()) {
                return ResponseEntity.ok(mapper.asDTO(engineer.get()));
            } else {
                return ResponseEntity.badRequest().body(new Message("Engineer Not Found", HttpStatus.BAD_REQUEST));
            }
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/search")
    public ResponseEntity<?> findEngineersByDate(@RequestParam("start") String startDate, @RequestParam("end") String endDate) {
        try {
            List<Engineer> engineers = engineerService.findByDate(startDate, endDate);

            List<EngineerDTO> engineerDTOList = mapper.asDTOList(engineers);
            return ResponseEntity.ok(engineerDTOList);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/count/{start}/{end}")
    public ResponseEntity<?> countEngineersByDate(@PathVariable("start") String startDate, @PathVariable("end") String endDate) {
        try {
            return ResponseEntity.ok(engineerService.countByDate(startDate, endDate));
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(com.hdsoft.fsm.utils.ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }

    @GetMapping("/list/{sort}")
    public ResponseEntity<?> findAllEngineersSorted(@PathVariable("sort") SortingOrder order) {
        try {
            List<Engineer> engineers = engineerService.findAllSorted(order);

            List<EngineerDTO> engineerDTOList = mapper.asDTOList(engineers);
            return ResponseEntity.ok(engineerDTOList);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body(new Message(ExceptionHandler.getException(ex), HttpStatus.BAD_REQUEST));
        }
    }
}
