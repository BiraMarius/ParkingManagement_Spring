package com.learning.parking_system_spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class CarDetails {
    @Id
    @GeneratedValue
    private Long id;
    private String registrationNo;
    private LocalDateTime entryTime;
    private int numberOfPassagers;


}
