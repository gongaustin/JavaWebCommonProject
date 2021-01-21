package com.austin.common.controller;

import com.austin.common.core.response.Result;
import org.springframework.stereotype.Controller;
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
    @GetMapping("")
    public Result test(){
        System.out.println("come on!");
        return Result.success("this is ok");
    }
}
