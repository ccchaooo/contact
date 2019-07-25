package com.example.server.controller;

import com.example.server.entity.Result;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author dengchao
 * @date 2019/7/25 23:30
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping("/home")
    public Result home(){
        Result result = new Result();
        result.setNumber(11111);
        result.setName("zhangsan");
        return result;
    }
}
