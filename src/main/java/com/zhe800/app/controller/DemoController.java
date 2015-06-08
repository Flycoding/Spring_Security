package com.zhe800.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/add")
    public void add() {
        System.out.println("add");
    }

    @RequestMapping("/update")
    public void update() {
        System.out.println("update");
    }
}
