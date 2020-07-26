package com.demo.springcloud.service;

import com.demo.springcloud.dao.PayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {

    @Autowired
    private PayDao payDao;

    public String getId(String id) {
        return payDao.get(id);
    }

}
