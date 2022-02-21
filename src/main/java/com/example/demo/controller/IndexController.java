package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    @RequestMapping("/index")
    public Map index(){
        Map map=new HashMap();
        map.put("name","一只流浪的KK");
        map.put("type","公猿");
        map.put("sex","male");
        return  map;
    }
}

