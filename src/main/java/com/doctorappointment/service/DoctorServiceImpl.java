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
    public Doctor registerADoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public Doctor loginDoctor(Doctor doctor) {
        return null;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getOneDoctor(Long id) {
        return doctorRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Cannot find doctor by Id %s,id")));
    }
}
