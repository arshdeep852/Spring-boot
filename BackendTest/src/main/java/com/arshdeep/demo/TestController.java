package com.arshdeep.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller@ResponseBody
public class TestController {


        @RequestMapping("/test")
    public String firstHandler(){
        return  "hello";
    }
}
