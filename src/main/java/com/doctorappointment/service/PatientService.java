package com.doctorappointment.service;

import com.doctorappointment.model.Patient;
import com.doctorappointment.repository.PatientRepository;


import java.util.List;

public interface PatientService {
    Patient registerAPatient(Patient patient);

    List<Patient> getAllPatients();
    Patient getOnePatient(Long id);
}
