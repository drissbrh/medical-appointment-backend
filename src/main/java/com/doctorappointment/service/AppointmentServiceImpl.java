package com.doctorappointment.service;

import com.doctorappointment.model.Appointment;
import com.doctorappointment.repository.AppointmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService{
    private final AppointmentRepository appointmentRepository;

    @Override
    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getOneAppointment(UUID id) {
        return appointmentRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Cannot find appt by Id %s,id")));
    }
}
