package com.boracodar.soulcode.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/index")

public class Adriano {
    @GetMapping("/")

    public String index(){
        return "Douglas e um lindo";
    }


}
