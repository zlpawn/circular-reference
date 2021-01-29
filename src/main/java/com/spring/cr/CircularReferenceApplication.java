package com.spring.cr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
public class CircularReferenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircularReferenceApplication.class, args);
    }

}
