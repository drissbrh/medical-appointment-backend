package com.doctorappointment.service;

import com.doctorappointment.model.Doctor;
import com.doctorappointment.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;


    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
