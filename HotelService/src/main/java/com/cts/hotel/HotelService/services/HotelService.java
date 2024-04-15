package com.cts.hotel.HotelService.services;

import com.cts.hotel.HotelService.entities.Hotel;
import com.cts.hotel.HotelService.repositories.HotelRepository;

import java.util.List;

public interface HotelService  {


    //Create
    Hotel create(Hotel hotel);


    //Get All
   List <Hotel> getAll();

   //Get by Id

    Hotel get(String id);
}
