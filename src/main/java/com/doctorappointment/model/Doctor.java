package com.doctorappointment.model;

import com.doctorappointment.enums.City;
import com.doctorappointment.enums.Speciality;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor {
    @Id
    @SequenceGenerator(
            name = "_sequence",
            sequenceName = "doctor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "doctor_sequence"
    )
    private Long Id;
    @Column(name="name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "address")
    private String address;
    @Enumerated(EnumType.STRING)
    @Column(name = "city")
    private City City;
    @Enumerated(EnumType.STRING)
    @Column(name = "speciality")
    private Speciality speciality;

}
