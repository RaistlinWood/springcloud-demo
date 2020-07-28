package com.demo.springcloud.service;

import com.demo.springcloud.base.BaseResp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "payment-service" )
public interface PaymentService {

    @GetMapping(value = "/payment/get/{id}")
    public BaseResp getId(@PathVariable("id") String id);

}
