package me.yoonhc.springbootstudy.controller;

import me.yoonhc.springbootstudy.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @Autowired
    public SampleService sampleService;

    @GetMapping("/hello2")
    public String hello(){
        return "hello " + sampleService.getName();
    }

    @GetMapping("/api-test")
    public String apiTest() throws InterruptedException {
        Thread.sleep(5000);
        return "apiTest " + sampleService.getName();
    }

    @GetMapping("/api-test2")
    public String apiTest2() throws InterruptedException {
        Thread.sleep(3000);
        return "apiTest2 " + sampleService.getName();
    }

}
