package com.dubbo.consumer.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.api.UserService;

@Controller
public class UserController{

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(String name) {
        String welcome = userService.sayHi(name);
        return welcome;
    }
}