package com.roytuts.email.service.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("email")
public class MyRunner3 implements CommandLineRunner {

    private String msg;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("From Email Service "+ msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
