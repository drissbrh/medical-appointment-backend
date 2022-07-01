package com.doctorappointment.service;

import com.doctorappointment.model.Doctor;
import com.doctorappointment.model.Patient;

import javax.print.Doc;
import java.util.List;


public interface DoctorService {
    Doctor registerADoctor(Doctor doctor);
    Doctor loginDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();
    Doctor getOneDoctor(Long id);
}
