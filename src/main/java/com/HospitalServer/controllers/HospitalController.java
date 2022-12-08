package com.HospitalServer.controllers;

import com.HospitalServer.model.dao.HospitalDAO;
import com.HospitalServer.model.pojo.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class HospitalController {
    @Autowired
    HospitalDAO hospitalDAO;
    @GetMapping("/getPatients")
    public List<Patient> getAllPatients() {
        return hospitalDAO.getAllPatients();
    }
    @PostMapping("/addPatient")
    public String addPatient(@RequestBody Patient P) {
        return hospitalDAO.addPatient(P);
    }
    @GetMapping("/getApplicationNo")
    public Integer getApplicationNo() {
       return hospitalDAO.getApplicationNo();
    }
}
