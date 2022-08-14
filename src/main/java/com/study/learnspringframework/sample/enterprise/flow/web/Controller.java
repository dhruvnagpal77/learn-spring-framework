package com.study.learnspringframework.sample.enterprise.flow.web;

import com.study.learnspringframework.sample.enterprise.flow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller { // Responsible to sending response in right format

    @Autowired
    private BusinessService businessService;

    @GetMapping("/sum")
    public long displaySum(){
        return businessService.calculateSum();
    }
}