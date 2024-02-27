package com.joddee.joddee.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("Park")
public class ParkController {
    @GetMapping("allparks")
    public String getAllParks() {
        return new String("Get All Data Parks");
    }

}
