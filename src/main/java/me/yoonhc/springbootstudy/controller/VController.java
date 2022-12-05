package me.yoonhc.springbootstudy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name","yoonhc");
        return "hello";
    }

}
