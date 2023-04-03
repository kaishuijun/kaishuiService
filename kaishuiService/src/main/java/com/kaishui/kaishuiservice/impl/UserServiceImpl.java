package com.kaishui.kaishuiservice.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaishui.kaishuiservice.bean.UserBean;
import com.kaishui.kaishuiservice.mapper.UserMapper;
import com.kaishui.kaishuiservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,UserBean> implements IUserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public boolean saveUser(UserBean userBean) {
        return userMapper.insert(userBean) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public boolean modify(UserBean userBean) {
        return false;
    }

    @Override
    public boolean insert(UserBean userBean) {
        return false;
    }

    @Override
    public UserBean getByid(Integer id) {
        return null;
    }

    @Override
    public List<UserBean> getAll() {
        return null;
    }

    @Override
    public IPage<UserBean> getPage(int currentPage, int pageSize) {
        return null;
    }
}
