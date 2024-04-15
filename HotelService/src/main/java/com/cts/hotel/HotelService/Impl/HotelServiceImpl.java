package com.cts.hotel.HotelService.Impl;
import com.cts.hotel.HotelService.Exception.ResourceNotFoundException;
import com.cts.hotel.HotelService.entities.Hotel;
import com.cts.hotel.HotelService.repositories.HotelRepository;
import com.cts.hotel.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String randomUserId = UUID.randomUUID().toString();
        hotel.setId(randomUserId);
        return hotelRepository.save(hotel);

    }

    @Override
    public List<Hotel> getAll() {
        return (List<Hotel>) hotelRepository.findAll();
    }

  /*  @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();;;
    }*/

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with given Id is not found on server !! :" + id));
    }


   /* @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel getById(String hotelId) {


        return hotelRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given Id is not found on server !! :" + userId));
    }

    @Override
    public Hotel create(Hotel hotel) {
        String randomUserId = UUID.randomUUID().toString();
        hotel.setUserId(randomUserId);
        return hotelRepository.save(hotel);
    }
    @Override
    public Hotel getAll() {
        return hotelRepository.findAll();
    }*/
}
