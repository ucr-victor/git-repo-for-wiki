package com.springboot.wiki.service;

import com.springboot.wiki.domain.Demo;
import com.springboot.wiki.mapper.DemoMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
