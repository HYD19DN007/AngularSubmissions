package com.HospitalServer.model.dao;

import com.HospitalServer.model.pojo.Patient;
import com.HospitalServer.model.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class HospitalDAO implements IHospitalDAO {
    @Autowired
    HospitalRepository hospitalRepository;

    @Override
    public List<Patient> getAllPatients() {
        return hospitalRepository.findAll();
    }
    @Override
    public String addPatient(Patient P) {
        hospitalRepository.save(P);
        return "Patient created";
    }
    @Override
    public Integer getApplicationNo() {
        List<Patient> patientList = hospitalRepository.findAll();
        if (patientList.isEmpty()) {
            return 0;
        }
        else {
            return patientList.stream().max(Comparator.comparing(Patient::getApplicationNo)).stream().toList().get(0).getApplicationNo();
        }
    }
}
