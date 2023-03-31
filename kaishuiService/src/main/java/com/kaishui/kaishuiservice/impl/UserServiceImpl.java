package com.kaishui.kaishuiservice.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kaishui.kaishuiservice.bean.UserBean;
import com.kaishui.kaishuiservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserBean userBean;
    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Boolean modify(UserBean userBean) {
        return null;
    }

    @Override
    public Boolean insert(UserBean userBean) {
        return null;
    }

    @Override
    public UserBean get(Integer id) {
        return null;
    }

    @Override
    public IPage<UserBean> getPage(int currentPage, int pageSize) {
        return null;
    }
}
