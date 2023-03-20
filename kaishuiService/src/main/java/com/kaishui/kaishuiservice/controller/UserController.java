package com.kaishui.kaishuiservice.controller;

import com.google.gson.Gson;
import com.kaishui.kaishuiservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;
//    @Autowired
//    IUserService iUserService;
    private Gson gson = new Gson();

    @GetMapping
    public List selectAll(){
        return userMapper.selectlist(1);
    }
}
