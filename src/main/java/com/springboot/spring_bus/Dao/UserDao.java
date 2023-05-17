package com.springboot.spring_bus.Dao;

import com.springboot.spring_bus.Schema.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {
}
