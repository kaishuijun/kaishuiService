package com.kaishui.springboottest2.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @TableId(type = IdType.AUTO)    //设置自动增长
    private Integer id;
    private String zhiyuanname;
    private String age;
    private String deptid;
    private String name;
    private int salary;
    private String job;
    private Date entrydate;

//    public Book() {
//
//    }
}
