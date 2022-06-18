package com.doctorappointment.service;

import com.doctorappointment.model.Patient;
import com.doctorappointment.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl {
    private final PatientRepository patientRepository;

    public Patient registerAPatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
    public Patient getOnePatient(Long id){
        return patientRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Cannot find Item by Id %s,id")));
    }
}
