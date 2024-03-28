package com.learning.parking_system_spring.controller;

import com.learning.parking_system_spring.dto.CarDetailsDto;
import com.learning.parking_system_spring.dto.TicketDetailsDto;
import com.learning.parking_system_spring.service.ParkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/park")
@RequiredArgsConstructor
public class ParkController {
    private final ParkService parkService;


    @GetMapping("/index")
    public String displayMessage(){
        String s = "Hello";
        return s;
    }

    @PostMapping("/open")
    public TicketDetailsDto open(@RequestBody CarDetailsDto carDetailsDto){
        return parkService.process(carDetailsDto);
    }


}
