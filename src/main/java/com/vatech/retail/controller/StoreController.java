package com.vatech.retail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {

    @GetMapping("/home")
    public String getHomeContent(){
        return "Welcome to my home page";
    }


}
