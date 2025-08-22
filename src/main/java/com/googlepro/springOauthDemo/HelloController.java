package com.googlepro.springOauthDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String great(){
return "Welcome to Demo";
    }
}
