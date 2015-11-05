package com.anthem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mangofactory.swagger.plugin.EnableSwagger;

@SpringBootApplication
@EnableSwagger
public class BrokerposApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrokerposApplication.class, args);
    }
    
   
}
