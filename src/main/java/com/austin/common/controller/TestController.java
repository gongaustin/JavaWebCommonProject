package com.austin.common.controller;

import com.austin.common.core.bean.Result;
import com.austin.common.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:前端控制器
 * @Author: GongJun
 * @Date: Created in 16:56 2021/1/18
 */
@RestController
@RequestMapping("/")

public class TestController {
    @Autowired
    ITestService service;


    @GetMapping("")
    public Result defaultMethod(){
        System.out.println("come on!");
        return Result.success("this is ok");
    }

    @GetMapping("/test")
    public Result test(String s){
        String data = this.service.getMessage(s);
        return Result.success(data);
    }
}
