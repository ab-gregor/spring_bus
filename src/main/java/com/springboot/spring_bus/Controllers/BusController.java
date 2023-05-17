package com.springboot.spring_bus.Controllers;

import com.springboot.spring_bus.Services.BusService;
import com.springboot.spring_bus.Schema.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BusController {
    @Autowired
    private BusService busService;
    @PostMapping("/addBus")
    public String addBus(@RequestBody List<Bus> bus){
        return busService.addBus(bus);
    }
    @GetMapping("/getBuses")
    public List<Bus> getBuses(){
        return busService.getBuses();
    }

    @DeleteMapping("/removeBus/{bus_Number}")
    public String removeBus(@PathVariable int bus_Number){
        return busService.removeBus(bus_Number);
    }

    @PutMapping("/change")
    public String changeRoute(Bus bus){
        return busService.changeRoute(bus);
    }


}