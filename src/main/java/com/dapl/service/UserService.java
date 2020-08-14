package com.dapl.service;

import com.dapl.pojo.LoginLogBean;
import com.dapl.pojo.UserBean;

import java.util.List;
import java.util.Map;

public interface UserService {
    UserBean login(String name,String pwd);
    void addLog(LoginLogBean log);
    List<Map> findAll();
    Integer findById(int user_id);
    void insertIntegral(int id);
}
