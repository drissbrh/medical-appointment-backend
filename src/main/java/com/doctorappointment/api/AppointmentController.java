package com.doctorappointment.api;

import com.doctorappointment.model.Appointment;
import com.doctorappointment.service.AppointmentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appts")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentServiceImpl appointmentService;

    @PostMapping("/")
    public ResponseEntity<Appointment> addNewAppointment(@RequestBody Appointment appointment){
        return ResponseEntity.ok(appointmentService.addAppointment(appointment));
    }

    @GetMapping("/")
    public ResponseEntity<List<Appointment>> getAllAppts(){
        return ResponseEntity.ok(appointmentService.getAllAppointments());
    }
}
