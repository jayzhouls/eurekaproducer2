package com.jay.eurekaproducer2.rest;

import com.alibaba.fastjson.JSONObject;
import com.jay.eurekaproducer2.feign.EurekaProducerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author jay
 * @description
 * @date 2020/3/15 22:14
 */
@RestController
@RequestMapping("/webApi/test")
public class TestResource {
    @GetMapping("/w0001")
    public JSONObject testFeign(@RequestParam String id) {
        JSONObject result = new JSONObject();
        result.put("jay","the best singer");
        return result;
    }

    @Autowired
    private EurekaProducerClient eurekaProducerClient;

    @GetMapping("/w0002")
    public JSONObject testFeignRibbon(@RequestParam String id) {
        JSONObject result = eurekaProducerClient.testFeign("1");
        result.put("jay","the best singer");
        return result;
    }
}
