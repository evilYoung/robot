package com.fourthis4.spider.robot.web;

import com.fourthis4.spider.robot.job.NetEasySpiderRobot;
import com.fourthis4.spider.robot.service.ScheduleConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetEasySpiderController {

  @Autowired
  private ScheduleConfigService scheduleConfigService;


  @RequestMapping("/neteasy/spider/add/{stockCode}")
  public String start(@PathVariable String stockCode){

    scheduleConfigService.addNetEasySpiderRobot(stockCode);

    return "ok";
  }


}
