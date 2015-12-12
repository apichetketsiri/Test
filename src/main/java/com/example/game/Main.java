package com.example.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Admin on 12/10/2015.
 */
@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class Main {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World! Jenkins";
    }
    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
