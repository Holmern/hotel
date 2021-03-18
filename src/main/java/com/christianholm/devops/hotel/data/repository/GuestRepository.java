package com.christianholm.devops.hotel.data.repository;


import com.christianholm.devops.hotel.data.enitity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
