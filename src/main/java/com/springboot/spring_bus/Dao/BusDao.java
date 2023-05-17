package com.springboot.spring_bus.Dao;

import org.springframework.data.repository.CrudRepository;
import com.springboot.spring_bus.Schema.Bus;
public interface BusDao extends CrudRepository<Bus,Integer> {
}
