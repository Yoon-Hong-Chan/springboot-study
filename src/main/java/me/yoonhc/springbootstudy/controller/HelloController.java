package me.yoonhc.springbootstudy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/helloTest")
    public String Hello(){
        return "hello";
    }
}
