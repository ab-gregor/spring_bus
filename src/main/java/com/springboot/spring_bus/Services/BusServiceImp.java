package com.springboot.spring_bus.Services;

import com.springboot.spring_bus.Dao.BusDao;
import com.springboot.spring_bus.Schema.Bus;
import com.springboot.spring_bus.Dao.BusDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BusServiceImp implements BusService{
    @Autowired
    private BusDao busDao;
    @Override
    public String addBus(List<Bus> Buses) {
        busDao.saveAll(Buses);
        return "Bus added ";
    }

    @Override
    public List<Bus> getBuses() {
        return (List<Bus>) busDao.findAll();
    }

    @Override
    public String removeBus(int bus_number) {
        busDao.deleteById(bus_number);
        return "Bus removed ";
    }

    @Override
    public String changeRoute(Bus bus) {
        busDao.save(bus);
        return "Route Updated";
    }
}