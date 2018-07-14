package com.wxy.data.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.Map;

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
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
/*
    @RequestMapping("/hello")
    public String home() {
        logger.info("hello world");
        return "Hello World springboot!";
    }
  */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("hello")
    public List<Map<String, Object>> hello() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT user FROM mysql.user ", new Object[]{});
        return list;
    }


}