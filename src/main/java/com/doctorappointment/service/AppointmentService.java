package com.doctorappointment.service;

import com.doctorappointment.api.AppointmentController;
import com.doctorappointment.model.Appointment;

import java.util.List;
import java.util.UUID;

public interface AppointmentService {
    Appointment addAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
    Appointment getOneAppointment(UUID id);
}
