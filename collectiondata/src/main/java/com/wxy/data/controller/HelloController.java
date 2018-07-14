package com.wxy.data.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created with IntelliJ IDEA.
 * User: WangYN
 * Date: 2018/7/12
 * Time: 22:18
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String home() {
        return "Hello World springboot!";
    }



}