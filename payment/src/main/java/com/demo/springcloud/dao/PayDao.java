package com.demo.springcloud.dao;

import org.springframework.stereotype.Component;

@Component
public class PayDao {

    public String get(String id) {
        return id;
    }

}
