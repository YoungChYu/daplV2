package com.dapl.service.impl;

import com.dapl.dao.UserDao;
import com.dapl.pojo.LoginLogBean;
import com.dapl.pojo.UserBean;
import com.dapl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;
    @Override
    public UserBean login(String name, String pwd) {
        return dao.login(name,pwd);
    }
    @Override
    public void addLog(LoginLogBean log) {
        dao.addLog(log);
    }

    @Override
    public List<Map> findAll() {
        return dao.findAll();
    }

    @Override
    public Integer findById(int user_id) {
        return dao.findById(user_id);
    }
}
