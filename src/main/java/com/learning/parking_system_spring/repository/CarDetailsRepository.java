package com.learning.parking_system_spring.repository;

import com.learning.parking_system_spring.entity.CarDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDetailsRepository extends JpaRepository<CarDetails, Long> {


}
