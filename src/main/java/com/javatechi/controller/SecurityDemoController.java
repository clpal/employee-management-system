package com.javatechi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {
    @GetMapping("/welcome")
    String welcome(){
        return "Welcome to java-techie online first class!";
    }
    @GetMapping("/text")
   public String greeting(){
        return "Happy to see you !";
    }
    @GetMapping("/nonsecure")
    public String nonSecure(){
        return "this is non secure home page able to access!";
    }
}
