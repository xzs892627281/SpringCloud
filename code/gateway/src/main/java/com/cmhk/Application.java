package com.cmhk;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName Application
 * @Description 网关，路由转发，整合swagger文档，自定义过滤器
 * @Author XuZhiSheng
 * @Date 2019-04-18
 * @Version 1.0
 **/
@EnableDiscoveryClient//开启注册服务客户端
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).run(args);
	}
	//注入自定义过滤器
//	@Bean
//	public TokenFilter tokenFilter(){
//		return new TokenFilter();
//	}

}
