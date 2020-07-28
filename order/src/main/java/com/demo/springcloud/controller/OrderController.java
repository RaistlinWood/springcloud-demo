package com.demo.springcloud.controller;

import com.demo.springcloud.base.BaseResp;
import com.demo.springcloud.service.PaymentService;
import com.netflix.loadbalancer.RoundRobinRule;
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
    private PaymentService paymentService;

    @GetMapping("/order/get/{id}")
    public BaseResp getId(@PathVariable("id") String id) {
        return paymentService.getId(id);
    }


}
