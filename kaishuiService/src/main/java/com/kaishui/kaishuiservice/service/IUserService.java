package com.kaishui.kaishuiservice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kaishui.kaishuiservice.bean.UserBean;

public interface IUserService  {
    Boolean delete(Integer id);
    Boolean modify(UserBean userBean);
    Boolean insert(UserBean userBean);
    UserBean get(Integer id);
    IPage<UserBean> getPage(int currentPage, int pageSize);
}
