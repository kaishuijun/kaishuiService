package com.kaishui.kaishuiservice.controller;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.google.gson.Gson;
import com.kaishui.kaishuiservice.bean.UserBean;
import com.kaishui.kaishuiservice.mapper.UserMapper;
import com.kaishui.kaishuiservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public String insterData(){
        UserBean userBean = new UserBean();
        userBean.setZhiyuanname("开水");
        userBean.setAge(20);
        userBean.setDept_id(1);
        userBean.setSalary(8000);
        userBean.setJob("总裁");
        userBean.setGender("男");
        userMapper.insert(userBean);
        return "successful";
    }
    @PutMapping
    public String upData(){
        UserBean userBean = new UserBean();
        userBean.setId(9);
        userBean.setZhiyuanname("白开水");
        userBean.setAge(25);
        userBean.setDept_id(2);
        userBean.setSalary(7500);
        userBean.setJob("总经理");
        userBean.setGender("男");
        userMapper.updateById(userBean);
        return "Success";
    }
    @DeleteMapping
    public String DeleteData(){
        UserBean userBean = new UserBean();
        userBean.setId(10);
        userMapper.deleteById(userBean);
        return "DeleteSuccessful";
    }

}
