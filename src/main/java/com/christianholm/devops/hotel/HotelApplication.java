package com.christianholm.devops.hotel;

import com.christianholm.devops.hotel.data.enitity.Guest;
import com.christianholm.devops.hotel.data.enitity.Reservation;
import com.christianholm.devops.hotel.data.enitity.Room;
import com.christianholm.devops.hotel.data.repository.GuestRepository;
import com.christianholm.devops.hotel.data.repository.ReservationRepository;
import com.christianholm.devops.hotel.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class, args);
    }



}
