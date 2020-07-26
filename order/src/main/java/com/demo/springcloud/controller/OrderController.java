package com.demo.springcloud.controller;

import com.demo.springcloud.base.BaseResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/get/{id}")
    public BaseResp getId(@PathVariable("id") String id) {
        return restTemplate.getForObject("http://PAYMENT-SERVICE/payment/get/" + id, BaseResp.class);
    }


}
