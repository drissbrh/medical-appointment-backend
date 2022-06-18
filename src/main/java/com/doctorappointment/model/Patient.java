package com.doctorappointment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    @Id
    @SequenceGenerator(
            name = "patient_sequence",
            sequenceName = "patient_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "patient_sequence"
    )
    private Long Id;

    private String name;

    private String email;

    private String password;
    private Boolean isPatient=true;
}
