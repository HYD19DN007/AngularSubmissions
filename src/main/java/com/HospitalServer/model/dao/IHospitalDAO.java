package com.HospitalServer.model.dao;

import com.HospitalServer.model.pojo.Patient;

import java.util.List;

public interface IHospitalDAO {
    List<Patient> getAllPatients();

    String addPatient(Patient P);

    Integer getApplicationNo();
}
