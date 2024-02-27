package com.joddee.joddee.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Car")
public class CarController {
    @GetMapping("allcars")
    public String getAllCars() {
        return new String("Get All Data Cars");
    }
}
