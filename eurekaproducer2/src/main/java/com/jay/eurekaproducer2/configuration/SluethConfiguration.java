package com.jay.eurekaproducer2.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancerExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author jay
 * @description
 * @date 2020/3/28 12:40
 */
//@Configuration
public class SluethConfiguration {
    @Autowired
    private LoadBalancerExchangeFilterFunction loadBalancerExchangeFilterFunction;
    @Bean
    public WebClient webClient(){
        return WebClient.builder().baseUrl("http://eureka-producer").
                filter(loadBalancerExchangeFilterFunction).
                build();
    }
}
