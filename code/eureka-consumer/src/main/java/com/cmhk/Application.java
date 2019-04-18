package com.cmhk;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName Application
 * @Description 具体业务应用 调用顺序为 gateway->consumer->client->jar
 * @Author XuZhiSheng
 * @Date 2019-04-18
 * @Version 1.0
 **/
@EnableSwagger2Doc//开启swagger
@SpringBootApplication
@EnableDiscoveryClient//开启注册服务客户端
@EnableCircuitBreaker//熔断器
public class Application {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).run(args);
	}

}
