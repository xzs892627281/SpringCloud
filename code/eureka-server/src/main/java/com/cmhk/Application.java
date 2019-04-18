package com.cmhk;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName Application
 * @Description 服务注册中心服务端，可以启动多个形成集群
 * @Author XuZhiSheng
 * @Date 2019-04-18
 * @Version 1.0
 **/
@EnableEurekaServer//开启注册中心服务端
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).run(args);
	}

}
