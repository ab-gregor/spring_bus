package com.springboot.spring_bus.Services;

import com.springboot.spring_bus.Dao.UserDao;
import com.springboot.spring_bus.Schema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
@Component

public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public String addUser(List<User> Users) {
        userDao.saveAll(Users);
        return "User added";
    }

    @Override
    public Optional<User> getUser(int user_id) {

        return userDao.findById(user_id);
    }

    @Override
    public String deleteUser(int user_id) {
        userDao.deleteById(user_id);
        return "User deleted";
    }
}