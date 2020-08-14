package com.dapl.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class LoginLogBean {
    private int log_id;
    private String login_date;
    private String login_ip;
    private int user_id;
}
