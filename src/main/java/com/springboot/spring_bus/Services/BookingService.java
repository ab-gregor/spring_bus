package com.springboot.spring_bus.Services;

import com.springboot.spring_bus.Schema.Booking;

import java.util.List;
public interface BookingService {

    String bookseat(List<Booking> bookings);

    List<Booking> get_ticket();
    String delete(int booking_id);
}
