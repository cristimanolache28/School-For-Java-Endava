package com.endava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


@SpringBootConfiguration
@EnableAutoConfiguration
public class SpringBootContextApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootContextApp.class, args);
    }
}
