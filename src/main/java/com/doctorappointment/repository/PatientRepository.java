package com.doctorappointment.repository;

import com.doctorappointment.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PatientRepository extends JpaRepository<Patient,Long> {
}
