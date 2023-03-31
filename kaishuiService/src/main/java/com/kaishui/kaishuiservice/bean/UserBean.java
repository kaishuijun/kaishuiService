package com.kaishui.kaishuiservice.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("emp")
public class UserBean {
    private int id;
    private String zhiyuanname;
    private int age;
    private int dept_id;
    private int salary;
    private String job;
    private Date entrydate;
    private String gender;

}
