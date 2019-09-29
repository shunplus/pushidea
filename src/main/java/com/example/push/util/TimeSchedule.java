package com.example.push.util;

import com.example.push.service.PushService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class TimeSchedule {
    @Scheduled(fixedDelay = 1000 *10) //每5秒运行一次
    public void sendMessage(){
//        PushService.push("xuhsun","XINGE","spring boot");
//        PushService.push("xuhsun","ceshi","spring boot");
       String string= PushService.push("xuhsun","zhang","spring boot");
        System.out.print(" send "+string);
    }
}
