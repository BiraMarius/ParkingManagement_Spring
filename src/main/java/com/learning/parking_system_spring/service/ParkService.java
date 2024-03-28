package com.learning.parking_system_spring.service;

import com.learning.parking_system_spring.dto.CarDetailsDto;
import com.learning.parking_system_spring.dto.TicketDetailsDto;
import com.learning.parking_system_spring.entity.CarDetails;
import com.learning.parking_system_spring.repository.CarDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParkService {
    private final CarDetailsRepository carDetailsRepository;

    public TicketDetailsDto process(CarDetailsDto carDetailsDto){
        //1 Transform DTO to entity
        //2 Call save from repository with entity
        carDetailsRepository.save(dtoToEntity(carDetailsDto));
        return null;
    }

    public TicketDetailsDto processs(CarDetailsDto carDetailsDto){

    }

    private CarDetails dtoToEntity(CarDetailsDto carDetailsDto){
        CarDetails car = new CarDetails();
        car.setEntryTime(carDetailsDto.getEntryTime());
        car.setRegistrationNo(carDetailsDto.getRegistrationNo());
        car.setNumberOfPassagers(carDetailsDto.getNumberOfPassagers());
        return car;
    }



}
