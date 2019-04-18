package com.cmhk;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ConsumerService
 * @Description 具体调用方法 包括熔断降级 远程调用
 * @Author XuZhiSheng
 * @Date 2019-04-18
 * @Version 1.0
 **/
@Component
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackget")
    public String get(String a,String b) {
        System.out.println("进入get方法");
        Map<String,Object> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        String str = restTemplate.getForObject("http://eureka-client/get?a="+a+"&b="+b, String.class);
        str += restTemplate.getForObject("http://eureka-client/get?a={a}&b={b}", String.class,map);
        System.out.println("调用接口返回值"+str);
        return str;
    }
    @HystrixCommand(fallbackMethod = "fallbackpost")
    public String post(Map<String,Object> param){
        System.out.println("进入post方法");
        String str = restTemplate.postForObject("http://eureka-client/post",param,String.class);
        System.out.println("调用接口返回值"+str);
        return str;
    }

    public String fallbackget(String a,String b) {
        return "eureka-consumer:fallback";
    }

    public String fallbackpost(Map<String,Object> param) {
        return "eureka-consumer:fallback";
    }
}
