package com.IDCard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * create by zhouchengchao on 2018/5/16
 */
@Controller
public class CenterController {

    @RequestMapping(value="/")
    public String say(){ return "index";}

    @RequestMapping(value="/index")
    public String index(){
        return "index";

    }




    @RequestMapping(value="/csstest")
    public String csstest(){
        return "csstest";
    }



}
