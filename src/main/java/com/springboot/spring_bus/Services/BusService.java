package com.springboot.spring_bus.Services;

import com.springboot.spring_bus.Schema.Bus;

import java.util.List;

public interface BusService {
    String addBus(List<Bus> Buses);

    List<Bus> getBuses();
    String removeBus(int bus_number);
    String changeRoute(Bus bus);

}