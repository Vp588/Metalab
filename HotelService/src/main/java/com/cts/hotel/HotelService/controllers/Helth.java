package com.cts.hotel.HotelService.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class Helth {
    @RequestMapping("/pkkk")
    public String helthCheck() {

        return "Ok";
    }
}