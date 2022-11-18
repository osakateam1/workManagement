package com.example.demo;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@RestController
//@EnableAutoConfiguration
@Controller 
public class HelloController {

  @GetMapping("/")
    String home() {
      return "login";
       // return "Hello World";
    }
}