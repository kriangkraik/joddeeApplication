package com.joddee.joddee.repository;

import com.joddee.joddee.entitys.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
