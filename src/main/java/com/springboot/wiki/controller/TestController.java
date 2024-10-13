package com.springboot.wiki.controller;

import com.springboot.wiki.domain.Test;
import com.springboot.wiki.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {

    @Value("Hello4_from_GetMapping")
    private String testHello;

    @Resource
    private TestService testService;

    //@Resource
    //private TestService testService;

    @GetMapping("/hello")
    // Only support GET
    // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post, " + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() { return testService.list(); }

}
