package com.example.demo.controller;

import com.example.demo.api.Result;
import com.example.demo.util.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    public Result test() throws Exception{
        String str = "程序猿最帅";
        return ResultUtil.success(str);
    }
}
