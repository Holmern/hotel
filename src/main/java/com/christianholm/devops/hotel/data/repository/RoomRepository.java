package com.christianholm.devops.hotel.data.repository;


import com.christianholm.devops.hotel.data.enitity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
