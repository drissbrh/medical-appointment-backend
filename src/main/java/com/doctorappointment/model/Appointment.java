package com.doctorappointment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Appointment {

    @Id
    private UUID reservationId=UUID.randomUUID();
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    private String startingHour;
    private LocalDateTime bookingDate;
    //private LocalDateTime createdAt;
}
