package com.example.springdemo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class TestController {

    @GetMapping(path = "/hello")
    public String sayHello() {return "Hello, World!";}

   // @PostMapping()
    //public String helloWorld() { return "Hello, World!";}



}
