package com.austin.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:启动器Starter
 * @Author: GongJun
 * @Date: Created in 11:16 2021/1/18
 * */
//@SpringBootApplication已经包括@ComponentScan和@EnableAutoConfiguration,单独写出来声明Package后则@SpringBootApplication中的就会失效
@ComponentScan({"com.austin.common.mapper"})
@SpringBootApplication
public class CommonApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(CommonApplicationStarter.class);
    }
}
