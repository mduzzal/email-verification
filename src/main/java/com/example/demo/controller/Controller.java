package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Uzzal on 4/8/2018.
 */
@RestController
public class Controller {
    @GetMapping("/admin/test")
    public String test(){
        return "hello admin.";
    }

    @GetMapping("/user/test")
    public String testuser(){
        return "hello user.";
    }
}
