package com.demo.springcloud.controller;

import com.demo.springcloud.base.BaseResp;
import com.demo.springcloud.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping(value = "/payment/get/{id}")
    public BaseResp getId(@PathVariable("id") Long id) {
        log.info("pay get start:{}", id);
        try {
            BaseResp<String> base = new BaseResp<>();
            base.setCode(200);
            base.setMessage("success");
            base.setData(payService.getId(String.valueOf(id)));
            log.info("pay get end");
            return base;
        } catch (Exception e) {
            log.error("error:" + e);
        }
        return null;
    }

}
