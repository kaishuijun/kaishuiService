package com.kaishui.kaishuiservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaishui.kaishuiservice.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<UserBean> {
    @Select("select * from emp limit 0,10")//查全部
    List<UserBean> selectlist(@Param("id") int id);

}
