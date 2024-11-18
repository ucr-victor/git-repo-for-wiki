package com.springboot.wiki.controller;

import com.springboot.wiki.domain.Demo;
import com.springboot.wiki.domain.Test;
import com.springboot.wiki.mapper.DemoMapper;
import com.springboot.wiki.service.DemoService;
import com.springboot.wiki.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/demo")

public class DemoController {

    @Resource
    private DemoMapper demoMapper;

    @GetMapping("/list")
    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }

}
