package com.kaishui.springboottest2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kaishui.springboottest2.Controller.utils.R;
import com.kaishui.springboottest2.domain.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface BookMapper extends BaseMapper<Book> {
    @Select("select * from emp where dept_id in (select id from dept where name = '销售部' or name = '市场部') limit 0,10")//查全部
    List<Book> selectlist(@Param("id") int id);

    @Insert("INSERT INTO book (id, type, name) VALUES (#{id}, #{type},#{name})") //插入
    R insert(@Param("id") int id, @Param("type") String type, @Param("name") String name);

    @Update("UPDATE book SET type = #{type} ,name = #{name} WHERE id = #{id}")//修改
    int update(@Param("id") int id, @Param("type") String type, @Param("name") String name);

    @Delete("DELETE FROM book WHERE id = #{id}")//删除

    int delete(@Param("id") int id);

}
