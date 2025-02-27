package com.ethandep0.practicum2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practicum2Application {
    public static void main(String[] args) {
        System.setProperty("debug", "true"); 
        SpringApplication.run(Practicum2Application.class, args);
    }
}
