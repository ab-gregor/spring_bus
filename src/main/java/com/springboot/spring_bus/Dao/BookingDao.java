package com.springboot.spring_bus.Dao;

import com.springboot.spring_bus.Schema.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingDao extends CrudRepository<Booking,Integer> {

}
