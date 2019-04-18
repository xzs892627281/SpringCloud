package com.cmhk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName DcController
 * @Description controller层，写明get和post的几种传参方式
 * @Author XuZhiSheng
 * @Date 2019-04-18
 * @Version 1.0
 **/
@RestController
public class DcController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/get")
    public String get(@RequestParam("a")String a,@RequestParam("b")String b) {
        System.out.println("===============进入consumer===============");
        return consumerService.get(a,b);
    }

    @PostMapping("/post")
    public String post(@RequestBody Map<String,Object> param) {
        System.out.println("===============进入consumer===============");
        return consumerService.post(param);
    }

}
