package com.cts.hotel.HotelService.Exception;

import com.cts.hotel.HotelService.entities.Hotel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobleExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, Object>> notFoundhandler(ResourceNotFoundException ex){
        Map map= new HashMap<>();
        map.put("message",ex.getMessage());
        map.put("success",false);
        map.put("status", HttpStatus.NOT_FOUND);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);


    }
}
