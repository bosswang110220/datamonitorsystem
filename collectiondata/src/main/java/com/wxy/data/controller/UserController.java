package com.wxy.data.controller;

import com.wxy.data.dao.UserMapper;
import com.wxy.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: WangYN
 * Date: 2018/7/12
 * Time: 23:18
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;



    @RequestMapping("/getUser")
    public String getUser(String username) {
        User user = userMapper.findUserByUsername(username);
        return user != null ? username + "的密码是：" + user.getUserName() : "不存在用户名为" + username + "的用户";
    }

    @RequestMapping("/updateUser")
    public String updateUser(String password, String username) {
        User user = new User(username, password);
        userMapper.updateUserByUsername(user);
        return "success!";
    }


    @RequestMapping("/addUser")
    public String addUser(String username, String password) {
        User user = new User(username, password);
        userMapper.saveUser(user);
        return "success!";
    }


    @RequestMapping("/deleteUser")
    public String deleteUser(String username) {
        userMapper.deleteUserByUsername(username);
        return "success!";
    }


    @RequestMapping("/getUserList")
    public List getUserList(String username, String password) {
        return userMapper.getUserList();
    }


}