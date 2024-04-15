package com.cts.hotel.HotelService.repositories;

import com.cts.hotel.HotelService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotel,String> {
}
