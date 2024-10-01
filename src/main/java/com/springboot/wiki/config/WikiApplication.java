package com.springboot.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.lang.invoke.MethodHandles;

@ComponentScan({"com.springboot"})
//@ComponentScan({"com.springboot.wiki", "com.test"})
@SpringBootApplication
// Connect 持久层
@MapperScan("com.springboot.wiki.mapper")


public class WikiApplication {

	//    private static final Logger LOG = LoggerFactory.getLogger();
	private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	//    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);
	public static void main(String[] args) {
//        SpringApplication.run(WikiApplication.class, args);
		SpringApplication app = new SpringApplication(WikiApplication.class);
		Environment env = app.run(args).getEnvironment();
		LOG.info("Init successfully!");
		LOG.info("IP Address: \thttp://127.0.0.1:" + env.getProperty("server.port"));
	}

}
