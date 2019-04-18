package com.cmhk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName TurbineApplication
 * @Description turbine收集hystrix数据，使用消息队列收集
 * @Author XuZhiSheng
 * @Date 2019-04-18
 * @Version 1.0
 **/
@Configuration
@EnableAutoConfiguration
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineApplication.class, args);
	}

}
