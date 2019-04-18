package com.cmhk;

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

    @GetMapping("/get")
    public String get(@RequestParam("a")String a,@RequestParam("b")String b) {
        String str = "已调用jar内方法:";
        System.out.println(str+"参数a:"+a+",参数b:"+b);
        return str;
    }

    @PostMapping("/post")
    public String post(@RequestBody Map<String,Object> param) {
        String str = "已调用jar内方法:";
        System.out.println(str+"参数:"+param);
        return str;
    }
}
