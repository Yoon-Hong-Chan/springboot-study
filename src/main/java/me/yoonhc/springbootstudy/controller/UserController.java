package me.yoonhc.springbootstudy.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import me.yoonhc.springbootstudy.domain.User;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public Resource<User> hello(){
        User user = new User();
        user.setUsername("yoonhc");
        user.setPassword("asdasdsa");
        Resource<User> userResource = new Resource<>(user);
        userResource.add(linkTo(methodOn(UserController.class).hello()).withSelfRel());
        return userResource;
    }

    @PostMapping("/users/create")
    public User create(@RequestBody User user){
        return user;
    }
}
