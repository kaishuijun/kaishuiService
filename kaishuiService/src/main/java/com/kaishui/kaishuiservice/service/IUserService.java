package com.kaishui.kaishuiservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kaishui.kaishuiservice.bean.UserBean;

import java.util.List;

public interface IUserService  {
    boolean saveUser(UserBean userBean);
    boolean delete(Integer id);
    boolean modify(UserBean userBean);
    boolean insert(UserBean userBean);
    UserBean getByid(Integer id);
    List<UserBean> getAll();
    IPage<UserBean> getPage(int currentPage, int pageSize);

}
