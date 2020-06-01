package com.jay.eurekaproducer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Eurekaproducer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaproducer2Application.class, args);
    }

}
