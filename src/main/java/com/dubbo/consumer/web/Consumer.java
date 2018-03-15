                                                                                                                      package com.dubbo.consumer.web;

import java.io.Serializable;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.dubbo.api.UserService;


public class Consumer implements Serializable{
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        UserService demoService = (UserService) context.getBean("userService");
        // execute remote invocation
        String hello = demoService.sayHi("hi");
        // show the result
        System.out.println(hello);
    }
}