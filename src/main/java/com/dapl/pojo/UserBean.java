package com.dapl.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserBean implements Serializable {
    private int user_id;
    private String name;
    private String phone;
    private int permission;
    private Date create_date;
    private Date update_date;
    private int sex;
    private String pwd;
}
