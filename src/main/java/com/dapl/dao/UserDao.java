package com.dapl.dao;

import com.dapl.pojo.LoginLogBean;
import com.dapl.pojo.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    UserBean login(String name,String pwd);
    void addLog(LoginLogBean log);
    List<Map> findAll();
    Integer findById(int user_id);
    void insertIntegral(int id);
}
