package com.roopy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

   @GetMapping(value = "/greeting")
    public String sayHello() {
       return "Hello World!";
   }

}
