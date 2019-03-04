package com.example.spring.springdemo.controller;

import com.example.spring.springdemo.entity.User;
import com.example.spring.springdemo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhizhao.zhang on 2019/02/23 21:41.
 * Description:
 */
@RestController
public class PingController {

    @Autowired
    private UserRepository repository;

    @RequestMapping("ping")
    public Object ping() {
        return repository.findOne(Example.of(new User(null, "b")));
    }

    @RequestMapping("name")
    public Object name(String name) {
        return repository.findAllByIdAndNameOrderByName(name);
    }
}
