package com.zhi.springboot.controller;

import com.zhi.springboot.entity.User;
import com.zhi.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User one = userRepository.findOne(id);
        return one;
    }

    @GetMapping("/user")
    public User insertUser(User user){
        User save = userRepository.save(user);
        return save;
    }

    @GetMapping("/add")
    public User addUser(){
        User user = new User();
        user.setLastName("大智智");
        user.setEmail("147258369@qq.com");
        User save = userRepository.save(user);
        return save;
    }
}
