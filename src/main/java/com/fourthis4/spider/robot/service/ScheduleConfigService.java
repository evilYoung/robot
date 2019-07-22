package com.fourthis4.spider.robot.service;


import com.fourthis4.spider.robot.job.NetEasySpiderRobot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

@Service
public class ScheduleConfigService {

  @Autowired
  private NetEasySpiderRobot netEasySpiderRobot = new NetEasySpiderRobot();

  @Autowired
  private ThreadPoolTaskScheduler threadPoolTaskScheduler;

  public void addNetEasySpiderRobot(String stockCode) {

    threadPoolTaskScheduler.schedule(() -> netEasySpiderRobot.run(stockCode),new CronTrigger("*/1 * * * * *"));
  }
}
