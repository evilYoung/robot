package com.fourthis4.spider.robot;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScans(@MapperScan("com.fourthis4.spider.robot.generate.mapper"))
public class RobotApplication {

  public static void main(String[] args) {
    SpringApplication.run(RobotApplication.class, args);
  }

}
