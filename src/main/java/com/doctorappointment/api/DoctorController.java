package com.doctorappointment.api;

import com.doctorappointment.model.Doctor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {




    @GetMapping("/")
    public String getDoctors(){
        return "hello doctor";
    }

   @PostMapping("/")
    public ResponseEntity<Doctor> RegisterDoctor(@RequestBody Doctor doctor){
        return ResponseEntity.ok().build();
    }
}
