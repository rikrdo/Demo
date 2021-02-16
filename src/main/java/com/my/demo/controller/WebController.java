package com.my.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/demo")
    public String demo() {

        sumaTest(1,2);
        return "demo";
    }

    public int sumaTest(int a, int b){
        return a-b;
    }


}