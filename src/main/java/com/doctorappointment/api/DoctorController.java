package com.doctorappointment.api;

import com.doctorappointment.model.Doctor;

import com.doctorappointment.service.DoctorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorServiceImpl doctorService;


    @GetMapping("/")
    public ResponseEntity<List<Doctor>> getDoctors(){
        return ResponseEntity.ok(doctorService.getAllDoctors());
    }

   @PostMapping("/")
    public ResponseEntity<Doctor> RegisterDoctor(@RequestBody Doctor doctor){
        return ResponseEntity.ok(doctorService.registerADoctor(doctor));
    }
}
