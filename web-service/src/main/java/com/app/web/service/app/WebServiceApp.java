package com.app.web.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.app")
public class WebServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApp.class, args);
	}

}
