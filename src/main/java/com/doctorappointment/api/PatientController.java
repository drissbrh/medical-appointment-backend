package com.doctorappointment.api;

import com.doctorappointment.model.Patient;
import com.doctorappointment.service.PatientServiceImpl;
import lombok.RequiredArgsConstructor;

import org.hibernate.mapping.Any;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients/")
@RequiredArgsConstructor
public class PatientController {

    private final PatientServiceImpl patientService;

    @GetMapping("/")
    public ResponseEntity<List<Patient>> getPatients(){
        return ResponseEntity.ok(patientService.getAllPatients());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("id") Long id){
        return ResponseEntity.ok(patientService.getOnePatient(id));
    }

    @PostMapping("/")
    public ResponseEntity<Patient> RegisterPatient(@RequestBody Patient patient){
        return ResponseEntity.ok(patientService.registerAPatient(patient));
    }

    @DeleteMapping("/{id}")
    public void DeletePatient(@PathVariable("id") Long id){
        ResponseEntity.ok().build();
    }
}
