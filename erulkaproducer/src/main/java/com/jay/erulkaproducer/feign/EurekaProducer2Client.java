package com.jay.erulkaproducer.feign;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jay
 * @description  这里测试feign 同时配置了熔断配置   熔断机制只会在client端有用
 * @date 2020/3/15 22:21
 */
@Component
@FeignClient(name="eureka-producer2",fallback = EurekaProducer2ClientHystrix.class)
//当其他模块崩了时，会出发熔断机制，返回fallback的默认数据
public interface EurekaProducer2Client {

    @GetMapping("/webApi/test/w0001")
    JSONObject testFeign(@RequestParam(name = "id") String id);
}
