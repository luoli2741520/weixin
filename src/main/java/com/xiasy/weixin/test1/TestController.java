package com.xiasy.weixin.test1;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
    @GetMapping("hello")
    public String helloworld(){
        JSON.toJSONString("dd");
        return "HELLO world";
    }
}
