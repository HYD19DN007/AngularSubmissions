package com.HospitalServer.model.repository;

import com.HospitalServer.model.pojo.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Patient, Long> {
}
