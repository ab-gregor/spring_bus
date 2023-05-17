package com.springboot.spring_bus.Services;

import com.springboot.spring_bus.Dao.BookingDao;
import com.springboot.spring_bus.Schema.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookingServiceImp implements BookingService{
    @Autowired
    private BookingDao bookingDao;
    @Override
    public String bookseat(List<Booking> bookings) {
        bookingDao.saveAll(bookings);
        return "Seat booked successfully";
    }

    @Override
    public List<Booking> get_ticket() {
        return (List<Booking>) bookingDao.findAll();
    }

    @Override
    public String delete(int booking_id) {
        bookingDao.deleteById(booking_id);
        return "Seat Cancelled";
    }
}
