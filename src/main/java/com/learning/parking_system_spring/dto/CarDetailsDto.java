package com.learning.parking_system_spring.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CarDetailsDto {
    private String registrationNo;
    private LocalDateTime entryTime;
    private int numberOfPassagers;
}
