package com.paranoid.controller;

/**
 * @author Paranoid
 * @create 2019-12-03 10:42
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Controller: HelloController能够处理请求应标注@Controller注解
 */
@Controller
public class HelloController {

    /**
     * @RequestMapping("/hello"): 表示 hello()方法处理的是/hello请求，并返回“Hello”给浏览器，
     *                             但是如果想返回给浏览器，还需要@ResponseBody
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
