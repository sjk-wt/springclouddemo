package com.lj.cloud.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientEurekaApplication.class, args);
  }
}
