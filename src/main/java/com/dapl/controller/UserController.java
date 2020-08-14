package com.dapl.controller;

import com.dapl.pojo.LoginLogBean;
import com.dapl.pojo.UserBean;
import com.dapl.service.UserService;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService service;
    @Autowired
    LoginLogBean log;
    @PostMapping("/login")
    @ResponseBody
    public UserBean login(String name,String pwd){
        UserBean user=service.login(name,pwd);
        if(user!=null){
            log.setUser_id(user.getUser_id());
            log.setLogin_ip("127.0.0.1");
            Date date=new Date();
            SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            log.setLogin_date(s.format(date));
            service.addLog(log);
        }
        return user;
    }
    @PostMapping("/log")
    @ResponseBody
    public List<Map> findAll(){
        List<Map> list=service.findAll();
        System.out.println(list);
        return list;
    }
    @PostMapping("/sign")
    @ResponseBody
    public boolean sign(){
        Integer integer=service.findById(1);
        if(integer!=null){

            return true;
        }
        return false;
    }
}
