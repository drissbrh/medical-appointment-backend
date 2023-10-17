package com.doctorappointment.service;

import com.doctorappointment.model.Patient;
import com.doctorappointment.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Boolean.TRUE;

@Service
@RequiredArgsConstructor
@Slf4j
public class PatientServiceImpl implements PatientService{
    private final PatientRepository patientRepository;

    @Override
    public Patient registerAPatient(Patient patient){
        log.info("Creating new patient account: {}",patient.getName());
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatients(){
        log.info("Fetching all patients: {}");
        return patientRepository.findAll();
    }

    @Override
    public Patient getOnePatient(Long id){
        log.info("Fetching a patient by id: {}",id);
        return patientRepository.findById(id).get();
    }

    @Override
    public Boolean deletePatient(Long id) {
        log.info("Deleting server by ID:{}",id);
        patientRepository.deleteById(id);
        return TRUE;
    }}
