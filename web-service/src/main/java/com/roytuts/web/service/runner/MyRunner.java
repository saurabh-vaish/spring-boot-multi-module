package com.roytuts.web.service.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("web")
public class MyRunner implements CommandLineRunner {

    private String msg;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("From Web Service "+ msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
