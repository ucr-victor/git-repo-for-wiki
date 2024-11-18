package com.springboot.wiki.controller;

import com.springboot.wiki.domain.Demo;
import com.springboot.wiki.domain.Ebook;
import com.springboot.wiki.mapper.DemoMapper;
import com.springboot.wiki.mapper.EbookMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/ebook")

public class EbookController {

    @Resource
    private EbookMapper ebookMapper;

    @GetMapping("/list")
    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }

}
