package com.example.push.controller;

import com.example.push.entity.Data;
import com.example.push.entity.Info;
import com.example.push.service.PushService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@EnableScheduling
public class ApiController {

    @GetMapping(value = "/test")
    public Data get(Info info) {
        return new Data().setResult("sucess");
    }

    @PostMapping(value = "/test", produces = "application/json;charset=UTF-8")
    public String post(String id) {
        if (id.equals("520")){
            return PushService.push("xuhshun","199884847","ceshi");
        }else {
            return "";
        }
    }

    @PostMapping(value = "/login", produces = "application/json;charset=UTF-8")
    public String post(String id,String type) {


      return  "";
    }

}
