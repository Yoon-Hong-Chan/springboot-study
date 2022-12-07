package me.yoonhc.springbootstudy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","yoonhc");
        model.addAttribute("age","35");
        return "hello";
    }

    @GetMapping("/errorTest")
    public String errorTest(Model model){
        model.addAttribute("name","yoonhc");
        model.addAttribute("age","35");
        return "hello";
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody String sampleError(Exception e){
        return e.getMessage();
    }
}
