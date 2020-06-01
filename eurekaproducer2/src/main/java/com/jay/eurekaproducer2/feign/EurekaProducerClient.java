package com.jay.eurekaproducer2.feign;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jay
 * @description
 * @date 2020/3/15 22:21
 */
@Component
@FeignClient(name="eureka-producer")
public interface EurekaProducerClient {

    @GetMapping("/webApi/test/w0002")
    JSONObject testFeign(@RequestParam(name = "id") String id);
}
