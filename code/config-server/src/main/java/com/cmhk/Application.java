package com.cmhk;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName Application
 * @Description 配置中心服务端，可以启动多个形成集群
 * @Author XuZhiSheng
 * @Date 2019-04-18
 * @Version 1.0
 **/
@EnableDiscoveryClient//开启注册服务客户端
@EnableConfigServer//开启配置中心服务端
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).run(args);
	}

}
