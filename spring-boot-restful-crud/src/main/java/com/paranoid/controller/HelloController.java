package com.paranoid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Paranoid
 * @create 2019-12-12 9:46
 */
//@RestController
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

//    @RequestMapping({"/", "/index.html"})
//    public String index() {
//        return "index";
//    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("success", "成功啦!");
        return "success";
    }
}
